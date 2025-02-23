import java.util.*;

class Dijikstra {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        List<List<Pair>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }
        
        Stack<Integer> stack = new Stack<>();
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(adj, visited, i, stack);
            }
        }
        
        while(!stack.isEmpty()) {
            int topNode = stack.pop();
            
            if(distance[topNode] != Integer.MAX_VALUE) {
                for(Pair pair : adj.get(topNode)) {
                    distance[pair.node] = Math.min(
                        distance[pair.node],
                        distance[topNode] + pair.distance
                    );
                }
            } else {
                distance[topNode] = -1;
            }
        }
        return distance;
    }
    
    void dfs(List<List<Pair>> adj, boolean[] visited, int currNode, Stack<Integer> stack) {
        visited[currNode] = true;
        
        for(Pair pair : adj.get(currNode)) {
            if(!visited[pair.node]) {
                dfs(adj, visited, pair.node, stack);
            }
        }
        stack.push(currNode);
    }
}

class Pair {
    int node;
    int distance;
    
    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}