package com.artifactId.leetcode.medium.maxnumberofksumpairs;

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
    int[] nums = {1,2,3,4};
    int k = 5;
    int expected = 2;
    int result = solution.maxOperations(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] nums = {3,1,3,4,3};
    int k = 6;
    int expected = 1;
    int result = solution.maxOperations(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[] nums = {1,2};
    int k = 3;
    int expected = 1;
    int result = solution.maxOperations(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] nums = {3};
    int k = 3;
    int expected = 0;
    int result = solution.maxOperations(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] nums = {1,3,4,6,8,10};
    int k = 11;
    int expected = 2;
    int result = solution.maxOperations(nums, k);
    Assert.assertEquals(expected, result);
  }


}