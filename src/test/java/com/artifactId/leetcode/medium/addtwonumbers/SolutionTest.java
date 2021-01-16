package com.artifactId.leetcode.medium.addtwonumbers;

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
    ListNode l1 = TestUtils.toListNode("[2,4,3]");
    ListNode l2  = TestUtils.toListNode("[5,6,4]");
    ListNode expected = TestUtils.toListNode("[7,0,8]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    ListNode l1 = TestUtils.toListNode("[0]");
    ListNode l2  = TestUtils.toListNode("[0]");
    ListNode expected = TestUtils.toListNode("[0]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet3() {
    ListNode l1 = TestUtils.toListNode("[9,9,9,9,9,9,9]");
    ListNode l2  = TestUtils.toListNode("[9,9,9,9]");
    ListNode expected = TestUtils.toListNode("[8,9,9,9,0,0,0,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void tets1() {
    ListNode l1 = TestUtils.toListNode("[9]");
    ListNode l2  = TestUtils.toListNode("[3]");
    ListNode expected = TestUtils.toListNode("[2,1]");
    ListNode result = solution.addTwoNumbers(l1, l2);
    Assert.assertEquals(expected, result);
  }


}