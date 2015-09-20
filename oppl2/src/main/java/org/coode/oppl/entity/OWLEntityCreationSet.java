package org.coode.oppl.entity;

import java.util.ArrayList;
import java.util.List;

import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntologyChange;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: 23-Sep-2006<br>
 * <br>
 * <br>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br>
 * <br>
 * 
 * @param <E>
 *        type
 */
public class OWLEntityCreationSet<E extends OWLEntity> {

    private final E owlEntity;
    private final List<OWLOntologyChange> changes;

    /**
     * @param owlEntity
     *        owlEntity
     * @param changes
     *        changes
     */
    public OWLEntityCreationSet(E owlEntity, List<? extends OWLOntologyChange> changes) {
        this.owlEntity = owlEntity;
        this.changes = new ArrayList<>(changes);
    }

    /**
     * @param owlEntity
     *        owlEntity
     */
    public OWLEntityCreationSet(E owlEntity) {
        this.owlEntity = owlEntity;
        this.changes = new ArrayList<>();
        // changes.add(new AddEntity(ontology, owlEntity, null));
    }

    /**
     * @return entity
     */
    public E getOWLEntity() {
        return this.owlEntity;
    }

    /**
     * @return changes
     */
    public List<? extends OWLOntologyChange> getOntologyChanges() {
        return this.changes;
    }
}
