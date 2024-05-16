package com.artifactId.leetcode.medium.convertbsttogreatertree;

import com.artifactId.leetcode.TreeNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert BST to Greater Tree.
 * Memory Usage: 39 MB, less than 90.53% of Java online submissions for Convert BST to Greater Tree.
 */
public class Solution {

  private int total = 0;

  public TreeNode convertBST(TreeNode root) {
    dfs(root);
    return root;
  }

  private void dfs(TreeNode root) {
    if (root == null) {
      return;
    }
    dfs(root.right);

    total += root.val;
    root.val = total;
    dfs(root.left);
  }

}
