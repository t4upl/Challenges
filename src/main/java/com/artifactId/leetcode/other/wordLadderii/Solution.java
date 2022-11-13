package com.artifactId.leetcode.other.wordLadderii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * I hve no idea how it works despite going full bfs
 *
 */
public class Solution {

  public List<List<String>> findLadders(String beginWord,
    String endWord, List<String> wordList) {
    List<List<String>> res = new ArrayList<>();
    Set<String> dict = new HashSet<>(wordList);
    if (!dict.contains(endWord)) {
      return res;
    }
    Map<String, List<String>> map = new HashMap<>();
    Set<String> startSet = new HashSet<>();
    startSet.add(beginWord);
    bfs(startSet, endWord, map, wordList);

    List<String> list = new ArrayList<>();
    list.add(beginWord);
    dfs(res, list, beginWord, endWord, map);
    return res;
  }

  private void dfs(List<List<String>> res, List<String> list,
    String word, String endWord, Map<String, List<String>> map) {
    if (word.equals(endWord)) {
      res.add(new ArrayList(list));
      return;
    }

    if (map.get(word) == null) {
      return;
    }
    for (String next : map.get(word)) {
      list.add(next);
      dfs(res, list, next, endWord, map);
      list.remove(list.size() - 1);
    }
  }

  private void bfs(Set<String> startSet, String endWord,
    Map<String, List<String>> map, Collection<String> dict) {
    if (startSet.size() == 0) {
      return;
    }

    Set<String> tmp = new HashSet<>();
    dict.removeAll(startSet);
    boolean finish = false;

    for (String s : startSet) {
      if (s.equals(endWord)) {
        return;
      }

      if (map.get(s) == null) {
        map.put(s, findAllDiff(dict, s));
      }

      tmp.addAll(map.get(s));

    }

    bfs(tmp, endWord, map, dict);

//    for (String s : startSet) {
//      char[] chs = s.toCharArray();
//      for (int i = 0; i < chs.length; i++) {
//        char old = chs[i];
//        for (char c = 'texteditor'; c <= 'z'; c++) {
//          chs[i] = c;
//          String word = new String(chs);
//
//          if (dict.contains(word)) {
//            if (word.equals(endWord)) {
//              finish = true;
//            } else {
//              tmp.add(word);
//            }
//
//            map.computeIfAbsent(s, k -> new ArrayList<>());
//
//            map.get(s).add(word);
//          }
//        }
//
//        chs[i] = old;
//      }
//    }

//    if (!finish) {
//      bfs(tmp, endWord, map, dict);
//    }
  }

  private List<String> findAllDiff(Collection<String> dict, String s) {
    List<String> list = new ArrayList<>();
    for (String s1 : dict) {
      int diff = getDiff(s1, s);
      if (diff == 1) {
        list.add(s1);
      }
    }
    return list;
  }

  private int getDiff(String s1, String s) {
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s.charAt(i)) {
        count++;
        if (count == 2) {
          return 2;
        }
      }
    }
    return count;
  }
}

