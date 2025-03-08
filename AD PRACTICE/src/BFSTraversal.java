
import java.util.*;

public class BFSTraversal {

    public static void main(String[] args) {
        // Create a sample graph
        int vertices = 6;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(vertices);

        // Initialize adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 3, 5);
        addEdge(adjList, 4, 5);

        System.out.println("BFS Traversal:");
        bfs(adjList, 0);
    }

    // Add edge to the adjacency list
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // For undirected graph
    }

    // BFS traversal from a given source vertex
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int source) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()]; // To track visited nodes

        // Mark the source node as visited and enqueue it
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Visit all adjacent vertices of current vertex
            for (int neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }

        }
        System.out.println();
    }
}
