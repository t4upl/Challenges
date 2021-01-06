package com.artifactId.leetcode.medium.removeduplicatesfromsortedlisttwo;

import com.artifactId.leetcode.other.ListNode;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List II.
 * Memory Usage: 38.5 MB, less than 33.24% of Java online submissions for Remove Duplicates from Sorted List II.
 */
public class Solution {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode fakeHead = new ListNode(-1);
    ListNode current = head;
    ListNode end = fakeHead;

    while (current != null) {
      if (current.next == null || current.val != current.next.val) {
        end.next = current;
        end = current;
      }

      current = getNext(current);
    }

    end.next = null;
    return fakeHead.next;
  }

  private ListNode getNext(ListNode current) {
    if (current == null) {
      return null;
    }

    while (current.next != null && current.val == current.next.val) {
      current = current.next;
    }
    return current.next;
  }

}
