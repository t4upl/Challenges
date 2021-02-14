package com.artifactId.leetcode.medium.isgraphbipartie;

import java.util.stream.IntStream;

/**
 * Runtime: 3 ms, faster than 21.98% of Java online submissions for Is Graph Bipartite?.
 * Memory Usage: 39.6 MB, less than 50.70% of Java online submissions for Is Graph Bipartite?.
 */
public class Solution {

  private boolean errorFound = false;
  private int[] colors;
  private int[] visited;
  private int visitedCount;

  public boolean isBipartite(int[][] graph) {
    this.colors = new int[graph.length];
    this.visited = new int[graph.length];

    while (visitedCount != graph.length && !errorFound) {
      int index = IntStream.range(0, visited.length).filter(x -> visited[x] == 0).findFirst()
        .getAsInt();
      dfs(graph, index, 1);
    }

    return !errorFound;
  }



  private void dfs(int[][] graph, int index, int color) {
    if (this.visited[index] == 1) {
      return;
    }

    this.visited[index] = 1;
    visitedCount++;
    mark(graph, index, color);

    if (errorFound) {
      return;
    }

    color = color == 1 ? 2 : 1;
    int[] neighbours = graph[index];
    for (int neighbour : neighbours) {
      dfs(graph, neighbour, color);
    }


  }

  private void mark(int[][] graph, int index, int color) {
    if (colors[index] != 0 && colors[index]!= color) {
      errorFound = true;
      return;
    }
    int[] neighbours = graph[index];
    for (int neighbour : neighbours) {
      if (colors[neighbour] != 0 && colors[neighbour] == color) {
        errorFound = true;
        return;
      }
    }

    colors[index] = color;
  }

}
