package com.artifactId.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TestUtils {

  public static TreeNode parseTreeNode(String treeString) {
    String substring = treeString.substring(1, treeString.length() - 1);
    String[] split = substring.split(",");
    List<TreeNode> treeNodes = new ArrayList<>();
    for (String s : split) {
      s = s.trim();
      if (!s.equals("null")) {
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

  public static List<List<Integer>> parseListOfLists(String s) {
    s = s.substring(1, s.length());
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> acc = new ArrayList<>();
    s = s.replace("[","");
    String[] split = s.split("]");
    for (String s1 : split) {
      String[] numbers = s1.split(",");
      acc = new ArrayList<>();
      for (String number : numbers) {
        if (number.isEmpty()) {
          continue;
        }

        acc.add(Integer.parseInt(number));
      }
      result.add(acc);
    }

    return result;
  }
}
