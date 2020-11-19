package com.artifactId.leetcode.medium.mergeIntevals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  Runtime: 8 ms, faster than 15.43% of Java online submissions for Merge Intervals.
 *  Memory Usage: 41.4 MB, less than 87.56% of Java online submissions for Merge Intervals.
 */
public class Solution {

  public int[][] merge(int[][] intervals) {

    Arrays.sort(intervals, Comparator.comparing(x -> x[0]));
    List<int[]> result = new ArrayList<>();

    result.add(intervals[0]);

    for (int i = 1; i < intervals.length; i++) {
      int[] prev = result.get(result.size() - 1);
      int[] curr = intervals[i];
      if (prev[1] < curr[0]) {
        result.add(curr);
      } else {
        prev[1] = Math.max(prev[1], curr[1]);
      }
    }

    return result.toArray(new int[result.size()][]);
  }

}
