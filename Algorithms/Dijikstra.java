class Solution {
    public Map<Integer, Integer> shortestPath(int n, List<List<Integer>> edges, int src) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<int[]>> adj = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(List<Integer> edge : edges) {
            adj.get(edge.get(0)).add(new int[]{ edge.get(1), edge.get(2) });
        }

        minHeap.add(new int[]{ 0, src });

        while(!minHeap.isEmpty()) {
            int[] top = minHeap.remove();
            int topNode = top[1];
            int topDist = top[0];

            if(map.containsKey(topNode)) {
                continue;
            }

            map.put(topNode, topDist);

            for(int[] edge : adj.get(topNode)) {
                int newNode = edge[0], newDist = edge[1];

                if(map.containsKey(newNode)) {
                    minHeap.add(new int[]{ topDist + newDist, newNode });
                }
            }
        }

        for(int i = 0; i < n; i++) {
            map.putIfAbsent(i, -1);
        }

        return map;
    } 
}
