import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjList.containsKey(source))
            addVertex(source);
        if (!adjList.containsKey(destination))
            addVertex(destination);

        adjList.get(source).add(destination);
        // adjList.get(destination).add(source);
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adjList.size()];

        for (int vertex : adjList.keySet()) {
            if (!visited[vertex]) {
                dfs(vertex, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public void dfs(int vertex, boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;

        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, stack);
            }
        }

        stack.push(vertex);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println("Topological Sort: ");
        graph.topologicalSort();
    }
}