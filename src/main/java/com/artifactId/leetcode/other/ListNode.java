package com.artifactId.leetcode.other;

import java.util.Objects;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public int getVal() {
    return val;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNode listNode = (ListNode) o;
    return val == listNode.val &&
      Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    return "ListNode{" +
      "val=" + val +
      ", next=" + next +
      '}';
  }
}
