package com.artifactId.leetcode.longestmountaininarray;

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
  public void test1() {
    int[] arr = {2, 3, 2};
    int expecteced = 3;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test2() {
    int[] arr = {2, 3, 10, 8, 7};
    int expecteced = 5;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test3() {
    int[] arr = {2, 3, 10, 8, 9};
    int expecteced = 4;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test4() {
    int[] arr = {2, 3, 10, 8, 9, 10, 24, 23, 25};
    int expecteced = 5;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test5() {
    int[] arr = {2, 3, 10, 8, 9, 10, 24, 23, 13};
    int expecteced = 6;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void leet1() {
    int[] arr = {2,1,4,7,3,2,5};
    int expecteced = 5;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void leet2() {
    int[] arr = {2,2,2};
    int expecteced = 0;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test6() {
    int[] arr = {2, 3, 10};
    int expecteced = 0;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test7() {
    int[] arr = {200, 30, 10};
    int expecteced = 0;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }

  @Test
  public void test8() {
    int[] arr = {2, 2, 2, 3, 1, 1};
    int expecteced = 3;
    int result = solution.longestMountain(arr);
    Assert.assertEquals(expecteced, result);
  }



}