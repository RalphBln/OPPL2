package org.coode.parsers;

import static org.coode.oppl.utils.ArgCheck.checkNotNull;

import org.coode.oppl.OPPLShortFormProvider;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

/**
 * @author Luigi Iannone
 */
public class DisposableShortFormEntityChecker implements DisposableOWLEntityChecker {

    private final BidirectionalShortFormProviderAdapter shrotFormProviderAdaptor;
    private final OWLEntityChecker delegate;

    /**
     * @param shrotFormProviderAdaptor
     *        shrotFormProviderAdaptor
     */
    public DisposableShortFormEntityChecker(
        BidirectionalShortFormProviderAdapter shrotFormProviderAdaptor) {
        this.shrotFormProviderAdaptor = shrotFormProviderAdaptor;
        delegate = new ShortFormEntityChecker(shrotFormProviderAdaptor);
    }

    /**
     * @param owlEntityChecker
     *        owlEntityChecker
     */
    public DisposableShortFormEntityChecker(OWLEntityChecker owlEntityChecker) {
        delegate = checkNotNull(owlEntityChecker, "owlEntityChecker");
        shrotFormProviderAdaptor = new BidirectionalShortFormProviderAdapter(
            new OPPLShortFormProvider(new SimpleShortFormProvider()));
    }

    @Override
    public OWLClass getOWLClass(String name) {
        return delegate.getOWLClass(name);
    }

    @Override
    public OWLDataProperty getOWLDataProperty(String name) {
        return delegate.getOWLDataProperty(name);
    }

    @Override
    public OWLDatatype getOWLDatatype(String name) {
        return delegate.getOWLDatatype(name);
    }

    @Override
    public OWLNamedIndividual getOWLIndividual(String name) {
        return delegate.getOWLIndividual(name);
    }

    @Override
    public OWLObjectProperty getOWLObjectProperty(String name) {
        return delegate.getOWLObjectProperty(name);
    }

    @Override
    public OWLAnnotationProperty getOWLAnnotationProperty(String name) {
        return delegate.getOWLAnnotationProperty(name);
    }

    @Override
    public void dispose() {
        shrotFormProviderAdaptor.dispose();
    }
}
