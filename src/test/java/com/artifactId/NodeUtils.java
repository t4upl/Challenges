package com.artifactId;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import sun.reflect.generics.tree.Tree;

public class NodeUtils {

  public static TreeNode parseTreeNode(String treeString) {
    String substring = TestUtils.removeOuterSymbols(treeString);
    String[] split = substring.split(",");
    List<TreeNode> treeNodes = new ArrayList<>();
    for (String s : split) {
      s = s.trim();
      if (!s.equals("null") && !s.equals("")) {
        treeNodes.add(new TreeNode(Integer.parseInt(s)));
      } else {
        treeNodes.add(null);
      }
    }

    int childPointer = 1;
    for (int i = 0; i < treeNodes.size(); i++) {
      TreeNode treeNode = treeNodes.get(i);
      if (treeNode != null) {
        if (childPointer < treeNodes.size()) {
          treeNode.left = treeNodes.get(childPointer);
          childPointer++;
        }
        if (childPointer < treeNodes.size()) {
          treeNode.right = treeNodes.get(childPointer);
          childPointer++;
        }
      }
    }

    return treeNodes.get(0);
  }

  public static TreeNode findNodeWithValue(TreeNode root, int value) {
    return findNodeWithValueDfs(root, value);
  }

  private static TreeNode findNodeWithValueDfs(TreeNode treeNode, int value) {
    if (treeNode == null) {
      return null;
    }

    if (treeNode.val == value) {
      return treeNode;
    }

    TreeNode nodeWithValueDfs = findNodeWithValueDfs(treeNode.left, value);
    if (nodeWithValueDfs != null) {
      return nodeWithValueDfs;
    }

    return findNodeWithValueDfs(treeNode.right, value);
  }

  public static String toString(TreeNode treeNode) {
    List<TreeNode> treeNodes = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();
    treeNodes.add(treeNode);
    bfs(treeNodes, result);
    List<Integer> singleLevelList = result.stream()
      .flatMap(Collection::stream).collect(Collectors.toList());

    while (!singleLevelList.isEmpty() && singleLevelList.get(singleLevelList.size() - 1) == null) {
      singleLevelList.remove(singleLevelList.size() - 1);
    }

    return singleLevelList.stream()
      .map(x -> x == null ? "null" : x.toString())
      .collect(Collectors.joining(",", "[", "]"));
  }

  private static void bfs(List<TreeNode> treeNodes, List<List<Integer>> result) {
    if (treeNodes.isEmpty()) {
      return;
    }

    List<Integer> list = treeNodes.stream().map(x -> x == null ? null : x.val)
      .collect(Collectors.toList());
    result.add(list);

    List<TreeNode> newTreeNodes = new LinkedList<>();
    for (TreeNode treeNode : treeNodes) {
      if (treeNode == null) {
        continue;
      }

      newTreeNodes.add(treeNode.left);
      newTreeNodes.add(treeNode.right);
    }

    bfs(newTreeNodes, result);
  }


}
