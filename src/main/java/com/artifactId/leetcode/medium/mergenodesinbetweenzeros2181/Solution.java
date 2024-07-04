package com.artifactId.leetcode.medium.mergenodesinbetweenzeros2181;

import com.artifactId.leetcode.other.ListNode;

public class Solution {

    public ListNode mergeNodes(ListNode head) {
        ListNode resultHead = new ListNode(-1);
        ListNode resultCurr = resultHead;
        resultHead.next = resultCurr;

        ListNode curr = head;
        while (curr != null) {
            if (curr.val == 0 && curr.next != null && curr.next.val != 0) {
                ListNode noneZeroNodeHead = curr.next;
                ListNode noneZeroNodeCurr = noneZeroNodeHead;
                int sum = 0;
                while (noneZeroNodeCurr.val != 0) {
                    sum+=noneZeroNodeCurr.val;
                    noneZeroNodeCurr = noneZeroNodeCurr.next;
                }
                curr = noneZeroNodeCurr;
                resultCurr.next = new ListNode(sum);
                resultCurr = resultCurr.next;
                continue;
            }
            curr = curr.next;
        }


        return resultHead.next;
    }

}
