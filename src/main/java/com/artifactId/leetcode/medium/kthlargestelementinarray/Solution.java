package com.artifactId.leetcode.medium.kthlargestelementinarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

  public int findKthLargest(int[] nums, int k) {
    List<Integer> collect = new ArrayList<>();
    for (int num : nums) {
      Integer integer = num;
      collect.add(integer);
    }
    collect.sort(Collections.reverseOrder());
    return collect.get(k -1);
  }

}
