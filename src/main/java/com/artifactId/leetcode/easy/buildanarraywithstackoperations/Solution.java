package com.artifactId.leetcode.easy.buildanarraywithstackoperations;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public List<String> buildArray(int[] target, int n) {
    List<String> ans = new LinkedList<>();
    int end = target[target.length - 1] + 1;
    int targetIndex = 0;
    for (int i = 1; i < end; i++) {
      ans.add("Push");
      if (target[targetIndex] == i) {
        targetIndex++;
      } else {
        ans.add("Pop");
      }
    }
    return ans;
  }

}
