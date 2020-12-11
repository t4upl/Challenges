package com.artifactId.leetcode.easy.validmountainrange;

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
    int[] arr = {1,5,3};
    boolean expected = true;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] arr = {1,5,3,6,2};
    boolean expected = false;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] arr = {1,5,6};
    boolean expected = false;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    int[] arr = {6,5,4,3};
    boolean expected = false;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test5() {
    int[] arr = {1,2,5,3,0};
    boolean expected = true;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet1() {
    int[] arr = {2,1};
    boolean expected = false;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] arr = {3,5,5};
    boolean expected = false;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[] arr = {0,3,2,1};
    boolean expected = true;
    boolean result = solution.validMountainArray(arr);
    Assert.assertEquals(expected, result);
  }





}