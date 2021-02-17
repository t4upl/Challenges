package com.artifactId.leetcode.medium.containerwithmostwater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 21 ms, faster than 26.14% of Java online submissions for Container With Most Water.
 * Memory Usage: 41.8 MB, less than 18.57% of Java online submissions for Container With Most Water.
 */
public class Solution {

  public int maxArea(int[] height) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < height.length; i++) {
      int int1 = height[i];
      List<Integer> integerList = map.computeIfAbsent(int1, key -> new ArrayList<>(2));
      if (integerList.isEmpty()) {
        integerList.add(i);
        integerList.add(i);
      } else {
        integerList.set(1, i);
      }
    }

    List<Integer> keys = sortKeys(map);
    int smallerPrv = Integer.MAX_VALUE;
    int biggerPrv =  Integer.MIN_VALUE;
    int ans = 0;
    for (Integer key: keys) {
      List<Integer> value = map.get(key);
      int min = Math.min(smallerPrv, value.get(0));
      int max = Math.max(biggerPrv, value.get(value.size() - 1));

      if (min != max) {
        ans = Math.max(ans, (max - min) * key);
      }
      smallerPrv = min;
      biggerPrv =  max;
    }

    return Math.max(ans, 0);
  }

  private List<Integer> sortKeys(Map<Integer, List<Integer>> map) {
    List<Integer> list = new ArrayList<>();
    for (Integer integer : map.keySet()) {
      list.add(integer);
    }
    list.sort(Collections.reverseOrder());
    return list;
  }

}
