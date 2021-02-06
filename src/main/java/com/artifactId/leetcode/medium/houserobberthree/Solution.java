package com.artifactId.leetcode.medium.houserobberthree;

import com.artifactId.TreeNode;

/**
 * Runtime: 1134 ms, faster than 5.02% of Java online submissions for House Robber III.
 * Memory Usage: 38.6 MB, less than 64.51% of Java online submissions for House Robber III.
 */
public class Solution {
  public int rob(TreeNode root) {
    return dfs(root);
  }

  private int dfs(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }

    TreeNode l1 = null;
    TreeNode l2 = null;
    TreeNode r1 = null;
    TreeNode r2 = null;
    if (treeNode.left != null) {
      l1 = treeNode.left.left;
      l2 = treeNode.left.right;
    }

    if (treeNode.right!= null) {
      r1 = treeNode.right.left;
      r2 = treeNode.right.right;
    }

    int i = treeNode.val + dfs(l1) + dfs(l2) + dfs(r1) + dfs(r2);
    int j = dfs(treeNode.left) + dfs(treeNode.right);
    return Math.max(i, j);
  }

}
