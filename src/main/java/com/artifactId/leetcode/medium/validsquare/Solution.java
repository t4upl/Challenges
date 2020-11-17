package com.artifactId.leetcode.medium.validsquare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 3 ms, faster than 7.08% of Java online submissions for Valid Square.
 * Memory Usage: 37.2 MB, less than 7.35% of Java online submissions for Valid Square.
 */
public class Solution {

  public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    List<Pair> pairs = new ArrayList<>();
    pairs.add(new Pair(p1, p2));
    pairs.add(new Pair(p2, p3));
    pairs.add(new Pair(p3, p4));
    pairs.add(new Pair(p4, p1));
    pairs.add(new Pair(p1, p3));
    pairs.add(new Pair(p2, p4));

    Map<Double, Long> sideToCount = new HashMap<>();
    getSideToCount(pairs, sideToCount);

    boolean twoLengthsOfSides = sideToCount.size() == 2;
    if (!twoLengthsOfSides) {
      return false;
    }

    Iterator<Double> iterator = sideToCount.keySet().iterator();
    Double diagonal = iterator.next();
    Double side = iterator.next();

    if (diagonal < side) {
      Double temp = diagonal;
      diagonal = side;
      side = temp;
    }

    return sideToCount.get(diagonal) == 2 && sideToCount.get(side) == 4;
  }

  private void getSideToCount(List<Pair> pairs, Map<Double, Long> collect) {
    for (Pair pair : pairs) {
      Double dist = dist(pair);
      collect.merge(dist, 1L, Long::sum);
    }
  }

  private Double dist(Pair pair) {
    int[] p1 = pair.p1;
    int[] p2 = pair.p2;
    return Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2);
  }

  class Pair {
    int[] p1;
    int[] p2;

    public Pair(int[] p1, int[] p2) {
      this.p1 = p1;
      this.p2 = p2;
    }
  }


}
