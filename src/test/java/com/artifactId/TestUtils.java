package com.artifactId;

import static java.util.stream.Collectors.toList;

import com.artifactId.leetcode.other.ListNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestUtils {

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
    int[][] result = new int[split.length][];
    for (int i = 0; i < split.length; i++) {
      String row = split[i];
      String[] valuesInRow = row.split(",");
      int[] resultRow = new int[valuesInRow.length];
      for (int j = 0; j < valuesInRow.length; j++) {
        if (valuesInRow[j].isEmpty()) {
          continue;
        }

        resultRow[j] = Integer.parseInt(valuesInRow[j]);
      }
      result[i] = resultRow;
    }

    return result;
  }

  private static String[][] toTwoDimStringArray(String string) {
    string = removeWhiteSpace(string);
    String substring = string.substring(1, string.length() - 2);
    substring = substring.replace("[", "");
    String[] split = substring.split("],");
    String[][] result = new String[split.length][];
    for (int i = 0; i < split.length; i++) {
      String row = split[i];
      String[] valuesInRow = row.split(",");
      String[] resultRow = new String[valuesInRow.length];
      for (int j = 0; j < valuesInRow.length; j++) {
        resultRow[j] = valuesInRow[j].substring(1, valuesInRow[j].length() - 1);
      }
      result[i] = resultRow;
    }

    return result;
  }

  public static List<List<Integer>> toTwoDimList(String string) {
    int[][] ints = TestUtils.toTwoDimArray(string);
    return Arrays.stream(ints)
      .map(x -> Arrays.stream(x)
        .boxed()
        .collect(toList()))
      .collect(toList());
  }

  public static List<List<String>> toTwoDimStringList(String string) {
    String[][] strings = TestUtils.toTwoDimStringArray(string);
    return Arrays.stream(strings)
      .map(x -> Arrays.stream(x).collect(toList()))
      .collect(toList());
  }

  private static String removeWhiteSpace(String string) {
    return string.replace(" ", "");
  }

  public static <T, K extends Collection<T>> Set<Set<T>> toSetOfSets(Collection<K> collections) {
    return collections.stream().map(HashSet::new).collect(Collectors.toSet());
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

      curr.next = new ListNode(Integer.parseInt(s1));
      curr = curr.next;
    }

    return head.next;
  }

  public static String[] toStringArray(String s) {
    String regex = "\".*?\"";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(s);
    List<String> list = new ArrayList<>();
    while (matcher.find()) {
      String group = matcher.group(0);
      list.add(removeOuterSymbols(group));
    }

    return list.toArray(new String[0]);
  }

  public static List<String> toStringList(String s) {
    return Arrays.asList(toStringArray(s));
  }

  public static List<ListNode> toListNodeList(String s) {
    List<ListNode> ans = new ArrayList<>();
    s = removeWhiteSpace(s);
    s = removeOuterSymbols(s);
    String[] split = s.split("],");
    for (String s1 : split) {
      System.out.println(s1);
      s1 = removeSquareBrackets(s1);
      s1 = addOuterSquareBrackets(s1);
      ListNode listNode = toListNode(s1);
      ans.add(listNode);
    }

    return ans;
  }

  private static String addOuterSquareBrackets(String s1) {
    return "[" + s1 + "]";
  }

  private static String removeSquareBrackets(String s1) {
    s1 = s1.replace("[", "");
    s1 = s1.replace("]", "");
    return s1;
  }


  static String removeOuterSymbols(String s) {
    return s.substring(1, s.length() - 1);
  }


  public static ListNode[] toListNodeArray(String s) {
    return toListNodeList(s).toArray(new ListNode[0]);
  }

  public static List<Integer> toIntegerList(String string) {
    string = removeOuterSymbols(removeWhiteSpace(string));
    String[] split = string.split(",");
    return Arrays.stream(split).filter(x -> !x.isEmpty()).map(Integer::parseInt).collect(toList());
  }
}
