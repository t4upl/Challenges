package com.artifactId.leetcode.medium.smalleststringwithagivennumericvalue;

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
    int n = 3;
    int k = 27;
    String expected = "aay";
    String result = solution.getSmallestString(n, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int n = 5;
    int k = 73;
    String expected = "aaszz";
    String result = solution.getSmallestString(n, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int n = 1;
    int k = 1;
    String expected = "a";
    String result = solution.getSmallestString(n, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int n = 1;
    int k = 26;
    String expected = "z";
    String result = solution.getSmallestString(n, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int n = 1;
    int k = 2;
    String expected = "b";
    String result = solution.getSmallestString(n, k);
    Assert.assertEquals(expected, result);
  }




}