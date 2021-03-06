package org.coode.oppl.utils;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectVisitorExAdapter;

/**
 * This class determines if an OWLObject is either an OWLEntity or a an
 * OWLConstant.
 * 
 * @author Luigi Iannone
 */
public final class OWLPrimitiveSelector {

    private static final OWLObjectVisitorEx<Boolean> allPrimitiveSelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLClass desc) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLDataProperty property) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLObjectProperty property) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLNamedIndividual individual) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLLiteral constant) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLDatatype node) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLEntitySelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLClass desc) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLDataProperty property) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLObjectProperty property) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLNamedIndividual individual) {
            return Boolean.TRUE;
        }

        @Override
        public Boolean visit(OWLDatatype dataType) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLClassSelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLClass desc) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLDataPropertySelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLDataProperty property) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLObjectPropertySelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLObjectProperty property) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLAnnotationPropertySelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLAnnotationProperty property) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLIndividualSelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLNamedIndividual individual) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLDatatypeSelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLDatatype dataType) {
            return Boolean.TRUE;
        }
    };
    private static final OWLObjectVisitorEx<Boolean> allOWLConstantSelector = new OWLObjectVisitorExAdapter<Boolean>(
        Boolean.FALSE) {

        @Override
        public Boolean visit(OWLLiteral constant) {
            return Boolean.TRUE;
        }
    };

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting either an OWLEntity or an OWLConstant.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         either an {@link OWLEntity} or a literal
     */
    public static OWLObjectVisitorEx<Boolean> getAllPrimitiveSelector() {
        return allPrimitiveSelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting either an OWLClass.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLClass}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLClassSelector() {
        return allOWLClassSelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting an {@link OWLDataProperty}.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLDataProperty}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLDataPropertySelector() {
        return allOWLDataPropertySelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting an {@link OWLObjectProperty}.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLObjectProperty}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLObjectPropertySelector() {
        return allOWLObjectPropertySelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting a OWLAnnotationproperty.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         a OWLAnnotationproperty.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLAnnotationPropertySelector() {
        return allOWLAnnotationPropertySelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting an {@link OWLIndividual}.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLIndividual}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLIndividualSelector() {
        return allOWLIndividualSelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting an {@link OWLDatatype}.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLDatatype}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLDatatypeSelector() {
        return allOWLDatatypeSelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting a literal.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         a literal.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLConstantSelector() {
        return allOWLConstantSelector;
    }

    /**
     * Retrieves an {@link OWLObjectVisitorEx} returning {@code true} if
     * visiting an {@link OWLEntity}.
     * 
     * @return an {@link OWLObjectVisitorEx} returning {@code true} if visiting
     *         an {@link OWLEntity}.
     */
    public static OWLObjectVisitorEx<Boolean> getAllOWLEntitySelector() {
        return allOWLEntitySelector;
    }
}
