package com.artifactId.leetcode.medium.smallestsubtreewithalldeepestnodes;

import com.artifactId.leetcode.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 1 ms, faster than 29.61% of Java online submissions for Smallest Subtree with all the Deepest Nodes.
 * Memory Usage: 38.1 MB, less than 51.05% of Java online submissions for Smallest Subtree with all the Deepest Nodes.
 */
public class Solution {

  private TreeNode result;
  private int deepestLevel = 0;
  private List<TreeNode> deepestNodes = new ArrayList<>();
  private Map<TreeNode, TreeNode> nodeToParent = new HashMap<>();
  private Map<TreeNode, Integer> hitCountMap = new HashMap<>();

  public TreeNode subtreeWithAllDeepest(TreeNode root) {
    dfs(root, null, deepestLevel);
    for (TreeNode deepestNode : deepestNodes) {
      toParent(deepestNode);
    }
    return result;
  }

  private void toParent(TreeNode treeNode) {
    if (treeNode == null) {
      return;
    }
    hitCountMap.putIfAbsent(treeNode, 0);
    Integer hitCount = hitCountMap.get(treeNode);
    hitCount++;
    if (hitCount == deepestNodes.size() && result == null) {
      result = treeNode;
    }
    hitCountMap.put(treeNode, hitCount);

    toParent(nodeToParent.get(treeNode));

  }

  private void dfs(TreeNode treeNode, TreeNode parent, int level) {
    if (treeNode == null) {
      return;
    }

    nodeToParent.put(treeNode, parent);
    if (level == deepestLevel) {
      deepestNodes.add(treeNode);
    }

    if (level > deepestLevel) {
      deepestNodes.clear();
      deepestNodes.add(treeNode);
      deepestLevel = level;
    }


    int newLevel = level + 1;
    dfs(treeNode.left, treeNode, newLevel);
    dfs(treeNode.right, treeNode, newLevel);
  }

}
