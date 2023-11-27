package src;

import java.util.*;

class MinDistanceGraph {
    private int V; // Number of vertices
    private List<List<Edge>> adj; // Adjacency list

    // Edge class to represent edges with weights
    class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    MinDistanceGraph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest, int weight) {
        adj.get(src).add(new Edge(dest, weight));
        adj.get(dest).add(new Edge(src, weight)); // For undirected graph
    }

    List<Integer> findShortestPath(int src, int dest) {
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(src);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (Edge edge : adj.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;

                if (distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                    pq.add(v);
                }
            }
        }

        List<Integer> shortestPath = new ArrayList<>();
        int current = dest;

        while (current != src) {
            shortestPath.add(current);
            for (Edge edge : adj.get(current)) {
                int v = edge.dest;
                int weight = edge.weight;
                if (distance[current] == distance[v] + weight) {
                    current = v;
                    break;
                }
            }
        }

        shortestPath.add(src);
        Collections.reverse(shortestPath);
        return shortestPath;
    }


    public class Main {
        public static void main(String[] args) {
            int V = 5; // Number of delivery points (nodes)
            MinDistanceGraph graph = new MinDistanceGraph(V);

            // Add edges and distances between delivery points
            graph.addEdge(0, 1, 10);
            graph.addEdge(0, 2, 15);
            graph.addEdge(1, 2, 10);
            graph.addEdge(1, 3, 12);
            graph.addEdge(2, 4, 10);
            graph.addEdge(3, 4, 5);

            int source = 0; // Starting delivery point
            int destination = 4; // Destination delivery point

            List<Integer> shortestPath = graph.findShortestPath(source, destination);

            System.out.println("Shortest Path: " + shortestPath);
        }
    }
}