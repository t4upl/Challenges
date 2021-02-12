package com.artifactId.leetcode.easy.validanagram;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public boolean isAnagram(String s, String t) {
    List<Integer> collect1 = s.chars().sorted().boxed().collect(Collectors.toList());
    List<Integer> collect2 = t.chars().sorted().boxed().collect(Collectors.toList());
    return collect1.equals(collect2);
  }

}
