package org.coode.oppl.datafactory;

import static org.coode.oppl.utils.ArgCheck.checkNotNull;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.coode.oppl.function.inline.InlineSet;
import org.semanticweb.owlapi.model.*;

/**
 * @author Luigi Iannone
 */
public class OPPLOWLSameIndividualAxiom extends AbstractInlineSetAxiom<OWLIndividual>
    implements OWLSameIndividualAxiom {

    private static final long serialVersionUID = 20100L;
    private final OWLSameIndividualAxiom delegate;
    private final boolean shouldExpandAsPairWise;

    /**
     * @param dataFactory
     *        dataFactory
     * @param individuals
     *        individuals
     * @param annotations
     *        annotations
     * @param shouldExpandAsPairWise
     *        shouldExpandAsPairWise
     */
    public OPPLOWLSameIndividualAxiom(OPPLOWLDataFactory dataFactory,
        InlineSet<OWLIndividual> individuals,
        Set<? extends OWLAnnotation> annotations, boolean shouldExpandAsPairWise) {
        super(individuals);
        checkNotNull(dataFactory, "dataFactory");
        checkNotNull(annotations, "annotations");
        delegate = dataFactory.getDelegate().getOWLSameIndividualAxiom(individuals,
            annotations);
        this.shouldExpandAsPairWise = shouldExpandAsPairWise;
    }

    /**
     * @return the shouldExpandAsPairwise
     */
    public boolean shouldExpandAsPairWise() {
        return shouldExpandAsPairWise;
    }

    @Override
    public Set<OWLEntity> getSignature() {
        return delegate.getSignature();
    }

    @Override
    public boolean containsEntityInSignature(OWLEntity owlEntity) {
        return delegate.containsEntityInSignature(owlEntity);
    }

    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {
        return delegate.getAnonymousIndividuals();
    }

    @Override
    public Set<OWLIndividual> getIndividuals() {
        return delegate.getIndividuals();
    }

    @Override
    public List<OWLIndividual> getIndividualsAsList() {
        return delegate.getIndividualsAsList();
    }

    @Override
    public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {
        return delegate.asOWLSubClassOfAxioms();
    }

    @Override
    public void accept(OWLAxiomVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
        return visitor.visit(this);
    }

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {
        return delegate.getDataPropertiesInSignature();
    }

    @Override
    public Set<OWLSameIndividualAxiom> asPairwiseAxioms() {
        return delegate.asPairwiseAxioms();
    }

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {
        return delegate.getObjectPropertiesInSignature();
    }

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {
        return delegate.getIndividualsInSignature();
    }

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {
        return delegate.getDatatypesInSignature();
    }

    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {
        return delegate.getNestedClassExpressions();
    }

    @Override
    public void accept(OWLObjectVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {
        return visitor.visit(this);
    }

    @Override
    public int compareTo(OWLObject o) {
        return delegate.compareTo(o);
    }

    @Override
    public OWLSameIndividualAxiom getAxiomWithoutAnnotations() {
        return delegate.getAxiomWithoutAnnotations();
    }

    @Override
    public Set<OWLClass> getClassesInSignature() {
        return delegate.getClassesInSignature();
    }

    @Override
    public boolean containsAnonymousIndividuals() {
        return delegate.containsAnonymousIndividuals();
    }

    @Override
    public Set<OWLAnnotation> getAnnotations() {
        return delegate.getAnnotations();
    }

    @Override
    public Set<OWLAnnotation> getAnnotations(OWLAnnotationProperty annotationProperty) {
        return delegate.getAnnotations(annotationProperty);
    }

    @Override
    public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
        return delegate.getAnnotatedAxiom(annotations);
    }

    @Override
    public boolean equalsIgnoreAnnotations(OWLAxiom axiom) {
        return delegate.equalsIgnoreAnnotations(axiom);
    }

    @Override
    public boolean isTopEntity() {
        return delegate.isTopEntity();
    }

    @Override
    public boolean isLogicalAxiom() {
        return delegate.isLogicalAxiom();
    }

    @Override
    public boolean isBottomEntity() {
        return delegate.isBottomEntity();
    }

    @Override
    public boolean isAnnotated() {
        return delegate.isAnnotated();
    }

    @Override
    public AxiomType<?> getAxiomType() {
        return delegate.getAxiomType();
    }

    @Override
    public boolean isOfType(AxiomType<?>... axiomTypes) {
        return delegate.isOfType(axiomTypes);
    }

    @Override
    public boolean isOfType(Set<AxiomType<?>> types) {
        return delegate.isOfType(types);
    }

    @Override
    public OWLAxiom getNNF() {
        return delegate.getNNF();
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    @Override
    public boolean isAnnotationAxiom() {
        return delegate.isAnnotationAxiom();
    }

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {
        return delegate.getAnnotationPropertiesInSignature();
    }

    @Override
    public Set<OWLSameIndividualAxiom> splitToAnnotatedPairs() {
        return delegate.splitToAnnotatedPairs();
    }

    @Override
    public <T> Collection<T> walkPairwise(OWLPairwiseVisitor<T, OWLIndividual> visitor) {
        return delegate.walkPairwise(visitor);
    }
}
