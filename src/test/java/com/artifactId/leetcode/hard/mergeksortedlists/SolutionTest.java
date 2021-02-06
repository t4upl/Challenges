package com.artifactId.leetcode.hard.mergeksortedlists;

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
    ListNode[] lists = TestUtils.toListNodeArray("[[1,4,5],[1,3,4],[2,6]]");
    ListNode expected = TestUtils.toListNode("[1,1,2,3,4,4,5,6]");
    ListNode result = solution.mergeKLists(lists);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    ListNode[] lists = TestUtils.toListNodeArray("[]");
    ListNode expected = TestUtils.toListNode("[]");
    ListNode result = solution.mergeKLists(lists);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    ListNode[] lists = TestUtils.toListNodeArray("[[]]");
    ListNode expected = TestUtils.toListNode("[]");
    ListNode result = solution.mergeKLists(lists);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    ListNode[] lists = TestUtils.toListNodeArray("[[1],[2,3],[4,5,6],[7,8],[9],[1]]");
    ListNode expected = TestUtils.toListNode("[1,1,2,3,4,5,6,7,8,9]");
    ListNode result = solution.mergeKLists(lists);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    ListNode[] lists = TestUtils.toListNodeArray("[[1]]");
    ListNode expected = TestUtils.toListNode("[1]");
    ListNode result = solution.mergeKLists(lists);
    Assert.assertEquals(expected, result);
  }


}