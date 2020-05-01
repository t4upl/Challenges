package com.artifactId.leetcode.constructbinarysearchtreefrompreordertraversal;

/**
 * Not mine
 */
public class SolutionImpl implements Solution {

  private int i = 0;
  private int[] preorder;

  public TreeNode bstFromPreorder(int[] preorder) {
    this.preorder = preorder;
    return getBST(Integer.MAX_VALUE);
  }

  private TreeNode getBST(int max) {
    if (i > preorder.length - 1) {
      return null;
    }

    int rootVal = preorder[i];
    if (rootVal > max) {
      return null;
    }

    TreeNode root = new TreeNode(rootVal);
    i++;

    root.left = getBST(rootVal);
    root.right = getBST(max);

    return root;
  }

}
