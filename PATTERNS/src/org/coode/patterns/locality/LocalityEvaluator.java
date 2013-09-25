package org.coode.patterns.locality;

import java.util.Set;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;

/** <p>
 * Copyright: Copyright (c) 2007
 * </p>
 * <p>
 * Company: Clark & Parsia, LLC. <http://www.clarkparsia.com>
 * </p>
 * 
 * @author Evren Sirin */
public interface LocalityEvaluator {
    /** @param axiom
     *            The axiom to test
     * @param signature
     *            The signature
     * @return <code>true</code> if the axiom is local w.r.t. given signature
     *         otherwise <code>false</code> */
    public boolean isLocal(OWLAxiom axiom, Set<? extends OWLEntity> signature);
}
