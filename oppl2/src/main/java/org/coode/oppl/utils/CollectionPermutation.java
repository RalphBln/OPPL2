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
package org.coode.oppl.utils;

import static org.coode.oppl.utils.ArgCheck.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.coode.oppl.search.SearchTree;

class PermutationState<N> {

    private final Collection<N> referenceCollection;
    private final List<N> sequence = new ArrayList<>();
    private final boolean isGoal;

    /**
     * @param referenceCollection
     *        referenceCollection
     * @param sequence
     *        sequence
     */
    PermutationState(Collection<N> referenceCollection, List<N> sequence) {
        this.referenceCollection = checkNotNull(referenceCollection,
            "referenceCollection");
        this.sequence.addAll(sequence);
        this.isGoal = referenceCollection.size() == this.getSequence().size();
    }

    /**
     * @return the referenceCollection
     */
    public Collection<N> getReferenceCollection() {
        return this.referenceCollection;
    }

    /**
     * @return the isGoal
     */
    public boolean isGoal() {
        return this.isGoal;
    }

    /**
     * @return the sequence
     */
    public List<N> getSequence() {
        return this.sequence;
    }
}

/**
 * @author Luigi Iannone
 * @param <N>
 *        type
 */
public class CollectionPermutation<N> extends SearchTree<PermutationState<N>> {

    private CollectionPermutation() {}

    @Override
    protected List<PermutationState<N>> getChildren(PermutationState<N> node) {
        List<PermutationState<N>> toReturn = new ArrayList<>();
        Collection<N> remainder = new HashSet<>(node.getReferenceCollection());
        remainder.removeAll(node.getSequence());
        for (N n : remainder) {
            List<N> newSequence = new ArrayList<>(node.getSequence());
            newSequence.add(n);
            toReturn.add(new PermutationState<>(node.getReferenceCollection(),
                newSequence));
        }
        return toReturn;
    }

    @Override
    protected boolean goalReached(PermutationState<N> node) {
        return node.isGoal();
    }

    /**
     * @param collection
     *        collection
     * @param <O>
     *        collection type
     * @return all permutations
     */
    public static <O> Set<List<O>> getAllPermutations(Collection<O> collection) {
        CollectionPermutation<O> setPermutation = new CollectionPermutation<>();
        Set<List<O>> toReturn = new HashSet<>();
        List<List<PermutationState<O>>> solutions = new ArrayList<>();
        setPermutation.exhaustiveSearchTree(new PermutationState<>(collection,
            new ArrayList<O>()), solutions);
        for (List<PermutationState<O>> solution : solutions) {
            toReturn.add(solution.get(solution.size() - 1).getSequence());
        }
        return toReturn;
    }
}
