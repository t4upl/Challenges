package com.artifactId.leetcode.reversenodesinkgroup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new SolutionImpl2();
  }

  @Test
  public void test1() {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4= new ListNode(4);

    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;

    ListNode listNode = solution.reverseKGroup(listNode1, 3);
    Integer[] expectedResult = {3,2,1, 4};
    Integer[] result = toArr(listNode);

    checkIfLastNextIsNull(listNode);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test2() {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4= new ListNode(4);

    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;

    ListNode listNode = solution.reverseKGroup(listNode1, 2);
    Integer[] expectedResult = {2,1, 4, 3};
    Integer[] result = toArr(listNode);

    checkIfLastNextIsNull(listNode);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test3() {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);

    listNode1.next = listNode2;

    ListNode listNode = solution.reverseKGroup(listNode1, 2);
    Integer[] expectedResult = {2, 1};
    Integer[] result = toArr(listNode);

    checkIfLastNextIsNull(listNode);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void leet1() {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4);
    ListNode listNode5 = new ListNode(5);

    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    listNode4.next = listNode5;

    ListNode listNode = solution.reverseKGroup(listNode1, 2);
    Integer[] expectedResult = {2, 1, 4, 3, 5};
    Integer[] result = toArr(listNode);

    checkIfLastNextIsNull(listNode);
    Assert.assertEquals(expectedResult, result);

  }

  @Test
  public void leet2() {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4);
    ListNode listNode5 = new ListNode(5);

    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    listNode4.next = listNode5;

    ListNode listNode = solution.reverseKGroup(listNode1, 3);
    Integer[] expectedResult = {3, 2, 1, 4, 5};
    Integer[] result = toArr(listNode);

    checkIfLastNextIsNull(listNode);
    Assert.assertEquals(expectedResult, result);

  }

  private void checkIfLastNextIsNull(ListNode listNode) {
    List<ListNode> integerList = listNodeToList(listNode);
    Assert.assertEquals(null, integerList.get(integerList.size() -1).next );
  }

  private Integer[] toArr(ListNode listNode) {
    List<Integer> list = listNodeToList(listNode).stream().map(x ->x.val).collect(Collectors.toList());
    Integer[] arr = new Integer[list.size()];
    return list.toArray(arr);
  }

  private List<ListNode> listNodeToList(ListNode listNode) {
    List<ListNode> list = new ArrayList<>();
    while (listNode != null) {
      list.add(listNode);
      listNode = listNode.next;
    }
    return list;
  }

}
