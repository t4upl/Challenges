package com.artifactId.leetcode.hard.busroutes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Runtime: 347 ms, faster than 12.03% of Java online submissions for Bus Routes.
 * Memory Usage: 49.2 MB, less than 87.82% of Java online submissions for Bus Routes.
 */
public class Solution {

  public int numBusesToDestination(int[][] routes, int S, int T) {
    Set<Set<Integer>> routesSet = new HashSet<>(routes.length);
    initRoutesSet(routes, routesSet);
    Set<Set<Integer>> routesAtLevel = new HashSet<>(1);
    Integer[] startBusStop = {S};
    routesAtLevel.add(new HashSet<>((Arrays.asList(startBusStop))));

    return dfs(0, routesSet, routesAtLevel, T);
  }

  private int dfs(int level, Set<Set<Integer>> routesSet, Set<Set<Integer>> routesAtLevel, int T) {
    if (routesAtLevel.isEmpty())  {
      return -1;
    }

    Set<Integer> allBusStopsAtLevel = getAllBusStopAtlevel(routesAtLevel);
    if (allBusStopsAtLevel.contains(T)) {
      return level;
    }

    Set<Set<Integer>> newRoutesAtLevel = new HashSet<>();
    for (Integer busStopAtLevel : allBusStopsAtLevel) {

      Set<Set<Integer>> routesToBeRemoved = new HashSet<>();
      for (Set<Integer> route: routesSet) {
        if (route.contains(busStopAtLevel))  {
          newRoutesAtLevel.add(route);
          routesToBeRemoved.add(route);
        }
      }

      routesSet.removeAll(routesToBeRemoved);
    }

    return dfs(level + 1, routesSet, newRoutesAtLevel, T);
  }

  private Set<Integer> getAllBusStopAtlevel(Set<Set<Integer>> routesAtLevel) {
    Set<Integer> set = new HashSet<>();
    for (Set<Integer> integers : routesAtLevel) {
      set.addAll(integers);
    }
    return set;
  }

  private void initRoutesSet(int[][] routes, Set<Set<Integer>> routesSet) {
    for (int[] route: routes) {
      Set<Integer> collect = new HashSet<>();
      for (int expected : route) {
        Integer integer = expected;
        collect.add(integer);
      }
      routesSet.add(collect);
    }
  }

}
