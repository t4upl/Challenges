package com.artifactId.leetcode;

import com.artifactId.leetcode.other.ListNode;
import java.util.ArrayList;
import java.util.List;

public class TestUtils {

  public static TreeNode parseTreeNode(String treeString) {
    String substring = treeString.substring(1, treeString.length() - 1);
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

  public static List<List<Integer>> parseListOfLists(String s) {
    s = s.substring(1, s.length());
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> acc;
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

  public static int[][] toMatrix(String boardString) {
    return toTwoDimArray(boardString);
  }


  public static int[] toArray(String arrayString) {
    int[][] ints = toMatrix("[" + arrayString + "]");
    return ints[0];
  }

  public static int[][] toTwoDimArray(String string) {
    string = removeWhiteSpace(string);
    String substring = string.substring(1, string.length() - 2);
    substring = substring.replace("[", "");
    String[] split = substring.split("],");
    int result[][] = new int[split.length][];
    for (int i = 0; i < split.length; i++) {
      String row = split[i];
      String[] valuesInRow = row.split(",");
      int[] resultRow = new int[valuesInRow.length];
      for (int j = 0; j < valuesInRow.length; j++) {
        resultRow[j] = Integer.parseInt(valuesInRow[j]);
      }
      result[i] = resultRow;
    }

    return result;
  }

  private static String removeWhiteSpace(String string) {
    return string.replace(" ", "");
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


  public static ListNode toLinkedList(String s) {
    s = removeWhiteSpace(s);
    s = s.substring(1, s.length() - 1);
    String[] split = s.split(",");
    ListNode head = new ListNode(-1000);
    ListNode curr = head;
    for (String s1 : split) {
      if (s1.isEmpty()) {
        continue;
      }

      ListNode listNode = new ListNode(Integer.parseInt(s1));
      curr.next = listNode;
      curr = curr.next;
    }

    return head.next;
  }
}
