package openllet.owlapi.facet;

import org.semanticweb.owlapi.model.OWLDataFactory;

public interface FacetFactoryOWL
{
	/**
	 * @return a factory that can build object for this ontlogy.
	 * @since 2.5.1
	 */
	OWLDataFactory getFactory();
}
