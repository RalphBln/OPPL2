package org.coode.oppl.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.semanticweb.owlapi.model.*;

/**
 * @author Luigi Iannone
 */
public final class OWLObjectDecomposer implements OWLObjectVisitorEx<List<Object>> {

    @Override
    public List<Object> visit(OWLSubClassOfAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getSubClass());
        toReturn.add(axiom.getSuperClass());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getSubject());
        toReturn.add(axiom.getObject());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLAsymmetricObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLReflexiveObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDisjointClassesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getClassExpressions());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataPropertyDomainAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getDomain());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectPropertyDomainAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getDomain());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLEquivalentObjectPropertiesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getProperties());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLNegativeDataPropertyAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getSubject());
        toReturn.add(axiom.getObject());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDifferentIndividualsAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getIndividuals());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDisjointDataPropertiesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getProperties());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDisjointObjectPropertiesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getProperties());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectPropertyRangeAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getRange());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectPropertyAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getSubject());
        toReturn.add(axiom.getObject());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLFunctionalObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSubObjectPropertyOfAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getSubProperty());
        toReturn.add(axiom.getSuperProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDisjointUnionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getClassExpressions());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDeclarationAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getEntity());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLAnnotationAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getSubject());
        toReturn.add(axiom.getAnnotation());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSymmetricObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataPropertyRangeAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getRange());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLFunctionalDataPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLEquivalentDataPropertiesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getProperties());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLClassAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getClassExpression());
        toReturn.add(axiom.getIndividual());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLEquivalentClassesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getClassExpressions());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataPropertyAssertionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getSubject());
        toReturn.add(axiom.getObject());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLTransitiveObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLIrreflexiveObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSubDataPropertyOfAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getSubProperty());
        toReturn.add(axiom.getSuperProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSameIndividualAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getIndividuals());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSubPropertyChainOfAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(axiom.getPropertyChain());
        toReturn.add(axiom.getSuperProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLInverseObjectPropertiesAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getFirstProperty());
        toReturn.add(axiom.getSecondProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLHasKeyAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getClassExpression());
        toReturn.addAll(axiom.getPropertyExpressions());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDatatypeDefinitionAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getDatatype());
        toReturn.add(axiom.getDataRange());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLRule rule) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(rule.getHead());
        toReturn.addAll(rule.getBody());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLSubAnnotationPropertyOfAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getSubProperty());
        toReturn.add(axiom.getSuperProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLAnnotationPropertyDomainAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getDomain());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLAnnotationPropertyRangeAxiom axiom) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(axiom.getProperty());
        toReturn.add(axiom.getRange());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLClass ce) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLObjectIntersectionOf ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(ce.getOperands());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectUnionOf ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(ce.getOperands());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectComplementOf ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getOperand());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectSomeValuesFrom ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectAllValuesFrom ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectHasValue ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getValue());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectMinCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectExactCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectMaxCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectHasSelf ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectOneOf ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(ce.getIndividuals());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataSomeValuesFrom ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataAllValuesFrom ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataHasValue ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getValue());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataMinCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataExactCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataMaxCardinality ce) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(ce.getProperty());
        toReturn.add(ce.getCardinality());
        toReturn.add(ce.getFiller());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDatatype node) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLDataComplementOf node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getDataRange());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataOneOf node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(node.getValues());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataIntersectionOf node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(node.getOperands());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataUnionOf node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(node.getOperands());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDatatypeRestriction node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.addAll(node.getFacetRestrictions());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLLiteral node) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLFacetRestriction node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getFacet());
        toReturn.add(node.getFacetValue());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLObjectProperty property) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLObjectInverseOf property) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(property.getInverse());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLDataProperty property) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLNamedIndividual individual) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLAnnotationProperty property) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLAnnotation node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getProperty());
        toReturn.add(node.getValue());
        return toReturn;
    }

    @Override
    public List<Object> visit(IRI iri) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(OWLAnonymousIndividual individual) {
        return Collections.emptyList();
    }

    @Override
    public List<Object> visit(SWRLClassAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getPredicate());
        toReturn.add(node.getArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLDataRangeAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getPredicate());
        toReturn.add(node.getArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLObjectPropertyAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getPredicate());
        toReturn.add(node.getFirstArgument());
        toReturn.add(node.getSecondArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLDataPropertyAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getPredicate());
        toReturn.add(node.getFirstArgument());
        toReturn.add(node.getSecondArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLBuiltInAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getPredicate());
        toReturn.add(node.getArguments());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLVariable node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getIRI());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLIndividualArgument node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getIndividual());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLLiteralArgument node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getLiteral());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLSameIndividualAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getFirstArgument());
        toReturn.add(node.getSecondArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(SWRLDifferentIndividualsAtom node) {
        List<Object> toReturn = new ArrayList<>();
        toReturn.add(node.getFirstArgument());
        toReturn.add(node.getSecondArgument());
        return toReturn;
    }

    @Override
    public List<Object> visit(OWLOntology ontology) {
        return Collections.emptyList();
    }
}
