package org.coode.oppl.utils;

import java.util.Iterator;
import java.util.Set;

import org.coode.oppl.ConstraintSystem;
import org.semanticweb.owlapi.model.*;

/**
 * @author Luigi Iannone
 */
public abstract class AbstractVariableDetector implements OWLObjectVisitorEx<Boolean> {

    protected ConstraintSystem constraintSystem;

    /**
     * @param constraintSystem
     *        constraintSystem
     */
    protected AbstractVariableDetector(ConstraintSystem constraintSystem) {
        this.constraintSystem = constraintSystem;
    }

    @Override
    public Boolean visit(OWLObjectIntersectionOf desc) {
        boolean found = false;
        Iterator<OWLClassExpression> it = desc.getOperands().iterator();
        OWLClassExpression operand;
        while (!found && it.hasNext()) {
            operand = it.next();
            found = operand.accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLObjectUnionOf desc) {
        boolean found = false;
        Iterator<OWLClassExpression> it = desc.getOperands().iterator();
        OWLClassExpression operand;
        while (!found && it.hasNext()) {
            operand = it.next();
            found = operand.accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLObjectComplementOf desc) {
        return desc.getOperand().accept(this);
    }

    @Override
    public Boolean visit(OWLObjectSomeValuesFrom desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || desc.getFiller().accept(this);
    }

    @Override
    public Boolean visit(OWLObjectAllValuesFrom desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || desc.getFiller().accept(this);
    }

    @Override
    public Boolean visit(OWLObjectHasValue desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || desc.getValue().accept(this);
    }

    @Override
    public Boolean visit(OWLAnonymousIndividual individual) {
        return false;
    }

    @Override
    public Boolean visit(OWLObjectMinCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || (desc.getFiller() == null ? false : desc.getFiller().accept(this));
    }

    @Override
    public Boolean visit(OWLObjectExactCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || (desc.getFiller() == null ? false : desc.getFiller().accept(this));
    }

    @Override
    public Boolean visit(OWLObjectMaxCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty())
            || (desc.getFiller() == null ? false : desc.getFiller().accept(this));
    }

    @Override
    public Boolean visit(OWLObjectHasSelf desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLObjectProperty());
    }

    @Override
    public Boolean visit(OWLObjectOneOf desc) {
        boolean found = false;
        Iterator<OWLIndividual> it = desc.getIndividuals().iterator();
        OWLIndividual individual;
        while (!found && it.hasNext()) {
            individual = it.next();
            found = individual.accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDataSomeValuesFrom desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLDataAllValuesFrom desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLDataHasValue desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLDataMinCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLDataExactCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLDataMaxCardinality desc) {
        return constraintSystem.isVariable(desc.getProperty().asOWLDataProperty());
    }

    @Override
    public Boolean visit(OWLSubClassOfAxiom axiom) {
        return axiom.getSubClass().accept(this) || axiom.getSuperClass().accept(this);
    }

    @Override
    public Boolean visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getSubject().accept(this)
            || axiom.getObject().accept(this);
    }

    @Override
    public Boolean visit(OWLAsymmetricObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLReflexiveObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLDisjointClassesAxiom axiom) {
        Set<OWLClassExpression> descriptions = axiom.getClassExpressions();
        Iterator<OWLClassExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDataPropertyDomainAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getDomain().accept(this);
    }

    @Override
    public Boolean visit(OWLObjectPropertyDomainAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getDomain().accept(this);
    }

    @Override
    public Boolean visit(OWLEquivalentObjectPropertiesAxiom axiom) {
        Set<OWLObjectPropertyExpression> descriptions = axiom.getProperties();
        Iterator<OWLObjectPropertyExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLNegativeDataPropertyAssertionAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getSubject().accept(this)
            || axiom.getObject().accept(this);
    }

    @Override
    public Boolean visit(OWLDifferentIndividualsAxiom axiom) {
        Set<OWLIndividual> descriptions = axiom.getIndividuals();
        Iterator<OWLIndividual> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDisjointDataPropertiesAxiom axiom) {
        Set<OWLDataPropertyExpression> descriptions = axiom.getProperties();
        Iterator<OWLDataPropertyExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDisjointObjectPropertiesAxiom axiom) {
        Set<OWLObjectPropertyExpression> descriptions = axiom.getProperties();
        Iterator<OWLObjectPropertyExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLObjectPropertyRangeAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getRange().accept(this);
    }

