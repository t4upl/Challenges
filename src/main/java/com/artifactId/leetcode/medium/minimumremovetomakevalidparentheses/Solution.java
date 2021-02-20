package com.artifactId.leetcode.medium.minimumremovetomakevalidparentheses;

import java.util.LinkedList;

/**
 * Runtime: 16 ms, faster than 72.68% of Java online submissions for Minimum Remove to Make Valid Parentheses.
 * Memory Usage: 40.2 MB, less than 36.24% of Java online submissions for Minimum Remove to Make Valid Parentheses.
 */
public class Solution {

  public String minRemoveToMakeValid(String s) {
    char[] chars = s.toCharArray();
    LinkedList<Integer> openParenthesis = new LinkedList<>();
    LinkedList<Integer> closeParenthesis = new LinkedList<>();

    for (int i = 0; i < chars.length; i++) {
      char aChar = chars[i];
      if (aChar != '(' && aChar != ')' ) {
        continue;
      }

      if (aChar == '(') {
        openParenthesis.push(i);
        continue;
      }

      if (openParenthesis.isEmpty()) {
        closeParenthesis.push(i);
      } else {
        openParenthesis.pop();
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = chars.length - 1; i > -1; i--) {
      char aChar = chars[i];
      Integer open = handleNull(openParenthesis.peek());
      Integer close = handleNull(closeParenthesis.peek());

      if (i == open ) {
        openParenthesis.pop();
        continue;
      }

      if (i == close) {
        closeParenthesis.pop();
        continue;
      }

      stringBuilder.append(aChar);
    }

    return stringBuilder.reverse().toString();
  }

  private Integer handleNull(Integer peek) {
    return peek == null ? -1 : peek;
  }

}
