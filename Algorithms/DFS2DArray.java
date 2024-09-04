import java.util.*;

public class DFS2DArray {
    public static void main(String[] args) {
        int[][] edges = {
            {1, 2},
            {1, 5},
            {1, 6},
            {2, 3},
            {2, 4}
        };

        int n = 7;
        int [][] adjMatrix = new int[n][n];

        for(int[] edge : edges) {
            adjMatrix[edge[0]][edge[1]] = 1;
            adjMatrix[edge[1]][edge[0]] = 1;
        }

        boolean[] visited = new boolean[n];
        dfs(1, adjMatrix, visited);
    }

    private static void dfs(int node, int[][] adjMatrix, boolean[] visited) {
        visited[node] = true;
        System.out.println(node + " ");

        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[node][i] == 1 && !visited[i]) {
                dfs(i, adjMatrix, visited);
            }
        }
    }
}
