package com.artifactId.leetcode.easy.kthmissingpositivenumber;

import com.artifactId.TestUtils;
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
    int[] arr = TestUtils.toArray("[2,3,4,7,11]");
    int k = 5;
    int expected = 9;
    int result = solution.findKthPositive(arr, k);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void leet2() {
    int[] arr = TestUtils.toArray("[1,2,3,4]");
    int k = 2;
    int expected = 6;
    int result = solution.findKthPositive(arr, k);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test1() {
    int[] arr = TestUtils.toArray("[3,4]");
    int k = 1;
    int expected = 1;
    int result = solution.findKthPositive(arr, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] arr = TestUtils.toArray("[3,4]");
    int k = 2;
    int expected = 2;
    int result = solution.findKthPositive(arr, k);
    Assert.assertEquals(expected, result);
  }


  @Test
  public void test3() {
    int[] arr = TestUtils.toArray("[3,7,10]");
    int k = 7;
    int expected = 9;
    int result = solution.findKthPositive(arr, k);
    Assert.assertEquals(expected, result);
  }


}