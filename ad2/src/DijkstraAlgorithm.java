
import java.util.*;

public class DijkstraAlgorithm {

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        Node(int v, int w) {
            vertex = v;
            weight = w;

        }

        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static void dijkstra(ArrayList<ArrayList<Node>> graph, int source) {
        int V = graph.size();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[V];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        dist[source] = 0;
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            if (visited[u]) continue;
            visited[u] = true;

            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!visited[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        // Print the shortest distances from the source to all other vertices
        for (int i = 0; i < V; i++) {
            System.out.println("Shortest distance from " + source + " to " + i + " is " + dist[i]);
        }
    }


    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int source = 0; // Source vertex

        // Create the graph
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges to the graph
        graph.get(0).add(new Node(1, 9));
        graph.get(0).add(new Node(2, 6));
        graph.get(0).add(new Node(3, 5));
        graph.get(0).add(new Node(4, 3));
        graph.get(2).add(new Node(1, 2));
        graph.get(2).add(new Node(3, 4));

        // Call Dijkstra's algorithm from source vertex
        dijkstra(graph, source);
    }
}