    @Override
    public Boolean visit(OWLObjectPropertyAssertionAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getSubject().accept(this)
            || axiom.getObject().accept(this);
    }

    @Override
    public Boolean visit(OWLFunctionalObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLSubObjectPropertyOfAxiom axiom) {
        return axiom.getSubProperty().accept(this)
            || axiom.getSuperProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLDisjointUnionAxiom axiom) {
        Set<OWLClassExpression> descriptions = axiom.getClassExpressions();
        Iterator<OWLClassExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDeclarationAxiom axiom) {
        return Boolean.FALSE;
    }

    @Override
    public Boolean visit(OWLSymmetricObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLDataPropertyRangeAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getRange().accept(this);
    }

    @Override
    public Boolean visit(OWLFunctionalDataPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLEquivalentDataPropertiesAxiom axiom) {
        Set<OWLDataPropertyExpression> descriptions = axiom.getProperties();
        Iterator<OWLDataPropertyExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLClassAssertionAxiom axiom) {
        return axiom.getClassExpression().accept(this)
            || axiom.getIndividual().accept(this);
    }

    @Override
    public Boolean visit(OWLEquivalentClassesAxiom axiom) {
        Set<OWLClassExpression> descriptions = axiom.getClassExpressions();
        Iterator<OWLClassExpression> iterator = descriptions.iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLDataPropertyAssertionAxiom axiom) {
        return axiom.getProperty().accept(this) || axiom.getSubject().accept(this)
            || axiom.getObject().accept(this);
    }

    @Override
    public Boolean visit(OWLTransitiveObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLIrreflexiveObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLSubDataPropertyOfAxiom axiom) {
        return axiom.getSubProperty().accept(this)
            || axiom.getSuperProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {
        return axiom.getProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLSameIndividualAxiom axiom) {
        Iterator<OWLIndividual> iterator = axiom.getIndividuals().iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(OWLSubPropertyChainOfAxiom axiom) {
        Iterator<OWLObjectPropertyExpression> iterator = axiom.getPropertyChain()
            .iterator();
        boolean found = false;
        while (found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found || axiom.getSuperProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLInverseObjectPropertiesAxiom axiom) {
        Iterator<OWLObjectPropertyExpression> iterator = axiom.getProperties().iterator();
        boolean found = false;
        while (found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return found;
    }

    @Override
    public Boolean visit(SWRLRule rule) {
        return false;
    }

    @Override
    public Boolean visit(OWLDatatype node) {
        return false;
    }

    @Override
    public Boolean visit(OWLDataComplementOf node) {
        return false;
    }

    @Override
    public Boolean visit(OWLDataOneOf node) {
        Iterator<OWLLiteral> iterator = node.getValues().iterator();
        boolean found = false;
        while (!found && iterator.hasNext()) {
            found = iterator.next().accept(this);
        }
        return false;
    }

    @Override
    public Boolean visit(OWLObjectInverseOf property) {
        return property.getInverseProperty().accept(this);
    }

    @Override
    public Boolean visit(OWLDatatypeRestriction node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLClassAtom node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLDataRangeAtom node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLObjectPropertyAtom node) {
        return false;
    }

    @Override
    public Boolean visit(OWLOntology ontology) {
        return false;
    }

    @Override
    public Boolean visit(OWLSubAnnotationPropertyOfAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(OWLAnnotationPropertyDomainAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(OWLAnnotationPropertyRangeAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(OWLAnnotation node) {
        return false;
    }

    @Override
    public Boolean visit(IRI iri) {
        return false;
    }

    @Override
    public Boolean visit(OWLAnnotationProperty property) {
        return false;
    }

    @Override
    public Boolean visit(OWLDataIntersectionOf node) {
        return false;
    }

    @Override
    public Boolean visit(OWLDataUnionOf node) {
        return false;
    }

    @Override
    public Boolean visit(OWLFacetRestriction node) {
        return false;
    }

    @Override
    public Boolean visit(OWLAnnotationAssertionAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(OWLHasKeyAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(OWLDatatypeDefinitionAxiom axiom) {
        return false;
    }

    @Override
    public Boolean visit(SWRLDataPropertyAtom node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLBuiltInAtom node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLVariable node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLIndividualArgument node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLLiteralArgument node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLSameIndividualAtom node) {
        return false;
    }

    @Override
    public Boolean visit(SWRLDifferentIndividualsAtom node) {
        return false;
    }
}
