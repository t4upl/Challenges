package com.artifactId.leetcode.other.permutationtwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runtime: 4 ms, faster than 31.17% of Java online submissions for Permutations II.
 * Memory Usage: 39.8 MB, less than 7.82% of Java online submissions for Permutations II.
 */
public class Solution {

  public List<List<Integer>> permuteUnique(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, Integer> used = new HashMap<>();
    for (int num : nums) {
      freq.putIfAbsent(num, 0);
      used.putIfAbsent(num, 0);
      freq.put(num, freq.get(num) + 1);
    }
    Set<Integer> numSet = toSet(nums);

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> acc = new ArrayList<>();
    perm(result, acc, freq, used, numSet, nums.length);
    return result;
  }

  private Set<Integer> toSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      Integer integer = num;
      set.add(integer);
    }
    return set;
  }

  private void perm(List<List<Integer>> result, List<Integer> acc,
    Map<Integer, Integer> freq, Map<Integer, Integer> used, Set<Integer> numSet, int length) {

    if (acc.size() == length) {
      result.add(new ArrayList<>(acc));
      return;
    }

    for (int num : numSet) {
      Integer usedVal = used.get(num);
      if (usedVal < freq.get(num)) {
        acc.add(num);
        used.put(num, used.get(num) + 1);
        perm(result, acc, freq, used, numSet, length);
        used.put(num, used.get(num) - 1);
        acc.remove(acc.size() - 1);
      }
    }

  }


}
