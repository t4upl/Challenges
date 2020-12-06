package com.artifactId.leetcode.medium.populatingnextrightpointersineachnodetwo;

import java.util.ArrayList;
import java.util.List;

/**
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Populating Next Right Pointers in Each Node II.
 *  Memory Usage: 38.6 MB, less than 71.41% of Java online submissions for Populating Next Right Pointers in Each Node II.
 */
public class Solution {

  public Node connect(Node root) {
    if (root == null) {
      return null;
    }

    List<Node> nodes = new ArrayList<>();
    nodes.add(root);
    List<Node> children = new ArrayList<>();
    bfs(nodes, children);

    return root;
  }

  private void bfs(List<Node> nodes, List<Node> children) {
    if (nodes.size() == 0) {
      return;
    }

    children.clear();
    Node prv = null;
    for (Node node : nodes) {
      if (prv != null) {
        prv.next = node;
      }
      prv = node;
      addIfNotNull(node.left, children);
      addIfNotNull(node.right, children);
    }

    bfs(children, nodes);
  }

  private void addIfNotNull(
    Node node,
    List<Node> children) {
    if (node != null) {
      children.add(node);
    }
  }

}


class Node {

  public int val;
  public Node left;
  public Node right;
  public Node next;

  public Node() {
  }

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, Node _left, Node _right, Node _next) {
    val = _val;
    left = _left;
    right = _right;
    next = _next;
  }



};