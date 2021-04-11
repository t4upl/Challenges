package com.artifactId.leetcode.medium.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 1 ms, faster than 67.72% of Java online submissions for Letter Combinations of a Phone Number.
 * Memory Usage: 39 MB, less than 36.25% of Java online submissions for Letter Combinations of a Phone Number.
 */
public class Solution {

  private List<String> ans = new ArrayList<>();

  public List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
      return ans;
    }

    ans = new ArrayList<>(digits.length() * 4);
    char[] digitsArr = digits.toCharArray();
    Map<Character, Character[]> map = new HashMap<>(9);
    map.put('2', new Character[]{'a', 'b', 'c'});
    map.put('3', new Character[]{'d', 'e', 'f'});
    map.put('4', new Character[]{'g', 'h', 'i'});
    map.put('5', new Character[]{'j', 'k', 'l'});
    map.put('6', new Character[]{'m', 'n', 'o'});
    map.put('7', new Character[]{'p', 'q', 'r', 's'});
    map.put('8', new Character[]{'t', 'u', 'v'});
    map.put('9', new Character[]{'w', 'x', 'y', 'z'});


    StringBuilder stringBuilder = new StringBuilder();
    dfs(digitsArr, 0, stringBuilder, map);

    return ans;
  }

  private void dfs(char[] digitsArr, int index, StringBuilder stringBuilder,
    Map<Character, Character[]> map) {

    if (index == digitsArr.length) {
      ans.add(stringBuilder.toString());
      return;
    }

    Character[] characters = map.get(digitsArr[index]);
    for (Character character : characters) {
      stringBuilder.append(character);
      dfs(digitsArr, index + 1, stringBuilder, map);
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
  }

}
