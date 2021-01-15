package com.artifactId.leetcode.medium.addtwonumbers;

import com.artifactId.leetcode.other.ListNode;

/**
 * Runtime: 2 ms, faster than 77.16% of Java online submissions for Add Two Numbers.
 * Memory Usage: 39 MB, less than 89.94% of Java online submissions for Add Two Numbers.
 */
public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode answer = new ListNode(-1);
    ListNode current = answer;

    int carryOn = 0;
    while (l1 != null || l2 != null) {

      int val1 = 0;
      int val2 = 0;

      if (l1 != null) {
        val1 = l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        val2 = l2.val;
        l2 = l2.next;
      }

      int sum = val1 + val2 + carryOn;
      int sum1 = sum % 10;

      current.next = new ListNode(sum1);
      carryOn = (sum - sum1) / 10;
      current = current.next;
    }

    if (carryOn != 0) {
      current.next =  new ListNode(carryOn);
    }

    return answer.next;
  }

}
