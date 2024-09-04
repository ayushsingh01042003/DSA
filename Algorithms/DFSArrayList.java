import java.util.*;

public class DFSArrayList {
    public static void main(String[] args) {
        // Create the Graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        graph.add(new ArrayList<>(List.of(1, 2)));
        graph.add(new ArrayList<>(List.of(1, 5)));
        graph.add(new ArrayList<>(List.of(1, 6)));
        graph.add(new ArrayList<>(List.of(2, 3)));
        graph.add(new ArrayList<>(List.of(2, 4)));

        int n = 7;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge : graph) {
            adjList.get(edge.get(0)).add(edge.get(1));
            adjList.get(edge.get(1)).add(edge.get(0));
        }

        boolean[] visited = new boolean[n];
        dfs(1, adjList, visited);

    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited) {
        visited[node] = true;
        System.out.println(node + " ");

        for(int adjNode : adjList.get(node)) {
            if(!visited[adjNode]) {
                dfs(adjNode, adjList, visited);
            }
        }
    }
}