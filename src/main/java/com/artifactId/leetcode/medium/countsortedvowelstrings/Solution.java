package com.artifactId.leetcode.medium.countsortedvowelstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 1 ms, faster than 39.78% of Java online submissions for Count Sorted Vowel Strings.
 * Memory Usage: 36 MB, less than 47.50% of Java online submissions for Count Sorted Vowel Strings.
 */
public class Solution {

  private char[] vowels = {'a', 'e', 'i', 'o', 'u'};

  public int countVowelStrings(int n) {
    List<Map<Character, Integer>> list = new ArrayList<>(n);
    boolean first = true;

    for (int j = 0; j < n; j++) {
      Map<Character, Integer> map = new HashMap<>();
      for (char vowerl : vowels) {
        map.put(vowerl, first ? 1 : 0);
      }
      list.add(map);
      first = false;
    }

    for (int i = 1; i < list.size(); i++) {
      update(i, list);
    }

    return getSum(list);
  }

  private int getSum(List<Map<Character, Integer>> list) {
    int sum = 0;
    for (Integer x : list.get(list.size() - 1).values()) {
      int expected = x;
      sum += expected;
    }
    return sum;
  }

  private void update(int i, List<Map<Character, Integer>> list) {
    Map<Character, Integer> currentMap = list.get(i);
    Map<Character, Integer> prvMap = list.get(i - 1);

    for (int j = 0; j < vowels.length; j++) {
      int vowelIndex = vowels.length - j - 1;
      char vowel = vowels[vowelIndex];

      if (vowel == 'u') {
        currentMap.put('u', 1);
      } else {
        currentMap.put(vowel, prvMap.get(vowel) + currentMap.get(vowels[vowelIndex + 1]));
      }

    }
  }

}
