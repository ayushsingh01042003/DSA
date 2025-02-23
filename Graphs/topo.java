import java.util.*;
// Iterate over the nodes while doing dfs
// have a stack and put node in stack once dfs for it is done
// pop and print the stack

//The nodes are 0 indexed 
public class topo {
    public static void main(String[] args) {
        System.out.println("Enter the no of nodes");

        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();

        int[][] adj = new int[nodes][nodes];
        
        System.out.println("Enter the adj matrix");
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                adj[i][j] = in.nextInt();
            }
        }

        toposort(adj);
    }

    static void toposort(int[][] adjacency) {
        boolean[] visited = new boolean[adjacency.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                dfs(adjacency, visited, stack, i);
            }
        }

        while(!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

    static void dfs(int[][] adjacency, boolean[] visited, Stack<Integer> stack, int node) {
        visited[node] = true;

        for(int i = 0; i < adjacency.length; i++) {
            if(!visited[i] && adjacency[node][i] == 1) {
                dfs(adjacency, visited, stack, i);
            }
        }
        stack.push(node);
    }
}
