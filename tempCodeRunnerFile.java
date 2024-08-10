class Graph{{
    Map<Integer, List<Integer>> adjList;
    
    public void Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex){
        adjList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination){
        if (!adjList.contains(source))
            addVertex(source);
        if (!adjList.contains(destination))
            addVertex(destination);

        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void topologicalSort(){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adjList.size()];

        for (int vertex : adjList.keySet()){
            if (!visited[vertext]){
                dfs(vertex. visited, stack);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public void dfs(int vertex, boolean[] visited, Stack<Integer> stack){
        visited[vertex] = true;

        for (int neighbor: adjList.get(i)){
            if (!visited[neighbor]){
                dfs(neighbor, visited, stack);
            }
        }

        stack.push(vertex);
    }
}