package com.artifactId.leetcode.jewelsandstones;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Runtime: 7 ms, faster than 5.92% of Java online submissions for Jewels and Stones.
 * Memory Usage: 38.4 MB, less than 5.05% of Java online submissions for Jewels and Stones.
 */
public class SolutionImpl implements Solution {

  @Override
  public int numJewelsInStones(String J, String S) {
    char[] j = J.toCharArray();
    char[] s = S.toCharArray();
    Set<Character> jSet = IntStream.range(0, j.length).mapToObj(i -> j[i])
      .collect(Collectors.toSet());

    return (int)IntStream.range(0, s.length).mapToObj(i -> s[i]).filter(jSet::contains).count();
  }
}
