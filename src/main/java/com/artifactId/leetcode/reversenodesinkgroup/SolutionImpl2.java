package com.artifactId.leetcode.reversenodesinkgroup;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
 * Memory Usage: 41 MB, less than 5.17% of Java online submissions for Reverse Nodes in k-Group.
 */
public class SolutionImpl2 implements Solution {

  @Override
  public ListNode reverseKGroup(ListNode head, int k) {
    if (k == 1 || head == null) {
      return head;
    }

    ListNode result = null;
    ListNode p = head;
    ListNode start = head;
    ListNode previous_end = null;

    int i = 1;
    while (p  != null) {
      if (i % k ==0) {
        ListNode next_p = p.next;
        Pair pair = reverse(start, p);
        if (result  == null) {
          result = p;
        }
        p = next_p;
        pair.lastAfterReverse.next = next_p;

        if (previous_end != null) {
          previous_end.next = pair.firstAfterReverse;
        }
        previous_end = pair.lastAfterReverse;

        start = next_p;
      } else {
        p = p.next;
      }

      i++;
    }

    return result;
  }

  private Pair reverse(final ListNode start, final ListNode end) {
    ListNode p  = start.next;
    ListNode lastProcessed  = null;
    ListNode trueEnd = end.next;
    ListNode current = null;
    ListNode prv = start;

    while (p != trueEnd) {
      current = p;
      p = p.next;
      current.next = prv;
      prv = current;
      lastProcessed = current;
    }

    return new Pair(lastProcessed, start);
  }

  class Pair {
    ListNode firstAfterReverse;
    ListNode lastAfterReverse;

    public Pair(ListNode firstAfterRevers, ListNode lastAfterRevers) {
      this.firstAfterReverse = firstAfterRevers;
      this.lastAfterReverse = lastAfterRevers;
    }
  }
}
