package packages.algo.java.program.graph.traversal;

import java.util.ArrayList;
import java.util.List;

public class ShortestPathUsingBFS {
    private int vertex;
    private List<List<Integer>> adjNode;

    public ShortestPathUsingBFS(int value) {
        this.vertex = value;
        this.adjNode = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            adjNode.add(new ArrayList<>());
        }
    }

    private void add(int source, int dest) {
        adjNode.get(source).add(dest);
    }

    private int[] shortestPath(int root) {
        
    }

    public static void main(String[] args) {
        ShortestPathUsingBFS bfs = new ShortestPathUsingBFS(13);
        bfs.add(1, 2);
        bfs.add(2, 3);
        bfs.add(1, 5);
        bfs.add(5, 10);
        bfs.add(5, 6);
        bfs.add(6, 7);
        bfs.add(7, 9);
        bfs.add(6, 8);
        bfs.add(9, 8);
        bfs.add(10, 11);
        bfs.add(11, 12);
        bfs.add(12, 13);
        bfs.add(13, 8);

        int[] edges = bfs.shortestPath(1);
    }

}
