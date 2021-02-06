package com.artifactId.leetcode.easy.binarytreetilt;

import com.artifactId.TreeNode;

/**
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Tilt.
 *  Memory Usage: 39.1 MB, less than 54.02% of Java online submissions for Binary Tree Tilt.
 */
public class Solution {

  int result = 0;

  public int findTilt(TreeNode root) {
    dfs(root);
    return result;
  }

  private int dfs(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }

    int leftSubTree = dfs(treeNode.left);
    int rightSubTree = dfs(treeNode.right);

    result += Math.abs(leftSubTree - rightSubTree);

    return treeNode.val + leftSubTree + rightSubTree;
  }





}
