package com.artifactId.leetcode.medium.scoreofparentheses;

import java.util.LinkedList;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Score of Parentheses.
 * Memory Usage: 36.8 MB, less than 91.24% of Java online submissions for Score of Parentheses.
 */
public class Solution {

  public int scoreOfParentheses(String S) {
    char[] chars = S.toCharArray();
    LinkedList<Integer> list = new LinkedList<>();
    for (int i=0; i < chars.length; i++) {
      char aChar = chars[i];
      if (aChar == '(') {
        list.push(-1);
        continue;
      }

      if (list.peek() == -1) {
        list.pop();
        list.push(1);
        continue;
      }

      int total = 0;
      while (list.peek() != -1) {
        total += list.pop();
      }

      list.pop();
      list.push(2 * total );
    }

    int total = 0;
    while (!list.isEmpty()) {
      total += list.pop();
    }

    return total;

  }
}
