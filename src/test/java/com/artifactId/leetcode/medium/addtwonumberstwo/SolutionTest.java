package com.artifactId.leetcode.medium.addtwonumberstwo;

import com.artifactId.leetcode.TestUtils;
import com.artifactId.leetcode.other.ListNode;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    ListNode l1 = TestUtils.toListNode("[7,2,4,3]");
    ListNode l2 = TestUtils.toListNode("[5,6,4]");
    ListNode expected = TestUtils.toListNode("[7,8,0,7]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    ListNode l1 = TestUtils.toListNode("[2]");
    ListNode l2 = TestUtils.toListNode("[1]");
    ListNode expected = TestUtils.toListNode("[3]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    ListNode l1 = TestUtils.toListNode("[2]");
    ListNode l2 = TestUtils.toListNode("[9]");
    ListNode expected = TestUtils.toListNode("[1,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    ListNode l1 = TestUtils.toListNode("[2,2]");
    ListNode l2 = TestUtils.toListNode("[9,9]");
    ListNode expected = TestUtils.toListNode("[1,2,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }



}