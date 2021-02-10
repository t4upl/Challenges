package com.artifactId.leetcode.medium.copylistwithrandompointer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Runtime: 2 ms, faster than 15.20% of Java online submissions for Copy List with Random Pointer.
 * Memory Usage: 38.7 MB, less than 68.63% of Java online submissions for Copy List with Random Pointer.
 */
public class Solution {

  public Node copyRandomList(Node head) {
    Node node = new Node(-1);
    Node iter = node;

    Map<Node, Node> originalToNew = new HashMap<>();
    Map<Node, List<Node>> nodeForwardMap = new HashMap<>();

    while (head != null) {
      Node newNode = new Node(head.val);

      originalToNew.put(head, newNode);
      if (originalToNew.containsKey(head.random)) {
        newNode.random = originalToNew.get(head.random);
      } else {
        nodeForwardMap.putIfAbsent(head.random, new LinkedList<>());
        nodeForwardMap.get(head.random).add(newNode);
      }

      if (nodeForwardMap.containsKey(head)) {
        nodeForwardMap.get(head).forEach(x -> x.random = newNode);
      }

      iter.next = newNode;
      iter = iter.next;
      head = head.next;


    }

    return node.next;
  }


  static class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }
}
