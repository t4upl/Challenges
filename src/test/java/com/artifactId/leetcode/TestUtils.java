package com.artifactId.leetcode;

import com.artifactId.leetcode.other.ListNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUtils {

  public static TreeNode parseTreeNode(String treeString) {
    String substring = removeOuterSymbols(treeString);
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


  public static ListNode toListNode(String s) {
    s = removeWhiteSpace(s);
    s = removeOuterSymbols(s);
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

  public static String[] toStringArray(String s) {
    String regex = "\".*?\"";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(s);
    List<String> list = new ArrayList<>();
    while(matcher.find()) {
      String group = matcher.group(0);
      list.add(removeOuterSymbols(group));
    }

    return list.toArray(new String[0]);
  }

  public static List<ListNode> toListNodeList(String s) {
    List<ListNode> ans = new ArrayList<>();
    s = removeWhiteSpace(s);
    s = removeOuterSymbols(s);
    String[] split = s.split("],");
    for (String s1 : split) {
      System.out.println(s1);
      s1 = removeSquareBrackets(s1);
      s1 = addOuterSquareBrakcets(s1);
      ListNode listNode = toListNode(s1);
      ans.add(listNode);
    }

    return ans;
  }

  private static String addOuterSquareBrakcets(String s1) {
    return "[" +  s1 + "]";
  }

  private static String removeSquareBrackets(String s1) {
    s1 = s1.replace("[", "");
    s1 = s1.replace("]", "");
    return s1;
  }


  private static String removeOuterSymbols(String s) {
    return s.substring(1, s.length() - 1);
  }


  public static ListNode[] toListNodeArray(String s) {
    return toListNodeList(s).toArray(new ListNode[0]);
  }
}
