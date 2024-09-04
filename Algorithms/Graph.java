import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjacencyList;

    static class Edge {
        int target;
        int weight;

        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int target, int weight) {
        adjacencyList[source].add(new Edge(target, weight));
        adjacencyList[target].add(new Edge(source, weight)); // for undirected graph
    }

    void dijkstra(int source) {
        PriorityQueue<Node> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.cost));
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distances, Integer.MAX_VALUE);
        pq.add(new Node(source, 0));
        distances[source] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int currentVertex = node.vertex;

            if (visited[currentVertex]) {
                continue;
            }
            visited[currentVertex] = true;

            for (Edge edge : adjacencyList[currentVertex]) {
                int neighbor = edge.target;
                int newDist = distances[currentVertex] + edge.weight;

                if (!visited[neighbor] && newDist < distances[neighbor]) {
                    distances[neighbor] = newDist;
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }

        printSolution(source, distances);
    }

    private void printSolution(int source, int[] distances) {
        System.out.println("Vertex \t Distance from Source " + source);
        for (int i = 0; i < distances.length; i++) {
            System.out.println(i + " \t\t " + distances[i]);
        }
    }

    static class Node {
        int vertex;
        int cost;

        Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 10);
        graph.addEdge(2, 4, 3);
        graph.addEdge(4, 3, 4);
        graph.addEdge(3, 5, 11);

        int source = 0;
        graph.dijkstra(source);
    }
}
