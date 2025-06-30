package packages.algo.java.program.graph.traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BfsUndirectedGraph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public BfsUndirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList.get(src).add(dest);
        adjacencyList.get(dest).add(src);
    }

    public void bfs(int root) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new ArrayDeque<>();
        visited[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            int element = queue.remove();
            System.out.println(element);

            for (int neighbor : adjacencyList.get(element)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }


    }

    public static void main(String[] args) {
        BfsUndirectedGraph bfsUndirectedGraph = new BfsUndirectedGraph(6);
        bfsUndirectedGraph.addEdge(0, 1);
        bfsUndirectedGraph.addEdge(0, 2);
        bfsUndirectedGraph.addEdge(1, 2);
        bfsUndirectedGraph.addEdge(2, 3);
        bfsUndirectedGraph.addEdge(3, 4);
        bfsUndirectedGraph.addEdge(4, 5);
        bfsUndirectedGraph.addEdge(3, 5);

        bfsUndirectedGraph.bfs(0);

    }

}
