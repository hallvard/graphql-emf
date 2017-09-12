package no.hal.graphql.emf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

public class EStructuralFeatureDataFetcher implements DataFetcher<Object> {

	private final EStructuralFeature feature;

	public EStructuralFeatureDataFetcher(EStructuralFeature feature) {
		this.feature = feature;
	}

	@Override
	public Object get(DataFetchingEnvironment environment) {
		if (! (environment.getSource() instanceof EObject)) {
			return null;
		}
		EObject context = (EObject) environment.getSource();
		try {
			Object value = context.eGet(feature);
			return value;
		} catch (Exception e) {
			return null;
		}
	}
}
