package com.artifactId.leetcode.easy.verifyinganaliendictionary;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Runtime: 1 ms, faster than 44.82% of Java online submissions for Verifying an Alien Dictionary.
 * Memory Usage: 38.6 MB, less than 40.94% of Java online submissions for Verifying an Alien Dictionary.
 */
public class Solution {

  public boolean isAlienSorted(String[] words, String order) {

    Map<Character, Integer> charToVal = new HashMap<>();
    initDict(order, charToVal);
    Comparator<String> comparator = (x1, x2) -> {
      int min = Math.min(x1.length(), x2.length());
      char[] x1Chars = x1.toCharArray();
      char[] x2Chars = x2.toCharArray();
      for (int i = 0; i < min; i++) {
        if (!charToVal.get(x1Chars[i]).equals(charToVal.get(x2Chars[i]))) {
          return charToVal.get(x1Chars[i]) - charToVal.get(x2Chars[i]);
        }
      }
      return x1.length() - x2.length();
    };

    for (int i = 0; i < words.length - 1; i++) {
      if (comparator.compare(words[i], words[i+1]) > 0) {
        return false;
      }
    }

    return true;
  }

  private void initDict(String order, Map<Character, Integer> charToVal) {
    char[] chars = order.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      charToVal.put(chars[i], i);
    }
  }

}
