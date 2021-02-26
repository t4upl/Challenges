package com.artifactId.leetcode.medium.validatestacksequences;

import java.util.LinkedList;

/**
 * Runtime: 1 ms, faster than 95.06% of Java online submissions for Validate Stack Sequences.
 * Memory Usage: 38.9 MB, less than 44.78% of Java online submissions for Validate Stack Sequences.
 */
public class Solution {


  public boolean validateStackSequences(int[] pushed, int[] popped) {
    if (pushed.length == 0) {
      return popped.length == 0;
    }

    LinkedList<Integer> list = new LinkedList<>();
    int j = 0;

    for (int i = 0; i < pushed.length; i++) {
      list.push(pushed[i]);

      Integer peek = list.peek();
      while (j < popped.length && peek != null && popped[j] == peek) {
        list.pop();
        peek = list.peek();
        j++;
      }
    }

    return j == popped.length;
  }

}
