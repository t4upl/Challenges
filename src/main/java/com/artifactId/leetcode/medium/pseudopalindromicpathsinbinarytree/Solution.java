package com.artifactId.leetcode.medium.pseudopalindromicpathsinbinarytree;

import com.artifactId.leetcode.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Runtime: 24 ms, faster than 34.01% of Java online submissions for Pseudo-Palindromic Paths in a Binary Tree.
 * Memory Usage: 62 MB, less than 15.82% of Java online submissions for Pseudo-Palindromic Paths in a Binary Tree.
 */
public class Solution {

  private int result = 0;

  public int pseudoPalindromicPaths (TreeNode root) {
    Map<Integer, Integer> valToValCount = new HashMap<>();
    dfs(root, valToValCount, 1);
    return result;
  }

  private void dfs(TreeNode root, Map<Integer, Integer> map, int pathLength) {
    if (root == null) {
      return;
    }

    int val = root.val;
    map.putIfAbsent(val, 0);
    map.put(val, map.get(val) + 1);

    if (root.left == null && root.right == null) {
      long unpairedCount = getUnpairedCount(map);
      if (unpairedCount == pathLength % 2) {
        this.result++;
      }

    } else {
      dfs(root.left, map, pathLength + 1);
      dfs(root.right, map, pathLength + 1);
    }

    map.put(val, map.get(val) - 1);

  }

  private long getUnpairedCount(Map<Integer, Integer> map) {
    long count = 0L;
    for (Integer x : map.values()) {
      if (x % 2 == 1) {
        count++;
      }
    }
    return count;
  }

}
