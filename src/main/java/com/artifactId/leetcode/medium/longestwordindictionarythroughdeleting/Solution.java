package com.artifactId.leetcode.medium.longestwordindictionarythroughdeleting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Runtime: 27 ms, faster than 24.30% of Java online submissions for Longest Word in Dictionary through Deleting.
 * Memory Usage: 39.8 MB, less than 79.00% of Java online submissions for Longest Word in Dictionary through Deleting.
 */
public class Solution {

  public String findLongestWord(String s, List<String> d) {
    String ans = "";
    int[] sFrequency = getFrequencyMap(s);
    char[] sChars = s.toCharArray();
    List<String> sortedList = getSortedList(d);


    for (String dictWord : sortedList) {
      if (dictWord.length() > s.length()) {
        continue;
      }
      int[] dictWordFrequencyMap = getFrequencyMap(dictWord);
      if (!contains(sFrequency, dictWordFrequencyMap)) {
        continue;
      }

      if (checkWord(sChars, dictWord)) {
        return dictWord;
      }
    }


    return ans;
  }

  private boolean contains(int[] sFrequency, int[] dictWordFrequencyMap) {
    for (int i = 0; i < sFrequency.length; i++) {
      if (sFrequency[i] < dictWordFrequencyMap[i]) {
        return false;
      }
    }

    return true;
  }

  private boolean checkWord(char[] sChars, String dictWord) {
    char[] chars = dictWord.toCharArray();
    int counter = 0;
    for (char sChar : sChars) {
      if (counter == dictWord.length()) {
        return true;
      }

      if (sChar == chars[counter]) {
        counter++;
      }
    }
    return counter == dictWord.length();
  }

  private List<String> getSortedList(List<String> d) {
    List<String> list = new ArrayList<>();
    for (String expected : new HashSet<>(d)) {
      list.add(expected);
    }
    list.sort(Comparator.comparing(String::length).reversed().thenComparing(x -> x));
    return list;
  }

  private int[] getFrequencyMap(String s) {
    int[] arr = new int[40];
    s.chars().forEach(x -> arr[x - 'a'] += 1);
    return arr;
  }

}
