import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source))
            addVertex(source);

        if (!adjacencyList.containsKey(destination))
            addVertex(destination);

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Undirected graph
    }

    public List<List<Integer>> findConnectedComponents() {
        Set<Integer> visited = new HashSet<>();
        List<List<Integer>> connectedComponents = new ArrayList<>();

        for (Integer vertex : adjacencyList.keySet()) {
            if (!visited.contains(vertex)) {
                List<Integer> component = new ArrayList<>();
                dfsUtil(vertex, visited, component);
                connectedComponents.add(component);
            }
        }
        return connectedComponents;
    }

    private void dfsUtil(int vertex, Set<Integer> visited, List<Integer> component) {
        visited.add(vertex);
        component.add(vertex);

        for (Integer neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited, component);
            }
        }
    }
}

public class ConnectedComponentsExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(7, 8);

        System.out.println("Connected components:");
        List<List<Integer>> components = graph.findConnectedComponents();
        for (List<Integer> component : components) {
            System.out.println(component);
        }
    }
}
