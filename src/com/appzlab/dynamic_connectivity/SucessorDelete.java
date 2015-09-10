package com.appzlab.dynamic_connectivity;

/**
 * Successor with delete. Given a set of N integers S={0,1,...,N−1} and a sequence of requests of the following form:
 *
 * Remove x from S
 * Find the successor of x: the smallest y in S such that y≥x.
 *
 * design a data type so that all operations (except construction) should take logarithmic time or better.
 */
public class SucessorDelete {
    /* Store all values */
    private int[] id;

    /**
     * Constructor
     *
     * Creates the array with all elements.
     * @param n size of the problem
     */
    public SucessorDelete(int n)
    {
        /* Creates the array of N elements */
        id = new int[n];

        /* Initialize all of them */
        for (int i = 0; i < n; i++)
            id[i] = n - 1;
    }

    /**
     * Recursive function to get Root
     * @param i value to check
     * @return the root of i value in id
     */
    public int root(int i)
    {
        if ( i == id[i] ) return i;

        /* Go to the grandparent of node (log-star complexity) */
        return root(id[id[i]]);
    }

    public void remove(int p)
    {
        /* Is root? */
        if ( id[p] == p )
            id[p] =

        /* Assign to be child of the next element */
        id[p] = p + 1;
    }
}
