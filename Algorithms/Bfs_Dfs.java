import java.util.*;

class Bfs_Dfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>(Arrays.asList(4)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
    }

    void bfs(ArrayList<ArrayList<Integer>> adj, int v) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];

        visited[0] = true;
        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.remove();
            ans.add(curr);

            for(int i : adj.get(curr)) {
                if(!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }

        System.out.println(ans);
    }


    void dfs(ArrayList<ArrayList<Integer>> adj, int v) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[v];

        dfsHelp(0, adj, ans, visited);
        System.out.println(ans);
    }

    void dfsHelp(int i, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited) {
        visited[i] = true;
        ans.add(i);

        for(int node : adj.get(i)) {
            if(!visited[node]) {
                dfsHelp(node, adj, ans, visited);
            }
        }
    }

}