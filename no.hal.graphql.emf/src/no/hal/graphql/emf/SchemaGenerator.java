package no.hal.graphql.emf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

import graphql.Scalars;
import graphql.TypeResolutionEnvironment;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLOutputType;
import graphql.schema.GraphQLSchema;
import graphql.schema.GraphQLSchema.Builder;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLTypeReference;
import graphql.schema.TypeResolver;

public class SchemaGenerator {
	
	private final Collection<EPackage> packages;

	public SchemaGenerator(Collection<EPackage> packages) {
		this.packages = new ArrayList<>(packages);
	}

	public SchemaGenerator(EPackage... packages) {
		this(Arrays.asList(packages));
	}

	private Builder schemaBuilder; 

	public GraphQLSchema generate(EClass queryClass) {
		schemaBuilder = GraphQLSchema.newSchema();
		schemaBuilder.query(getObjectType(queryClass));
		for (EPackage ePackage : packages) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					getObjectType((EClass) eClassifier);
				} else if (eClassifier instanceof EEnum) {
					getEnumType((EEnum) eClassifier);					
				}
			}
		}
		return schemaBuilder.build();
	}

	private Map<EClass, String> references = new HashMap<>();

	private Map<EClass, GraphQLObjectType> objectTypes = new HashMap<>();
	private Map<EClass, GraphQLInterfaceType> interfaceTypes = new HashMap<>();
	
	private String objectTypeNameFormat = "%sObject";
	private String interfaceTypeNameFormat = "%s";
	
	private String getObjectTypeName(EClass eClass) {
		return String.format(objectTypeNameFormat, eClass.getName());
	}	
	
	private String getInterfaceTypeName(EClass eClass) {
		return String.format(interfaceTypeNameFormat, eClass.getName());
	}
	
	private TypeResolver typeResolver = new TypeResolver() {
		@Override
		public GraphQLObjectType getType(TypeResolutionEnvironment env) {
			if (env.getObject() instanceof EObject) {
				EClass eClass = ((EObject) env.getObject()).eClass();
				return objectTypes.get(eClass);
			}
			return null;
		}
	};
	
	private Map<EClass, Collection<ETypedElement>> unresolvedElements = new HashMap<>();
	
	private GraphQLInterfaceType getInterfaceType(EClass eClass) {
		GraphQLInterfaceType interfaceType = interfaceTypes.get(eClass);
		if (interfaceType == null) {
			String name = getInterfaceTypeName(eClass);
			GraphQLInterfaceType.Builder typeBuilder = GraphQLInterfaceType.newInterface().name(name);
			// add fields
			Collection<GraphQLFieldDefinition> fields = new ArrayList<>();
			addFields(eClass, fields);
			addResolvedFields(eClass, fields);
			for (GraphQLFieldDefinition field : fields) {
				typeBuilder.field(field);
			}
			typeBuilder.typeResolver(typeResolver);
			try {
				interfaceType = typeBuilder.build();
			} catch (RuntimeException e) {
				System.err.println(e + ": " + eClass);
				throw e;
			}
			interfaceTypes.put(eClass, interfaceType);
		}
		return interfaceType;
	}

	protected boolean includesPackage(EPackage pack) {
		return packages.contains(pack);
	}
	
	protected void addFields(EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		try {
			// stay within domain
			if (includesPackage(eClass.getEPackage())) {
				addFields(eClass.getEAllStructuralFeatures(), eClass, fields);
				addFields(eClass.getEOperations(), eClass, fields);
				for (EClass superClass : eClass.getEAllSuperTypes()) {
					addFields(superClass.getEOperations(), eClass, fields);
				}
			}
		} catch (StackOverflowError e) {
			System.err.println(eClass.getName() + ": " + e);
		}
	}

	protected void addFields(Iterable<? extends ETypedElement> typedElements, EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		for (ETypedElement typedElement : typedElements) {
			if (shouldExclude(eClass, typedElement)) {
				continue;
			}
			if (isUnresolved(typedElement, eClass)) {
				Collection<ETypedElement> unresolved = unresolvedElements.get(eClass);
				if (unresolved == null) {
					unresolved = new ArrayList<>();
					unresolvedElements.put(eClass, unresolved);
				}
				if (! unresolved.contains(typedElement)) {
					unresolved.add(typedElement);
				}
			} else {
				addField(typedElement, eClass, fields);
			}
		}
	}

	private void addResolvedFields(EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		// check if generic fields in superclasses can be included
		for (EClass superClass : eClass.getEAllSuperTypes()) {
			Collection<ETypedElement> unresolved = unresolvedElements.get(superClass);
			if (unresolved != null) {
				Iterator<ETypedElement> it = unresolved.iterator();
				next: while (it.hasNext()) {
					ETypedElement typedElement = it.next();
					if (! isUnresolved(typedElement, eClass)) {
						it.remove();
						for (GraphQLFieldDefinition field : fields) {
							if (typedElement.getName().equals(field.getName())) {
								continue next;
							}
						}
						addField(typedElement, eClass, fields);
					}
				}
			}
		}
	}

	private void addField(ETypedElement typedElement, EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		GraphQLFieldDefinition field = generate(typedElement, eClass, (typedElement instanceof EOperation ? ((EOperation) typedElement).getEParameters() : null));
		if (field == null) {
			System.err.println("Couldn't create field " + typedElement.getName() + " of " + ((ENamedElement) typedElement.eContainer()).getName());
		} else {
			fields.add(field);
		}
	}

	private boolean isUnresolved(ETypedElement typedElement, EClass eClass) {
		if (isUnresolved(typedElement.getEGenericType(), eClass)) {
			return true;
		}
		if (typedElement instanceof EOperation) {
			for (EParameter parameter : ((EOperation) typedElement).getEParameters()) {
				if (isUnresolved(parameter.getEGenericType(), eClass)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isUnresolved(EGenericType type, EClass eClass) {
		EGenericType reifiedType = EcoreUtil.getReifiedType(eClass, type);
		if (reifiedType.getETypeParameter() != null) {
			return true;
		}
		for (EGenericType typeArgumemt : type.getETypeArguments()) {
			if (isUnresolved(typeArgumemt, eClass)) {
				return true;
			}
		}
		return false;
	}

	private boolean shouldExclude(EClass eClass, ETypedElement typedElement) {
		// void operations are excluded
		if (typedElement.getEGenericType() == null) {
			return true;
		}
		// container references are excluded
		if (typedElement instanceof EReference && ((EReference) typedElement).isContainer()) {
			return true;
		}
		return false;
	}

	protected GraphQLObjectType getObjectType(EClass eClass) {
		GraphQLObjectType objectType = objectTypes.get(eClass);
		if (objectType == null) {
			String name = getObjectTypeName(eClass);
			references.put(eClass, name);
			GraphQLInterfaceType interfaceType = getInterfaceType(eClass);
			GraphQLObjectType.Builder typeBuilder = GraphQLObjectType.newObject().name(name);
			// add fields
			Collection<GraphQLFieldDefinition> fields = new ArrayList<>();
			addFields(eClass, fields);
			addResolvedFields(eClass, fields);
			for (GraphQLFieldDefinition field : fields) {
				typeBuilder.field(field);
			}
			// add interfaces
			Collection<GraphQLInterfaceType> interfaceTypes = new ArrayList<>();
			interfaceTypes.add(interfaceType);
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				interfaceTypes.add(getInterfaceType(superClass));
			}
			typeBuilder.withInterfaces(interfaceTypes.toArray(new GraphQLInterfaceType[interfaceTypes.size()]));
			objectType = typeBuilder.build();
			references.remove(eClass);
			objectTypes.put(eClass, objectType);
		}
		return objectType;
	}

	protected GraphQLFieldDefinition generate(ETypedElement element, EClass context, Collection<? extends ETypedElement> parameters) {
		String name = element.getName();
		GraphQLFieldDefinition.Builder fieldBuilder = GraphQLFieldDefinition.newFieldDefinition().name(name);
		GraphQLType type = getGraphQLType(element, context, GraphQLOutputType.class);
		if (type == null) {
			return null;
		}
		fieldBuilder.type((GraphQLOutputType) type);
		if (parameters != null) {
			for (ETypedElement param : parameters) {
				GraphQLType paramType = getGraphQLType(param, context, GraphQLInputType.class);
				if (paramType == null) {
					return null;
				}
				GraphQLArgument arg = GraphQLArgument.newArgument()
						.name(param.getName())
						.type((GraphQLInputType) paramType)
						.build();
				fieldBuilder.argument(arg);
			}
		}
		fieldBuilder.dataFetcher(getDataFetcher(element));
		return fieldBuilder.build();
	}

	protected DataFetcher<?> getDataFetcher(ETypedElement typedElement) {
		if (typedElement instanceof EStructuralFeature) {
			return new EStructuralFeatureDataFetcher((EStructuralFeature) typedElement);
		} else if (typedElement instanceof EOperation) {
			return new EOperationDataFetcher((EOperation) typedElement);
		}
		return null;
	}
	
	private GraphQLType getGraphQLType(ETypedElement typedElement, EClass context, Class<? extends GraphQLType> typeClass) {
		EClassifier eClassifier = EcoreUtil.getReifiedType(context, typedElement.getEGenericType()).getEClassifier();
		GraphQLType type = getGraphQLType(eClassifier, typeClass);
		if (! typeClass.isInstance(type)) {
			return null;
		}
		if (typedElement.isMany()) {
			type = new GraphQLList(type);
		}
		return type;
	}
	
	private Map<EEnum, GraphQLEnumType> enumTypes = new HashMap<>();
	
	protected GraphQLEnumType getEnumType(EEnum eEnum) {
		GraphQLEnumType enumType = enumTypes.get(eEnum);
		if (enumType == null) {
			GraphQLEnumType.Builder typeBuilder = GraphQLEnumType.newEnum().name(eEnum.getName());
			for (EEnumLiteral eLiteral : eEnum.getELiterals()) {
				typeBuilder.value(eLiteral.getName(), eLiteral.getName()); // eLiteral.getLiteral() doesn't work with serialization logic in GraphQLEnumType
			}
			enumType = typeBuilder.build();
			enumTypes.put(eEnum, enumType);
		}
		return enumType;
	}

	protected GraphQLType getGraphQLType(EClassifier eClassifier, Class<? extends GraphQLType> typeClass) {
		if (eClassifier instanceof EEnum) {
			return getEnumType((EEnum) eClassifier);
		} else if (eClassifier instanceof EDataType) {
			return getGraphQLScalarType((EDataType) eClassifier);
		} else if (eClassifier instanceof EClass && typeClass.isAssignableFrom(GraphQLOutputType.class)) {
			String referenceName = references.get(eClassifier);
			if (referenceName != null) {
				return new GraphQLTypeReference(referenceName);
			} else {
				return getInterfaceType((EClass) eClassifier);
			}
		}
		return null;
	}

	static GraphQLType getGraphQLScalarType(EDataType dateType) {
		Class<?> instanceClass = dateType.getInstanceClass();
		if (instanceClass == Integer.TYPE || instanceClass == Integer.class || instanceClass == Long.TYPE || instanceClass == Long.class) {
			return Scalars.GraphQLInt;
		} else if (instanceClass == Float.TYPE || instanceClass == Float.class || instanceClass == Double.TYPE || instanceClass == Double.class) {
			return Scalars.GraphQLFloat;
		} else if (instanceClass == Boolean.TYPE || instanceClass == Boolean.class) {
			return Scalars.GraphQLBoolean;
		} else if (dateType.isSerializable()) {
			return Scalars.GraphQLString;
		}
		return null;
	}
}
