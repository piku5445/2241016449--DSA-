import java.util.ArrayList;
import java.util.LinkedList;

public class bfsreaversal2 {

    public static void main(String[] args) {
        // Creating a graph
        int v = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);

        // Adding vertices to the adjacency list
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);

        // Source and destination vertices for BFS
        int src = 0; // Source vertex
        int dest = 4; // Destination vertex

        // Arrays to store predecessors and distances
        int[] pred = new int[v];
        int[] dist = new int[v];

        // Perform BFS
        boolean pathExists = bfs(adj, src, dest, v, pred, dist);

        if (pathExists) {
            System.out.println("There is a path from " + src + " to " + dest);
            System.out.print("The shortest path is: ");
            printShortestPath(pred, src, dest);
        } else {
            System.out.println("There is no path from " + src + " to " + dest);
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int cur = queue.remove();
            for (int i = 0; i < adj.get(cur).size(); i++) {
                int neighbour = adj.get(cur).get(i);
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    dist[neighbour] = dist[cur] + 1;
                    pred[neighbour] = cur;
                    queue.add(neighbour);
                    if (neighbour == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void printShortestPath(int pred[], int src, int dest) {
        // Helper method to print the shortest path
        ArrayList<Integer> path = new ArrayList<>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        System.out.print("Path: ");
        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }
}
