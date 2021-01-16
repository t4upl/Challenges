package com.artifactId.leetcode.hard.mergeksortedlists;

import com.artifactId.leetcode.other.ListNode;

/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Merge k Sorted Lists.
 * Memory Usage: 40.9 MB, less than 32.11% of Java online submissions for Merge k Sorted Lists.
 */
public class Solution {

  public ListNode mergeKLists(ListNode[] lists) {
    while (lists.length > 1) {
      lists = merge(lists);
    }

    return lists[0];
  }

  private ListNode[] merge(ListNode[] lists) {
    ListNode[] ans = new ListNode[(lists.length + 1) / 2];
    for (int i = 0; i < lists.length - 1; i+=2) {
      ans[i/2] = merge(lists[i], lists[i+1]);
    }

    if (lists.length % 2 == 1) {
      ans[ans.length - 1] = lists[lists.length - 1];
    }

    return ans;
  }

  private ListNode merge(ListNode list1, ListNode list2) {
    ListNode ans = new ListNode(-1);
    ListNode curr = ans;

    while (list1 != null && list2 != null) {
      int val1 = list1.val;
      int val2 = list2.val;

      if (val1 > val2) {
         curr.next = list2;
         list2 = list2.next;
      } else {
        curr.next = list1;
        list1 = list1.next;
      }

      curr = curr.next;
    }

    if (list1 != null) {
      curr.next = list1;
    }

    if (list2 != null) {
      curr.next = list2;
    }

    return ans.next;
  }


}
