package org.coode.oppl.search.solvability;

import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.search.OPPLOWLAxiomSearchNode;
import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * Represents a search node for which it can be determined whether a single
 * method call to the OWL API or to the reasoner could solve the search.
 * 
 * @author Luigi Iannone
 */
public abstract class SolvabilitySearchNode extends OPPLOWLAxiomSearchNode {

    /**
     * @param axiom
     *        axiom
     * @param bindingNode
     *        bindingNode
     */
    protected SolvabilitySearchNode(OWLAxiom axiom, BindingNode bindingNode) {
        super(axiom, bindingNode);
    }

    /**
     * @param visitor
     *        visitor
     */
    public abstract void accept(SolvabilitySearchNodeVisitor visitor);

    /**
     * @param visitor
     *        visitor
     * @param <O>
     *        visitor return type
     * @return visitor value
     */
    public abstract <O> O accept(SolvabilitySearchNodeVisitorEx<O> visitor);

    /**
     * @param axiom
     *        axiom
     * @param axiomSolvability
     *        axiomSolvability
     * @param bindingNode
     *        bindingNode
     * @return solvability search node
     */
    public static SolvabilitySearchNode buildSolvabilitySearchNode(OWLAxiom axiom,
        AxiomSolvability axiomSolvability, BindingNode bindingNode) {
        return axiomSolvability.getSolvabilitySearchNode(axiom, bindingNode);
    }
}
