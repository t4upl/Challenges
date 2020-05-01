package com.artifactId.leetcode.constructbinarysearchtreefrompreordertraversal;

import java.util.Objects;

public class TreeNode {
      int val;
      public TreeNode left;
      public  TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeNode treeNode = (TreeNode) o;
    return val == treeNode.val &&
      Objects.equals(left, treeNode.left) &&
      Objects.equals(right, treeNode.right);
  }

  @Override
  public int hashCode() {

    return Objects.hash(val, left, right);
  }
}
