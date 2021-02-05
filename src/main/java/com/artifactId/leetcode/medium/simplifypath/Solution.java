package com.artifactId.leetcode.medium.simplifypath;

import java.util.LinkedList;
import java.util.List;

/**
 * Runtime: 14 ms, faster than 9.27% of Java online submissions for Simplify Path.
 * Memory Usage: 39.7 MB, less than 22.19% of Java online submissions for Simplify Path.
 */
public class Solution {

  public String simplifyPath(String path) {
    path = path.replaceAll("//+", "/");
    path = path.replaceAll("/\\.(?=/|$)", "");

    String[] strings = path.split("/");
    List<String> list = new LinkedList<>();
    for (String string : strings) {
      if (string.equals("..")) {
        if (!list.isEmpty()) {
          ((LinkedList<String>) list).pollLast();
        }
        continue;
      }

      list.add(string);
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (String s : list) {
      if (s.equals("")) {
        continue;
      }
      stringBuilder.append("/").append(s);
    }
    String s = stringBuilder.toString();
    return s.isEmpty() ? "/" : s;
  }

}
