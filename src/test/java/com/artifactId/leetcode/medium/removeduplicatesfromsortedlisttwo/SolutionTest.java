package com.artifactId.leetcode.medium.removeduplicatesfromsortedlisttwo;

import com.artifactId.TestUtils;
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
    ListNode head = TestUtils.toListNode("[1,2,3,3,4,4,5]");
    ListNode expected = TestUtils.toListNode("[1,2,5]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    ListNode head = TestUtils.toListNode("[1,1,1,2,3]");
    ListNode expected = TestUtils.toListNode("[2,3]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    ListNode head = TestUtils.toListNode("[1,1,1,2,3,3]");
    ListNode expected = TestUtils.toListNode("[2]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    ListNode head = TestUtils.toListNode("[1]");
    ListNode expected = TestUtils.toListNode("[1]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    ListNode head = TestUtils.toListNode("[1,2,3]");
    ListNode expected = TestUtils.toListNode("[1,2,3]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    ListNode head = TestUtils.toListNode("[1,1,1]");
    ListNode expected = TestUtils.toListNode("[]");
    ListNode result = solution.deleteDuplicates(head);
    Assert.assertEquals(expected, result);
  }


}