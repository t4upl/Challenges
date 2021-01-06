package com.artifactId.leetcode.easy.removeduplicatesfromsortedlist;

import com.artifactId.leetcode.other.ListNode;

public class Solution {

  public ListNode deleteDuplicates(ListNode head) {

    ListNode current = head;

    while (current != null) {
      ListNode next = current.next;
      while (next != null && current.val == next.val) {
        next = next.next;
      }
      current.next = next;

      if (next == null) {
        break;
      }

      current = current.next;
    }

    return head;
  }

}
