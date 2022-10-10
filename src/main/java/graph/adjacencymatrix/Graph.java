package graph.adjacencymatrix;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst, int dist) {
        matrix[src][dst] = dist;
    }

    public boolean checkEdge(int src, int dst) {
        if(matrix[src][dst] >0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int distCalculation(int src, int dst) {
        if (checkEdge(src, dst)) {
            return matrix[src][dst];
        }
        else return 0;
    }




    public void print() {
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}