import java.util.*;

class DijkstraAlgo {
    public static void main(String[] args) {
        List<List<int[]>> graph = new ArrayList<>();
        int num = 5;

        for (int i = 0; i < num; i++) {
            graph.add(new ArrayList<>());
        }

        // Exp - 1
        graph.get(0).add(new int[] { 1, 5 });
        graph.get(1).add(new int[] { 2, 6 });
        graph.get(1).add(new int[] { 3, 3 });
        graph.get(2).add(new int[] { 4, 2 });
        graph.get(3).add(new int[] { 4, 4 });

        // graph.get(0).add(new int[] { 1, 4 });
        // graph.get(0).add(new int[] { 2, 1 });
        // graph.get(2).add(new int[] { 1, 2 });
        // graph.get(1).add(new int[] { 3, 1 });
        // graph.get(2).add(new int[] { 3, 5 });

        int start = 0;
        int dest = 2;

        // Call the static version of dijkstra method
        int[] distances = dijkstra(start, graph);

        System.out.println("Distance from start to end: " + distances[dest]);
        // // Print the distances
        // System.out.println("Distances from node " + start + ":");
        // for (int i = 0; i < distances.length; i++) {
        // if (distances[i] == Integer.MAX_VALUE) {
        // System.out.println("Node " + i + ": Unreachable");
        // } else {
        // System.out.println("Node " + i + ": " + distances[i]);
        // }
        // }
    }

    /* Dijkstra Method */
    public static int[] dijkstra(int start, List<List<int[]>> graph) {
        int num = graph.size();
        int[] dist = new int[num];
        boolean[] visited = new boolean[num];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { start, 0 });

        while (!pq.isEmpty()) {
            int[] u = pq.poll();
            int currentNode = u[0];
            int currentDist = u[1];

            // Skip if the node is already visited
            if (visited[currentNode])
                continue;
            visited[currentNode] = true;

            if (currentDist > dist[currentNode])
                continue;

            for (int[] edge : graph.get(currentNode)) {
                int neighbor = edge[0];
                int weight = edge[1];

                if (dist[currentNode] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[currentNode] + weight;
                    pq.add(new int[] { neighbor, dist[neighbor] });
                }
            }
        }
        return dist;
    }
}
