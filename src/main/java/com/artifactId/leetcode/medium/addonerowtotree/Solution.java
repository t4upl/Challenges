package com.artifactId.leetcode.medium.addonerowtotree;

import com.artifactId.leetcode.TreeNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Add One Row to Tree.
 * Memory Usage: 39 MB, less than 46.34% of Java online submissions for Add One Row to Tree.
 */
public class Solution {

  public TreeNode addOneRow(TreeNode root, int v, int d) {
    TreeNode fakeRoot = new TreeNode(-1);
    fakeRoot.left = root;
    dfs(fakeRoot, v, d, 0);
    return fakeRoot.left;
  }

  private void dfs(TreeNode root, int v, int d, int levelCounter) {
    if (root == null) {
      return;
    }

    if (levelCounter + 1 == d) {
      TreeNode node;

      TreeNode left = root.left;
      node = new TreeNode(v);
      root.left = node;
      node.left = left;

      TreeNode right = root.right;
      node = new TreeNode(v);
      root.right = node;
      node.right = right;
      return;
    }

    dfs(root.left, v, d, levelCounter + 1);
    dfs(root.right, v, d, levelCounter + 1);
  }

}
