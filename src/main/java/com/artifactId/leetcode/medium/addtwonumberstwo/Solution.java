package com.artifactId.leetcode.medium.addtwonumberstwo;

import com.artifactId.leetcode.other.ListNode;

/**
 * Runtime: 2 ms, faster than 98.58% of Java online submissions for Add Two Numbers II.
 * Memory Usage: 39.5 MB, less than 46.38% of Java online submissions for Add Two Numbers II.
 */
public class Solution {


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode answer = new ListNode(0);
    ListNode current = answer;

    int l1Length = getLength(l1);
    int l2Length = getLength(l2);
    int maxLength = Math.max(l1Length, l2Length);

    int index = 0;
    while (index < maxLength) {
      int val1 = 0;
      int val2 = 0;

      if (index - (maxLength - l1Length) > -1) {
        val1 = l1.val;
        l1 = l1.next;
      }

      if (index - (maxLength - l2Length) > -1) {
        val2 = l2.val;
        l2 = l2.next;
      }

      current.next = new ListNode(val1 + val2);
      current = current.next;

      index++;
    }

    updateCarry(answer);


    return answer.val > 0 ? answer : answer.next;
  }

  private int getLength(ListNode l1) {
    int length = 0;
    while (l1  != null) {
      l1 = l1.next;
      length++;
    }
    return length;
  }

  private void updateCarry(ListNode answer) {
    if (answer.next == null) {
      return;
    }

    updateCarry(answer.next);
    int nextVal = answer.next.val;
    int newNextVal = nextVal % 10;
    answer.next.val = newNextVal;
    answer.val += (nextVal - newNextVal) / 10;
  }

}
