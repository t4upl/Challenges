package com.artifactId.leetcode.medium.binarysearchtreeiterator;

import com.artifactId.TreeNode;
import java.util.LinkedList;

/**
 * Runtime: 14 ms, faster than 99.25% of Java online submissions for Binary Search Tree Iterator.
 * Memory Usage: 42.8 MB, less than 95.68% of Java online submissions for Binary Search Tree Iterator.
 */
public class BSTIterator {

  private LinkedList<TreeNode> treeNodes = new LinkedList<>();

  public BSTIterator(TreeNode root) {
    step(root);
  }

  private void step(TreeNode node) {
    if (node == null) {
      return;
    }
    add(node.left);
    treeNodes.add(node);
    add(node.right);
  }

  void add(TreeNode node) {
    if (node != null) {
      step(node);
    }
  }

  public int next() {
    return treeNodes.pop().val;
  }

  public boolean hasNext() {
    return !treeNodes.isEmpty();
  }

}
