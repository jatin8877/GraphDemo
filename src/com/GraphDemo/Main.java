package com.GraphDemo;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,3);
//        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(4,0);
        g.addEdge(4,1);

        for (int i = 0; i < g.novert; i++) {
            System.out.println("vertex "+i);
            g.BFT(i);
            System.out.println();
        }
    }
}
