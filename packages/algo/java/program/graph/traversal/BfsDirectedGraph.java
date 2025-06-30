package packages.algo.java.program.graph.traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BfsDirectedGraph {

    private int numVertices;
    private List<List<Integer>> adjList;

    public BfsDirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // for directed graph
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }

    public void bfsTraversal(int root) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[root] = true;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println(current);

            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BfsDirectedGraph graph = new BfsDirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.bfsTraversal(0);
    }
}
