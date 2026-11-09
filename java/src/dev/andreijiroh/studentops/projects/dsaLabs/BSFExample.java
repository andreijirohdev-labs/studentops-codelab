package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.*;

public class BSFExample {
	static class Graph {
    private final Map<String, List<String>> adj = new HashMap<>();

    void addEdge(String u, String v) {
      adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
      adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    void bfs(String s) {
      Set<String> visited = new HashSet<>();
      Queue<String> q = new ArrayDeque<>();

      visited.add(s);
      q.add(s);

      while (!q.isEmpty()) {
        String u = q.poll();
        System.out.print(u + " ");
        for (String v : adj.getOrDefault(u, List.of())) {
          if (!visited.contains(v)) {
            visited.add(v);
            q.add(v);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph();

    g.addEdge("A", "B");
    g.addEdge("A", "C");
    g.addEdge("B", "D");
    g.addEdge("C", "D");

    System.out.println("BFS Traversal starting from A:");
    g.bfs("A");
  }
}
