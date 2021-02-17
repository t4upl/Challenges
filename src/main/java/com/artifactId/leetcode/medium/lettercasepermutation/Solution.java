package com.artifactId.leetcode.medium.lettercasepermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Runtime: 10 ms, faster than 21.85% of Java online submissions for Letter Case Permutation.
 * Memory Usage: 39.4 MB, less than 96.26% of Java online submissions for Letter Case Permutation.
 */
public class Solution {

  public List<String> letterCasePermutation(String S) {
    S = S.toLowerCase();
    char[] chars = S.toCharArray();
    List<String> ans = new ArrayList<>();
    ans.add("");
    for (char aChar : chars) {
      List<String> collect = ans.stream()
        .flatMap(x -> addLastLetter(x, aChar))
        .map(x -> (String)x)
        .collect(Collectors.toList());

      ans.clear();
      ans.addAll(collect);
    }

    return ans;

  }

  private Stream<?> addLastLetter(String x, char aChar) {
    if (Character.isDigit(aChar)) {
      return Stream.of(x + String.valueOf(aChar));
    }

    return Stream.of(x + String.valueOf(aChar), x + String.valueOf(aChar).toUpperCase());
  }


}
