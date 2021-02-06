package com.artifactId.leetcode.medium.binarytreerightsideview;

import com.artifactId.TreeNode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Runtime: 2 ms, faster than 14.20% of Java online submissions for Binary Tree Right Side View.
 * Memory Usage: 38.1 MB, less than 22.40% of Java online submissions for Binary Tree Right Side View.
 */
public class Solution {

  private List<Integer> ans = new LinkedList<>();

  public List<Integer> rightSideView(TreeNode root) {

    if (root!= null) {
      bfs(Collections.singletonList(root));
    }

    return ans;
  }

  private void bfs(List<TreeNode> treeNodes) {
    if (treeNodes.isEmpty()) {
      return;
    }
    ans.add(treeNodes.get(treeNodes.size() - 1).val);
    List<TreeNode> newTreeNodes = new LinkedList<>();
    for (TreeNode treeNode: treeNodes) {
      if (treeNode.left != null) {
        newTreeNodes.add(treeNode.left);
      }

      if (treeNode.right != null) {
        newTreeNodes.add(treeNode.right);
      }
    }

    bfs(newTreeNodes);
  }

}
