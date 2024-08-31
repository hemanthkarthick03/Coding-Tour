import java.util.*;
import java.io.*;

class CyclicGraph {

    public static boolean cycleDFS(List<List<Integer>> graph, int x, boolean[] visit, boolean[] recStack) {
        if (recStack[x])
            return true;

        if (visit[x])
            return false;

        visit[x] = true;
        recStack[x] = true;

        for (int i : graph.get(x)) {
            if (cycleDFS(graph, i, visit, recStack)) {
                return true;
            }
        }

        recStack[x] = false;

        return false;

    }

    public static boolean isCyclic(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visit = new boolean[n + 1];
        boolean[] recStack = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (cycleDFS(graph, i, visit, recStack))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        int n = 5;

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(3).add(4);
        graph.get(4).add(0);

        String s = (isCyclic(graph)) ? "Cyclic" : "Not Cyclic Graph";

        System.out.println(s);
    }
}