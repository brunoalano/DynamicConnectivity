package com.appzlab.dynamic_connectivity;

public class Main {

    public static void main(String[] args) {
        /* Create simple test */
	    QuickUnion test = new QuickUnion(1000000);

        for (int i = 1; i < 1000000; i++)
            test.union(i - 1, i);

        /* Check if they are connected */
        for (int i = 1; i < 1000000; i++)
            System.out.println(i - 1 + " is" + (test.connected(i-1, i) ? " " : " not ") + "connected to " + i);
    }
}
