package com.artifactId.leetcode.maximumwidthofbinarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime: 1 ms, faster than 94.86% of Java online submissions for Maximum Width of Binary Tree.
 * Memory Usage: 38.5 MB, less than 11.11% of Java online submissions for Maximum Width of Binary Tree.
 */
public class MaximumWidthOfBinaryTreeSolutionWithndexImpl implements MaximumWidthOfBinaryTreeSolution {

  @Override
  public int widthOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }

    List<TreeNodeWrapper> list = new ArrayList<>();
    list.add(new TreeNodeWrapper(root, 0));
    int maxWidth = 1;
    while (!list.isEmpty()) {
      A a = process(list);
      maxWidth = Math.max(maxWidth, a.getWidth());
      list = a.getList();
    }

    return maxWidth;
  }

  private A process(List<TreeNodeWrapper> list) {
    int min = list.get(0).getIndex();
    int max = list.get(list.size() - 1).getIndex();
    int width = max - min + 1;

    List<TreeNodeWrapper> newList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      TreeNodeWrapper treeNodeWrapper = list.get(i);
      TreeNode treeNode = treeNodeWrapper.getTreeNode();

      if (treeNode.left != null) {
        newList.add(new TreeNodeWrapper(treeNode.left, treeNodeWrapper.getIndex() * 2));
      }

      if (treeNode.right != null) {
        newList.add(new TreeNodeWrapper(treeNode.right, treeNodeWrapper.getIndex() * 2 + 1));
      }

    }

    return new A(newList, width);
  }

  class TreeNodeWrapper {
    private TreeNode treeNode;
    private int index;

    public TreeNodeWrapper(TreeNode treeNode, int index) {
      this.treeNode = treeNode;
      this.index = index;
    }

    public TreeNode getTreeNode() {
      return treeNode;
    }

    public int getIndex() {
      return index;
    }
  }

  private class A {
    private List<TreeNodeWrapper> list;
    private int width;

    public List<TreeNodeWrapper> getList() {
      return list;
    }

    public int getWidth() {
      return width;
    }

    public A(List<TreeNodeWrapper> list, int width) {
      this.list = list;
      this.width = width;
    }
  }
}
