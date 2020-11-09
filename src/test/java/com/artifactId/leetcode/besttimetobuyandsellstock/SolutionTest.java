package com.artifactId.leetcode.besttimetobuyandsellstock;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    int[] arr = new int[]{2};
    Assert.assertEquals(0, solution.maxProfit(arr));
  }

  @Test
  public void test2() {
    int[] arr = new int[]{2, 3, 4};
    Assert.assertEquals(2, solution.maxProfit(arr));
  }

  @Test
  public void test3() {
    int[] arr = new int[]{2, 3, 4, 1, 7, 2};
    Assert.assertEquals(6, solution.maxProfit(arr));
  }

  @Test
  public void test4() {
    int[] arr = new int[]{2, 3, 4, 1, 7, 2, 20};
    Assert.assertEquals(19, solution.maxProfit(arr));
  }


}