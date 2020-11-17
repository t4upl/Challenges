package com.artifactId.leetcode.other.maximumwidthofbinarytree;

public class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public void setChildren(TreeNode left, TreeNode right) {
    this.left = left;
    this.right = right;
  }

}
