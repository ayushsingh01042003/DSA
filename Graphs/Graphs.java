// import java.util.*;

// class Graph {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
        
//         System.out.println("Enter the number of n and m");
        
//         int n = in.nextInt();
//         int m = in.nextInt();
        
//         // adjacency matrix
//         // int[][] adj = new int[n + 1][n + 1];


//         // //Take the loop for the number of edges

//         // for(int i = 0; i < m; i++) {

//         //     System.out.println("Enter a and b");
//         //     int a = in.nextInt();
//         //     int b = in.nextInt();

//         //     adj[a][b] = 1;
//         //     adj[b][a] = 1;

//         // }

//         //adjacency list

//         List<List<Integer>> al = new ArrayList<>(n + 1);

//         for(int i = 0; i <= n; i++) {
//             al.add(new ArrayList<>());
//         }

//         for(int i = 0; i <= n; i++) {
//             int a = in.nextInt();
//             int b = in.nextInt();

//             al.get(a).add(b);
//             al.get(b).add(a);

//         }   
        
//         System.out.println(al);
//         // bfs(al);
//         dfsTraversal(al);

//     }

//     // static void bfs(List<List<Integer>> adj) {
//     //     Queue<Integer> q = new LinkedList<>();
//     //     q.add(1);
//     //     int arr[] = new int[adj.size()];
//     //     arr[1] = 1; // Mark the starting node as visited

//     //     while (!q.isEmpty()) {
//     //         int currentNode = q.poll(); // Get and remove the front node
//     //         System.out.println(currentNode);

//     //         // Explore adjacent nodes
//     //         for (int neighbor : adj.get(currentNode)) {
//     //             if (arr[neighbor] == 0) { // Check if the neighbor is not visited
//     //                 q.add(neighbor);
//     //                 arr[neighbor] = 1; // Mark the neighbor as visited
//     //             }
//     //         }
//     //     }
//     // }

//     static void dfs(List<List<Integer>> adj, int currentNode, int[] visited) {
//         System.out.println(currentNode); // Process the current node
//         visited[currentNode] = 1; // Mark the current node as visited

//         // Explore adjacent nodes
//             for (int neighbor : adj.get(currentNode)) {
//                 if (visited[neighbor] == 0) { // Check if the neighbor is not visited
//                     dfs(adj, neighbor, visited); // Recursively visit the neighbor
//                 }
//             }
//     }   

//     static void dfsTraversal(List<List<Integer>> adj) {
//         int numNodes = adj.size();
//         int[] visited = new int[numNodes]; // 0: Not visited, 1: Visited

//         // Start DFS from every unvisited node
//         for (int i = 1; i < numNodes; i++) { // Assuming nodes are 1-indexed
//             if (visited[i] == 0) {
//                 dfs(adj, i, visited);
//             }
//         }
//     }


// }