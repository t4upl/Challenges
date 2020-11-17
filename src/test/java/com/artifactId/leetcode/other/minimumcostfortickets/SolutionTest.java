package com.artifactId.leetcode.other.minimumcostfortickets;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {


  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void test1() {
    int[] days = new int[]{1};
    int[] costs = new int[]{1,2,5};
    int[] valid = new int[]{1,2,5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(1, cost);
  }

  @Test
  public void test2() {
    int[] days = new int[]{1};
    int[] costs = new int[]{10,2,5};
    int[] valid = new int[]{1,2,5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(2, cost);
  }

  @Test
  public void test3() {
    int[] days = new int[]{1, 2};
    int[] costs = new int[]{1, 3, 5};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(2, cost);
  }

  @Test
  public void test4() {
    int[] days = new int[]{1, 2};
    int[] costs = new int[]{2, 3, 5};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(3, cost);
  }

  @Test
  public void test5() {
    int[] days = new int[]{1, 50, 51};
    int[] costs = new int[]{2, 3, 5};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(5, cost);
  }

  @Test
  public void test6() {
    int[] days = new int[]{1, 50, 51, 100, 101, 102, 103};
    int[] costs = new int[]{4, 5, 6};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(15, cost);
  }

  @Test
  public void test7() {
    int[] days = new int[]{1, 50, 51, 100, 101, 102, 103, 104, 105};
    int[] costs = new int[]{4, 5, 6};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(19, cost);
  }

  @Test
  public void test8() {
    int[] days = new int[]{100, 101, 102, 103, 104, 105};
    int[] costs = new int[]{40, 5, 60};
    int[] valid = new int[]{1, 3, 5};
    int cost = solution.mincostTickets(days, costs, valid);
    assertEquals(10, cost);
  }

  @Test
  public void leet1() {
    int[] days = new int[]{1,4,6,7,8,20};
    int[] costs = new int[]{2,7,15};
    int cost = solution.mincostTickets(days, costs);
    assertEquals(11, cost);
  }

  @Test
  public void leet2() {
    int[] days = new int[]{1,2,3,4,5,6,7,8,9,10,30,31};
    int[] costs = new int[]{2,7,15};
    int cost = solution.mincostTickets(days, costs);
    assertEquals(17, cost);
  }



}