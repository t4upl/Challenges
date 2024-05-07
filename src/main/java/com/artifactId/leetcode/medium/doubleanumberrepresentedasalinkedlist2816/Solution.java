package com.artifactId.leetcode.medium.doubleanumberrepresentedasalinkedlist2816;

import com.artifactId.leetcode.other.ListNode;
import org.w3c.dom.Node;

import java.util.List;

public class Solution {

    public ListNode doubleIt(ListNode head) {
        ListNode node = reverseNodeList(head);
        head = node;
        int carry = 0;
        ListNode prev = null;
        while (node != null) {
            node.val = node.val * 2 + carry;
            carry = 0;
            if (node.val > 9) {
                node.val = node.val - 10;
                carry = 1;
            }
            prev = node;
            node = node.next;

        }

        if (carry == 1) {
            prev.next = new ListNode(1);
        }

        return reverseNodeList(head);
    }

    private static ListNode reverseNodeList(ListNode head) {
        ListNode node;
        node = head;
        ListNode prevNode = null;
        while (node != null) {
            ListNode nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
        }
        return prevNode;
    }


}
