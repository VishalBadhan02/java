package Queues.graphs;

import java.util.LinkedList;
import java.util.Scanner;

class GraphImplement {
    LinkedList<Integer> linkedList[];

    public GraphImplement(int v) {
        linkedList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            linkedList[i] = new LinkedList<Integer>();
        }
    }

    public void insertN(int s, int d) {
        linkedList[s].add(d);

        System.out.print(linkedList[s]);
        System.out.print(linkedList[d]);
    }

}

public class Undirected {

    public static void main(String args[]) {
        int v;
        int e;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        v = sc.nextInt();
        System.out.println("Enter the number of edges");
        e = sc.nextInt();
        GraphImplement graphImplement = new GraphImplement(v);
        System.out.println("Enter the edge");
        for (int i = 0; i < e; i++) {
            System.out.println("edge");
            int s = sc.nextInt();
            System.out.println("destination");
            int d = sc.nextInt();
            graphImplement.insertN(s, d);
        }
    }

}
