package com.artifactId.leetcode.medium.swapnodesinpairs;

import com.artifactId.leetcode.other.ListNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
  public void test1() {
    ListNode listNode = new ListNode(1);
    List<Integer> expected= Arrays.asList(1);
    ListNode result = solution.swapPairs(listNode);
    Assert.assertEquals(expected, toList(result));
  }

  @Test
  public void test2() {
    ListNode listNodeOne = new ListNode(1);
    ListNode listNodeTwo = new ListNode(2);
    listNodeOne.next = listNodeTwo;


    List<Integer> expected= Arrays.asList(2, 1);
    ListNode result = solution.swapPairs(listNodeOne);
    Assert.assertEquals(expected, toList(result));
  }

  @Test
  public void test3() {
    ListNode listNodeOne = new ListNode(1);
    ListNode listNodeTwo = new ListNode(2);
    ListNode listNodeThree = new ListNode(3);
    ListNode listNodeFour = new ListNode(4);
    listNodeOne.next = listNodeTwo;
    listNodeTwo.next = listNodeThree;
    listNodeThree.next = listNodeFour;


    List<Integer> expected= Arrays.asList(2, 1, 4, 3);
    ListNode result = solution.swapPairs(listNodeOne);
    Assert.assertEquals(expected, toList(result));
  }

  @Test
  public void test4() {
    ListNode listNodeOne = new ListNode(1);
    ListNode listNodeTwo = new ListNode(2);
    ListNode listNodeThree = new ListNode(3);
    listNodeOne.next = listNodeTwo;
    listNodeTwo.next = listNodeThree;

    List<Integer> expected= Arrays.asList(2, 1, 3);
    ListNode result = solution.swapPairs(listNodeOne);
    Assert.assertEquals(expected, toList(result));
  }

  @Test
  public void test5() {
    ListNode listNodeOne = new ListNode(1);
    ListNode listNodeTwo = new ListNode(2);
    ListNode listNodeThree = new ListNode(3);
    ListNode listNodeFour = new ListNode(4);
    ListNode listNodeFive = new ListNode(5);
    listNodeOne.next = listNodeTwo;
    listNodeTwo.next = listNodeThree;
    listNodeThree.next = listNodeFour;
    listNodeFour.next = listNodeFive;


    List<Integer> expected= Arrays.asList(2, 1, 4, 3, 5);
    ListNode result = solution.swapPairs(listNodeOne);
    Assert.assertEquals(expected, toList(result));
  }

  private List<Integer> toList(ListNode result) {
    List<Integer> list = new ArrayList<>();
    while (result != null) {
      list.add(result.getVal());
      result = result.next;
    }
    return list;
  }


}