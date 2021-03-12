package com.artifactId.leetcode.medium.checkIfastringcontainsallbinarycodesofsizek;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean hasAllCodes(String s, int k) {
    double pow = Math.pow(2, k);
    Set<String> set = new HashSet<>();
    for (int i = 0; i < s.length() - k + 1; i++) {
      String substring = s.substring(i, i + k);
      set.add(substring);
    }

    return pow == set.size();
  }

}
