package com.artifactId.leetcode.maximumdifferencebetweennodeandancestor;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Difference Between Node and Ancestor.
 * Memory Usage: 40.1 MB, less than 75.91% of Java online submissions for Maximum Difference Between Node and Ancestor.
 */
public class Solution {

  private int result = 0;

  public int maxAncestorDiff(TreeNode root) {
    this.result = 0;
    dfs(root, root.val, root.val);
    return this.result;
  }

  void dfs(TreeNode treeNode, int minAncestorValue, int maxAncestorValue) {
    this.result = Math.max(result, Math.max(Math.abs(treeNode.val - minAncestorValue), Math.abs(treeNode.val - maxAncestorValue)));
    minAncestorValue = Math.min(minAncestorValue, treeNode.val);
    maxAncestorValue = Math.max(maxAncestorValue, treeNode.val);
    if (treeNode.left != null) {
      dfs(treeNode.left, minAncestorValue, maxAncestorValue);
    }

    if (treeNode.right!= null) {
      dfs(treeNode.right, minAncestorValue, maxAncestorValue);
    }
  }


  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }


}
