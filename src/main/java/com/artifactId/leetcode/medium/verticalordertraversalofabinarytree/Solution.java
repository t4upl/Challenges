package com.artifactId.leetcode.medium.verticalordertraversalofabinarytree;

import com.artifactId.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  private Map<Integer, List<Integer>> xToNodeValues = new HashMap<>();

  public List<List<Integer>> verticalTraversal(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }

    Map<TreeNode, Integer> treeNodeToPosition = new HashMap<>();
    treeNodeToPosition.put(root, 0);
    bfs(Collections.singletonList(root), treeNodeToPosition);

    return getValuesByX();
  }

  private List<List<Integer>> getValuesByX() {
    List<Entry<Integer, List<Integer>>> toSort = new ArrayList<>();
    for (Entry<Integer, List<Integer>> integerListEntry : xToNodeValues.entrySet()) {
      toSort.add(integerListEntry);
    }
    toSort.sort(Comparator.comparingInt(Entry::getKey));
    List<List<Integer>> list = new ArrayList<>();
    for (Entry<Integer, List<Integer>> integerListEntry : toSort) {
      List<Integer> value = integerListEntry.getValue();
      list.add(value);
    }
    return list;
  }

  private void bfs(List<TreeNode> nodes, Map<TreeNode, Integer> treeNodeToPosition) {
    if (nodes.isEmpty()) {
      return;
    }

    List<TreeNode> newNodes = new LinkedList<>();
    Map<TreeNode, Integer> newTreeNodeToPosition = new HashMap<>();
    List<TreeNode> nodesSorted = getSortedTreeNodes(nodes);

    for (TreeNode treeNode : nodesSorted) {
      Integer position = treeNodeToPosition.get(treeNode);
      xToNodeValues.putIfAbsent(position, new LinkedList<>());
      xToNodeValues.get(position).add(treeNode.val);

      addNode(newNodes, newTreeNodeToPosition, position, treeNode.left, -1);
      addNode(newNodes, newTreeNodeToPosition, position, treeNode.right, 1);
    }

    bfs(newNodes, newTreeNodeToPosition);
  }

  private List<TreeNode> getSortedTreeNodes(List<TreeNode> nodes) {
    List<TreeNode> list = new ArrayList<>();
    for (TreeNode node : nodes) {
      list.add(node);
    }
    list.sort(Comparator.comparingInt(
      x -> x.val));
    return list;
  }

  private void addNode(List<TreeNode> newNodes, Map<TreeNode, Integer> newTreeNodeToPosition,
    Integer position, TreeNode left, int positionChange) {
    if (left != null) {
      newNodes.add(left);
      newTreeNodeToPosition.put(left, position + positionChange);
    }
  }
}
