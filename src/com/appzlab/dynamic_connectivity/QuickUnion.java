package com.appzlab.dynamic_connectivity;

/**
 * Quick Union Algorithm
 */
public class QuickUnion {
    /* Store the array of integers as a forest data structure */
    private int[] id;

    /* Depth of trees */
    private int[] depths;

    /**
     * Constructor of Quick Union
     *
     * Takes time N to fill all the array.
     * @param n amount of elements in array
     */
    public QuickUnion(int n)
    {
        /* Allocate the array */
        this.id = new int[n];
        this.depths = new int[n];

        /* Fill it */
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
            this.depths[i] = 1;
        }
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

    /**
     * Check if p and q are connected
     * @param p node of forest
     * @param q node of forest
     * @return true if they are connected
     */
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    /**
     * Union the p-tree with q-tree (weighted)
     *
     * The root of q-tree will be the parent of
     * the root of p-tree (left association).
     *
     * @param p node
     * @param q node
     */
    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);

        /* Base */
        if (i == j) return;

        /* Weighted */
        if ( depths[i] >= depths[j] ) {
            id[j] = i;
            depths[i] += depths[j];
        } else {
            id[i] = j;
            depths[j] += depths[i];
        }
    }
}
