package com.artifactId.leetcode.medium.keysandrooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Runtime: 1 ms, faster than 85.85% of Java online submissions for Keys and Rooms.
 * Memory Usage: 39 MB, less than 64.34% of Java online submissions for Keys and Rooms.
 */
public class Solution {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Set<Integer> visited = new HashSet<>();

    dfs(0, rooms, visited, rooms.size());
    return visited.size() == rooms.size();
  }

  private void dfs(int roomNumber, List<List<Integer>> rooms, Set<Integer> visited, int size) {
    if (visited.contains(roomNumber)) {
      return;
    }

    visited.add(roomNumber);
    List<Integer> roomAtNumber = rooms.get(roomNumber);
    for (Integer integer : roomAtNumber) {
     dfs(integer, rooms, visited, size);
    }
  }

}
