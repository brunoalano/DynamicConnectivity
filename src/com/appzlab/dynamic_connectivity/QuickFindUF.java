package com.appzlab.dynamic_connectivity;

/**
 * Quick Find Algorithm
 *
 * This algorithm runs using n^2 time, when I've N elements with
 * N operations. (because of union method);
 */
public class QuickFindUF {
    /**
     * Identifiers
     */
    public int[] id;

    /**
     * Creates a new instance of Quick Find Algorithm
     *
     * @param n this is the amount of numbers in array
     */
    public QuickFindUF(int n)
    {
        this.id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    /**
     * Check if both elements are connected
     * @param p index of the first element
     * @param q index of the second element
     * @return true if they are connected
     */
    public boolean connected(int p, int q)
    {
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        /* Base case */
        if (id[p] == id[q]) return;

        /* Get the value of q */
        int find_criteria = id[q];

        /* Replace all the value in criteria with p */
        for (int i = 0; i < id.length; i++)
            if (id[i] == find_criteria) id[i] = id[p];

    }

}
