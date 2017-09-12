package no.hal.graphql.emf.test;

import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLEnumValueDefinition;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import graphql.schema.GraphQLType;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import no.hal.graphql.emf.SchemaGenerator;

/**
 * Unit test for simple App.
 */
public class GraphQLEmfTest extends TestCase {

	GraphQLSchema schema;
	
	@Override
	protected void setUp() throws Exception {
		register(TestPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(getClass().getResource("GraphQLEmfTest.xmi").toString()), true);
		Model model = (Model) EcoreUtil.getObjectByType(resource.getContents(), TestPackage.eINSTANCE.getModel());
		game = model.getGame();
		Assert.assertNotNull(game);
		SchemaGenerator schemaGenerator = new SchemaGenerator(Arrays.<EPackage>asList(TestPackage.eINSTANCE));
		schema = schemaGenerator.generate(TestPackage.eINSTANCE.getGame());
	}

	private void register(EPackage pack) {
		EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);
	}

	private Game game;
	
    public void testSchemaGenerator() {
//    	for (GraphQLType type : schema.getAllTypesAsList()) {
//    		System.out.println(type.getName());
//    	}
	    	checkInterfaceType("Person", "name", "ids");
	    	checkInterfaceType("Player", "getName", "getId", "person", "kind");
	    	checkEnumType("PlayerKind", "NOVICE", "EXPERT");
	    	checkInterfaceType("Game", "tasks", "players");
	    	checkInterfaceType("Task", "players", "states");
	    	checkInterfaceType("TaskState", "entered");
	    	checkInterfaceType("TaskState", "exited");
	    	checkObjectType("GameObject", "tasks", "players");
    }

    public static void checkFieldContainerType(GraphQLSchema schema, String typeName, Class<? extends GraphQLType> typeClass, String... fieldNames) {
	    	GraphQLType type = schema.getType(typeName);
	    	assertNotNull("Type " + typeName + " is missing", type);
	    	checkFieldContainerType(type, typeClass, fieldNames);
    }

	public static void checkFieldContainerType(GraphQLType type, Class<? extends GraphQLType> typeClass, String... fieldNames) {
	    	assertTrue(type + " is not of type " + typeClass, typeClass.isInstance(type));
	    	for (String fieldName : fieldNames) {
			try {
				Method method = typeClass.getMethod("getFieldDefinition", new Class[]{String.class});
				Object field = method.invoke(type, fieldName);
				assertNotNull("Field " + fieldName + " is missing from " + type.getName(), field);
			} catch (Exception e) {
				fail(e.getMessage());
			}
	    	}
    }
    
    private void checkInterfaceType(String name, String... fieldNames) {
    		checkFieldContainerType(schema, name, GraphQLInterfaceType.class, fieldNames);
    }

    private void checkObjectType(String name, String... fieldNames) {
    		checkFieldContainerType(schema, name, GraphQLObjectType.class, fieldNames);
    }

    private void checkEnumType(String name, String... literals) {
	    	GraphQLType type = schema.getType(name);
	    	assertTrue("Type " + name + " must be an enum", type instanceof GraphQLEnumType);
	    	List<String> names = Arrays.asList(literals); 
	    	GraphQLEnumType enumType = (GraphQLEnumType) type;
	    	for (GraphQLEnumValueDefinition valueDef : enumType.getValues()) {
	    		int pos = names.indexOf(valueDef.getName());
	    		Assert.assertTrue(valueDef.getName() + " is not one of " + names, pos >= 0);
	    		Assert.assertEquals(valueDef.getValue() + " should be " + names.get(pos), names.get(pos), valueDef.getValue());
	    	}
    }
    
    public void testGameQuery() {
	    	assertNotNull(game);
	    	GraphQL graphQl = new GraphQL.Builder(schema).build();
	    	ExecutionInput executionInput = new ExecutionInput.Builder().
	    			query("{"
    			+ "tasks { "
					+ "players {"
						+ "getName,"
						+ "getId(num: 0),"
						+ "person { name }"
					+ "}"
				+ "}"
				+ "players {"
					+ "kind,"
					+ "person { name, ids }"
				+ "}"
			+ "}"
	    	).root(game).build(); 
	    	ExecutionResult result = graphQl.execute(executionInput);
	    	try {
			assertTrue(result.getErrors().isEmpty());
		} catch (AssertionFailedError afe) {
			System.err.println(result.getErrors());
			throw afe;
		}
	    	Map<String, Object> data = result.getData();
	    	checkData(data, "tasks", 1);
	    	checkData(data, "tasks", 0, "players", 1);
	    	checkData(data, "tasks", 0, "players", 0, "getName", "Hallvard");
	    	checkData(data, "tasks", 0, "players", 0, "getId", "hal@ntnu.no");
	    	checkData(data, "tasks", 0, "players", 0, "person", "name", "Hallvard");

	    	checkData(data, "players", 2);
	    	checkData(data, "players", 0, "kind", "NOVICE");
	    	checkData(data, "players", 0, "person", "name", "Hallvard");
	    	checkData(data, "players", 0, "person", "ids", 2);
	    	checkData(data, "players", 0, "person", "ids", 0, "hal@ntnu.no");
	    	checkData(data, "players", 0, "person", "ids", 1, "hallvard.traetteberg@gmail.com");
	    	checkData(data, "players", 1, "person", "name", "Jon Espen");
	    	checkData(data, "players", 1, "person", "ids", 0, "jonespi@idi.ntnu.no");
	    	checkData(data, "players", 1, "person", "ids", 1, "jonespen.ingvaldsen@ntnu.no");
//	    	printData(data, System.out);
    }
    
    public static void printData(Map<String, Object> data, OutputStream out) {
	    	try {
	    		new ObjectMapper().writer(new DefaultPrettyPrinter()).writeValue(out, data);
		} catch (Exception e) {
			System.err.println(e);
		}
    }

    public static void checkData(Map<String, Object> data, Object... path) {
	    	Object value = data;
	    	Iterator<Object> segments = Arrays.asList(path).iterator();
	    	while (segments.hasNext()) {
	    		Object segment = segments.next();
	    		if (value instanceof Map<?, ?>) {
	    			assertTrue(segments.hasNext());
	    			value = ((Map<?, ?>) value).get(segment);
	    		} else if (value instanceof List<?>) {
	    			assertTrue(segment instanceof Integer);
	    			if (segments.hasNext()) {
	    				value = ((List<?>) value).get((Integer) segment);
	    			} else {
	    				assertEquals(((Integer) segment).intValue(), ((List<?>) value).size());
	    			}
	    		} else {
	    			assertFalse(segments.hasNext());
	    			assertEquals(segment, value);
	    		}
	    	}
    }
}
