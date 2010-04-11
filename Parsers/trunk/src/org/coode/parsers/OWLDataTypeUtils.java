package org.coode.parsers;

import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDataType;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;
import org.semanticweb.owl.vocab.OWLRDFVocabulary;
import org.semanticweb.owl.vocab.XSDVocabulary;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
/*
* Copyright (C) 2007, University of Manchester
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

/**
 * Author: drummond<br>
 * http://www.cs.man.ac.uk/~drummond/<br><br>
 * <p/>
 * The University Of Manchester<br>
 * Bio Health Informatics Group<br>
 * Date: Sep 11, 2008<br><br>
 */
public class OWLDataTypeUtils {

    private OWLOntologyManager mngr;


    public OWLDataTypeUtils(OWLOntologyManager mngr) {
        this.mngr = mngr;
    }


    public Set<OWLDataType> getBuiltinDatatypes(){
        Set<OWLDataType> datatypes = new HashSet<OWLDataType>();
        final OWLDataFactory df = mngr.getOWLDataFactory();

        // the top datatype
        datatypes.add(df.getOWLDataType(OWLRDFVocabulary.RDFS_LITERAL.getURI()));

        datatypes.add(df.getTopDataType());
        for (URI uri : XSDVocabulary.ALL_DATATYPES) {
            datatypes.add(df.getOWLDataType(uri));
        }
        datatypes.add(df.getOWLDataType(OWLRDFVocabulary.RDF_XML_LITERAL.getURI()));

        return datatypes;
    }


    public Set<OWLDataType> getReferencedDatatypes(Set<OWLOntology> onts){
        Set<OWLDataType> referencedTypes = new HashSet<OWLDataType>();
        for (OWLOntology ont : onts){
            referencedTypes.addAll(ont.getReferencedDatatypes());
        }
        return referencedTypes;
    }


    public Set<OWLDataType> getKnownDatatypes(Set<OWLOntology> onts){
        Set<OWLDataType> knownTypes = getBuiltinDatatypes();
        for (OWLOntology ont : onts){
            knownTypes.addAll(ont.getReferencedDatatypes());
        }
        return knownTypes;
    }
}