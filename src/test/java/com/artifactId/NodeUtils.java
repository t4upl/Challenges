package com.artifactId;

import java.util.ArrayList;
import java.util.List;

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
}
