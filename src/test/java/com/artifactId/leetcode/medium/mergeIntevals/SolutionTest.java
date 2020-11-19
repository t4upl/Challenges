package com.artifactId.leetcode.medium.mergeIntevals;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
      int[][] intervales = {{1,3},{2,6},{8,10},{15,18}};
      int[][] expected = {{1,6},{8,10},{15,18}};
      int[][] result = solution.merge(intervales);
      Assert.assertEquals(expected, result);
  }


  @Test
  public void leet2() {
    int[][] intervales = {{1,4},{4,5}};
    int[][] expected = {{1,5}};
    int[][] result = solution.merge(intervales);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test1() {
    int[][] intervales = {{1,4}};
    int[][] expected = {{1,4}};
    int[][] result = solution.merge(intervales);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[][] intervales = {{2, 10}, {100, 104}, {100, 200}, {3, 5}};
    int[][] expected = {{2,10}, {100, 200}};
    int[][] result = solution.merge(intervales);
    Assert.assertEquals(expected, result);
  }

}