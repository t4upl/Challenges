package com.artifactId.leetcode.medium.groupanagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Runtime: 19 ms, faster than 19.40% of Java online submissions for Group Anagrams.
 * Memory Usage: 43.1 MB, less than 32.61% of Java online submissions for Group Anagrams.
 */
public class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      String str = strs[i];
      String key = getCollect(str);
      List<String> list = map.computeIfAbsent(key, j -> new LinkedList<>());
      list.add(str);
    }

    return new ArrayList<>(map.values());
  }

  private String getCollect(String str) {
    return str.chars().sorted().mapToObj(x -> (Character.toString(((char) x))))
      .collect(Collectors.joining());
  }

}
