package com.artifactId.leetcode.hard.nubmersatmostngivenset;

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
    String[] digits = {"1","3","5","7"};
    int n = 100;
    int expected = 20;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String[] digits = {"1","4","9"};
    int n = 1000000000;
    int expected = 29523;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String[] digits = {"5","6"};
    int n = 19;
    int expected = 2;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test1() {
    String[] digits = {"5"};
    int n = 5;
    int expected = 1;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    String[] digits = {"5"};
    int n = 6;
    int expected = 1;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    String[] digits = {"7"};
    int n = 6;
    int expected = 0;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test4() {
    String[] digits = {"1", "5", "2"};
    int n = 152;
    int expected = 20;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test5() {
    String[] digits = {"1", "5", "2"};
    int n = 252;
    int expected = 29;
    int result = solution.atMostNGivenDigitSet(digits, n);
    Assert.assertEquals(expected, result);
  }



}