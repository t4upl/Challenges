package com.artifactId.leetcode.medium.removenodesfromlinkedlist2487;

import com.artifactId.leetcode.other.ListNode;

import java.util.Stack;

public class Solution {

    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            while (!stack.isEmpty() && node.val > stack.peek()) {
                stack.pop();
            }
            stack.push(node.val);
            node = node.next;
        }

        node = head;
        ListNode prev = null;
        while (!stack.isEmpty()) {
            node.val = stack.pop();
            prev = node;
            node = node.next;
        }
        prev.next = null;

        node = head;
        prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
