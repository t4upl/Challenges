package com.artifactId.leetcode.medium.addtwonumberstwo;

import com.artifactId.leetcode.TestUtils;
import com.artifactId.leetcode.other.ListNode;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    ListNode l1 = TestUtils.toLinkedList("[7,2,4,3]");
    ListNode l2 = TestUtils.toLinkedList("[5,6,4]");
    ListNode expected = TestUtils.toLinkedList("[7,8,0,7]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    ListNode l1 = TestUtils.toLinkedList("[2]");
    ListNode l2 = TestUtils.toLinkedList("[1]");
    ListNode expected = TestUtils.toLinkedList("[3]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    ListNode l1 = TestUtils.toLinkedList("[2]");
    ListNode l2 = TestUtils.toLinkedList("[9]");
    ListNode expected = TestUtils.toLinkedList("[1,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    ListNode l1 = TestUtils.toLinkedList("[2,2]");
    ListNode l2 = TestUtils.toLinkedList("[9,9]");
    ListNode expected = TestUtils.toLinkedList("[1,2,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }



}