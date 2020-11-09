package com.artifactId.leetcode.wordLadderii;

import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Time exceeded
 */
public class Solution {

  private Map<String, List<String>> moveMap;
  private List<Node> results = new ArrayList<>();
  private int firstResultUsedSize = Integer.MAX_VALUE;

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    initializeMoveMap(wordList, beginWord, endWord);
    List<Node> toBeConsumed = new LinkedList<>();
    toBeConsumed.add(new Node(beginWord, new ArrayList<>()));
    while (!toBeConsumed.isEmpty()) {
      Node node = ((LinkedList<Node>) toBeConsumed).pop();
      if (node.getValue().equals(endWord)) {
        if (results.isEmpty() || node.getUsed().size() == firstResultUsedSize) {
          results.add(node);
          if (results.size() == 1) {
            firstResultUsedSize = results.get(0).getUsed().size();
          }
        }
      }

      if (node.getUsed().size() > firstResultUsedSize) {
        break;
      }
      List<String> strings = moveMap.get(node.getValue());
      strings = getUnused(node, strings);
      List<Node> nodes = toNodes(strings, node);
      toBeConsumed.addAll(nodes);
    }
    return toAnswer();

  }

  private List<List<String>> toAnswer() {
    return results.stream().map(x -> {
      List<String> used = x.getUsed();
      used.add(x.getValue());
      return used;
    }).collect(Collectors.toList());
  }

  private List<Node> toNodes(List<String> strings, Node parent) {
    ArrayList<String> strings1 = new ArrayList<>(parent.getUsed());
    strings1.add(parent.getValue());
    return strings.stream().map(x -> new Node(x, strings1)).collect(Collectors.toList());
  }

  private List<String> getUnused(Node node, List<String> strings) {
    return strings.stream().filter(x -> !node.getUsed().contains(x)).collect(Collectors.toList());
  }

  private void initializeMoveMap(List<String> wordList, String beginWord, String endWord) {
    ArrayList<String> strings = new ArrayList<>(wordList);
    strings.add(beginWord);
    strings.add(endWord);
    Map<String, List<String>> map = new HashMap<>();
    for (String x : strings) {
      map.put(x, getAllWordsDiffOne(x, wordList));
    }
    moveMap = map;
  }

  private List<String> getAllWordsDiffOne(String word, List<String> wordList) {
    List<String> list = new ArrayList<>();
    for (String x : wordList) {
      if (letterDiff(x, word) == 1) {
        list.add(x);
      }
    }
    return list;
  }

  private int letterDiff(String word1, String word2) {
    int diffCount = 0;
    for (int i = 0; i < word1.length(); i++) {
      if (word1.charAt(i) != word2.charAt(i)) {
        diffCount++;
      }
    }
    return diffCount;
  }

  private class Node {
    private String value;
    private List<String> used;

    public Node(String value, List<String> used) {
      this.value = value;
      this.used = used;
    }

    public String getValue() {
      return value;
    }

    public List<String> getUsed() {
      return used;
    }
  }


}
