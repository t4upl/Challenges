package com.artifactId.leetcode.other.iscousins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your runtime beats 32.81% of java submissions
 */
public class SolutionImpl implements Solution {

  int x;
  int y;

  @Override
  public boolean isCousins(TreeNode root, int x, int y) {
    this.x = x;
    this.y = y;

    List<TreeNode> parents = Collections.emptyList();
    List<TreeNode> list = Collections.singletonList(root);
    return consume(list, parents);
  }

  private boolean consume(List<TreeNode> list, List<TreeNode> parents) {
    List<Integer> values = getValues(list);
    boolean containsX = values.contains(x);
    boolean containsY = values.contains(y);

    if (!containsX && !containsY) {
      List<TreeNode> children = getChildren(list);
      if (children.size() == 0) {
        return false;
      }
      return consume(children, list);
    }

    if (containsX ^ containsY) {
      return false;
    }

    return parentsAreDifferent(parents);
  }

  private boolean parentsAreDifferent(List<TreeNode> parents) {
    for (TreeNode parent: parents){
      List<Integer> childrenValue = getValues(getChildren(Collections.singletonList(parent)));
      if (childrenValue.contains(x) && childrenValue.contains(y)) {
        return false;
      }
    }

    return true;
  }

  private List<TreeNode> getChildren(List<TreeNode> list) {
    List<TreeNode> result = new ArrayList<>();
    for (TreeNode treeNode : list) {
      TreeNode left = treeNode.left;
      TreeNode right = treeNode.right;

      if (left != null) {
        result.add(left);
      }

      if (right != null) {
        result.add(right);
      }

    }
    return result;
  }

  private List<Integer> getValues(List<TreeNode> list) {
    List<Integer> result = new ArrayList<>();
    for (TreeNode treeNode : list) {
      Integer val = treeNode.val;
      result.add(val);
    }
    return result;
  }


}
