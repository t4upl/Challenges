package com.artifactId.leetcode.other.maximumwidthofbinarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Memory Limit Exceeded :(
 *
 * Too many nulls?
 */
public class MaximumWidthOfBinaryTreeSolutionImpl implements MaximumWidthOfBinaryTreeSolution {

  @Override
  public int widthOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }

    List<TreeNode> list = new ArrayList<>();
    list.add(root);
    int maxWidth = 1;
    while (!list.isEmpty()) {
      A a = process(list);
      if (a == null) {
        break;
      }
      maxWidth = Math.max(maxWidth, a.getWidth());
      list = a.getList();
    }

    return maxWidth;
  }

  private A process(List<TreeNode> list) {
    int min = -1;
    int max = -1;
    List<TreeNode> newList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      TreeNode treeNode = list.get(i);
      if (treeNode != null) {
        max = i;
        if (min == -1) {
          min = i;
        }

        newList.add(treeNode.left);
        newList.add(treeNode.right);
      } else {
        newList.add(null);
        newList.add(null);
      }
    }

    if (min == -1) {
      return null;
    }

    return new A(newList, max - min + 1);
  }

  private class A {
    private List<TreeNode> list;
    private int width;

    public List<TreeNode> getList() {
      return list;
    }

    public int getWidth() {
      return width;
    }

    public A(List<TreeNode> list, int width) {
      this.list = list;
      this.width = width;
    }
  }
}
