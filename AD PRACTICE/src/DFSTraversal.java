
import java.util.*;

public class DFSTraversal {

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

        System.out.println("DFS Traversal:");
        boolean[] visited = new boolean[vertices];
        dfs(adjList, 0, visited);
    }

    // Add edge to the adjacency list
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // For undirected graph
    }

    // DFS traversal from a given source vertex
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited) {
        visited[source] = true;
        System.out.print(source + " ");

        for (int neighbor : adj.get(source)) {
            if (!visited[neighbor]) {
                dfs(adj, neighbor, visited);
            }
        }
    }
}
