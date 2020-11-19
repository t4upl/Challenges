package com.artifactId.leetcode.medium.decodestring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runtime: 1 ms, faster than 62.54% of Java online submissions for Decode String.
 * Memory Usage: 36.8 MB, less than 94.92% of Java online submissions for Decode String.
 */
public class Solution {

  private Map<Integer, Integer> openingBracketToClosingBracket = new HashMap<>();
  private Set<Character> charNumbers = new HashSet<>();
  private Map<Character, Integer> charNubmerToInteger = new HashMap<>();

  public String decodeString(String s) {
    char[] chars = s.toCharArray();
    initOpeningBracketToClosingBracket(chars);
    initNumbers();
    String result = decodeString(chars, 0, chars.length);
    return result;
  }

  private String decodeString(char[] chars, int start, int end) {
    StringBuilder stringBuilder = new StringBuilder();
    int multiplier = 0;
    for (int i = start; i < end; i++) {
      char aChar = chars[i];

      if (charNumbers.contains(aChar)) {
        multiplier = 10 * multiplier + charNubmerToInteger.get(aChar);
        continue;
      }

      if (aChar == '[') {
        Integer endBracketIndex = openingBracketToClosingBracket.get(i);
        String stringInBrackets = decodeString(chars, i + 1, endBracketIndex);
        stringBuilder.append(repeat(stringInBrackets, multiplier));
        i = endBracketIndex;
        multiplier = 0;
        continue;
      }

      stringBuilder.append(aChar);
    }

    return stringBuilder.toString();
  }

  private String repeat(String s, int times) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < times; i++) {
      stringBuilder.append(s);
    }
    return stringBuilder.toString();
  }

  private void initNumbers() {
    for (int i = 0; i < 10; i++) {
      char c = (char) (i + '0');
      charNumbers.add(c);
      charNubmerToInteger.put(c, i);
    }
  }

  private void initOpeningBracketToClosingBracket(char[] chars) {
    List<Integer> openingBracketsIndexes = new LinkedList<>();
    for (int i = 0; i < chars.length; i++) {
      char aChar = chars[i];
      if (aChar == '[') {
        openingBracketsIndexes.add(i);
      }

      if (aChar == ']') {
        Integer openingBracketIndex = ((LinkedList<Integer>) openingBracketsIndexes).pollLast();
        this.openingBracketToClosingBracket.put(openingBracketIndex, i);
      }
    }
  }

}
