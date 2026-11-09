package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.*;

public class GraphData {
  static class Graph {
    private final Map<String, List<String>> adj = new HashMap<>();

    public void addVertex(String v) {
      adj.computeIfAbsent(v, k -> new ArrayList<>());
    }

    public void addEdge(String u, String v) {
      addVertex(u);
      addVertex(v);
      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    public void printAdjacency() {
      for (var entry : adj.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
      }
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph();

    g.addEdge("A", "B");
    g.addEdge("A", "C");
    g.addEdge("B", "D");
    g.addEdge("C", "D");

    g.printAdjacency();
  }
}