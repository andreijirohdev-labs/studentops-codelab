package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.*;

public class DFSExample {
  static class Graph {
    private final Map<String, List<String>> adj = new HashMap<>();

    void addEdge(String u, String v) {
      adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
      adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    void dfs(String u, Set<String> visited) {
      visited.add(u);
      System.out.print(u + "");
      for (String v : adj.getOrDefault(u, List.of())) {
        if (!visited.contains(v)) {
          dfs(v, visited);
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

    System.out.println("DFS Traversal starting from A:");
    g.dfs("A", new HashSet<>());
  }
}
