package com.artifactId.leetcode.medium.swapnodesinpairs;

import com.artifactId.leetcode.other.ListNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
 * Memory Usage: 36.8 MB, less than 21.05% of Java online submissions for Swap Nodes in Pairs.
 */
public class Solution {

  public ListNode swapPairs(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode firstNode = head;
    ListNode secondNode;
    ListNode newFirstNode;
    ListNode tail = head;
    ListNode ans = null;

    while (firstNode != null && firstNode.next != null) {
      secondNode = firstNode.next;
      if (ans == null) {
        ans = secondNode;
      }

      newFirstNode = secondNode.next;
      secondNode.next = firstNode;
      tail.next = secondNode;

      tail = firstNode;
      firstNode = newFirstNode;
    }

    if (firstNode != null) {
      tail.next = firstNode;
      tail = firstNode;

    }

    tail.next = null;

    if (ans == null) {
      ans = head;
    }

    return ans;
  }

}
