/**
 * Copyright (C) 2008, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.coode.oppl;

import java.util.Collection;
import java.util.List;

import org.coode.oppl.bindingtree.BindingNode;
import org.coode.oppl.exceptions.RuntimeExceptionHandler;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.util.ShortFormProvider;

/**
 * @author Luigi Iannone
 */
public interface OPPLQuery extends Renderable {

    /**
     * @param axiom
     *        axiom
     */
    void addAssertedAxiom(OWLAxiom axiom);

    /**
     * @param axiom
     *        axiom
     */
    void addAxiom(OWLAxiom axiom);

    /**
     * @param constraint
     *        constraint
     */
    void addConstraint(AbstractConstraint constraint);

    /**
     * @return axioms
     */
    List<OWLAxiom> getAxioms();

    /**
     * @return asserted axioms
     */
    List<OWLAxiom> getAssertedAxioms();

    /**
     * @return constraints
     */
    List<AbstractConstraint> getConstraints();

    /**
     * @return rendering
     */
    String render();

    /**
     * @return constraint system
     */
    ConstraintSystem getConstraintSystem();

    /**
     * @param runtimeExceptionHandler
     *        runtimeExceptionHandler
     * @param executionMonitor
     *        executionMonitor
     */
    void execute(RuntimeExceptionHandler runtimeExceptionHandler,
        ExecutionMonitor executionMonitor);

    /**
     * @param leaves
     *        leaves
     * @param runtimeExceptionHandler
     *        runtimeExceptionHandler
     * @param executionMonitor
     *        executionMonitor
     */
    void execute(Collection<? extends BindingNode> leaves,
        RuntimeExceptionHandler runtimeExceptionHandler,
        ExecutionMonitor executionMonitor);

    /**
     * @param shortFormProvider
     *        shortFormProvider
     * @return rendering
     */
    String render(ShortFormProvider shortFormProvider);
}
