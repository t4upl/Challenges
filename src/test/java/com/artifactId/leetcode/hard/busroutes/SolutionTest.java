package com.artifactId.leetcode.hard.busroutes;

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
    int[][] routes = {{1, 2, 7}, {3, 6, 7}};
    int S = 1;
    int T = 6;
    int expected = 2;
    int result = solution.numBusesToDestination(routes, S, T);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[][] routes = {{1, 2, 7}, {3, 6, 7}};
    int S = 1;
    int T = 1;
    int expected = 0;
    int result = solution.numBusesToDestination(routes, S, T);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[][] routes = {{2,1}, {3,2}, {2,4}, {4,8}, {8,7},  {2,5}, {5,6}, {6,7}};
    int S = 1;
    int T = 7;
    int expected = 4;
    int result = solution.numBusesToDestination(routes, S, T);
    Assert.assertEquals(expected, result);
  }


}