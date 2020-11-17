package com.artifactId.leetcode.other.maximumproductsubarray;

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
  public void test1() {
    int result = solution.maxProduct(new int[]{5});
    int expectedResult = 5;
    Assert.assertEquals(expectedResult, result);
  }


  @Test
  public void test2() {
    int result = solution.maxProduct(new int[]{5, 8});
    int expectedResult = 40;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test3() {
    int result = solution.maxProduct(new int[]{7, 0, 5, 8});
    int expectedResult = 40;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test4() {
    int result = solution.maxProduct(new int[]{7, 5, -8});
    int expectedResult = 35;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test5() {
    int result = solution.maxProduct(new int[]{7, 2, -8,  5, 10});
    int expectedResult = 50;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test6() {
    int result = solution.maxProduct(new int[]{7, 2, -8,  5, 10});
    int expectedResult = 50;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test7() {
    int result = solution.maxProduct(new int[]{-3, 2, 5, -1});
    int expectedResult = 30;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test8() {
    int result = solution.maxProduct(new int[]{-3, 2, 5, -1, 2, -100});
    int expectedResult = 2000;
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void leet100() {
    int result = solution.maxProduct(new int[]{-2, 0,-1});
    int expectedResult = 0;
    Assert.assertEquals(expectedResult, result);
  }

}