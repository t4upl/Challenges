package com.artifactId.leetcode.easy.squareofasortedarray;

import java.util.Arrays;
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
  public void test1() {
    int[] result = solution.sortedSquares(new int[]{-2});
    int[] expected = {4};
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void test2() {
    int[] result = solution.sortedSquares(new int[]{-3, -2, -1,});
    int[] expected = {1, 4, 9};
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void test3() {
    int[] result = solution.sortedSquares(new int[]{1,2,3});
    int[] expected = {1, 4, 9};
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void leet1() {
    int[] result = solution.sortedSquares(new int[]{-4,-1,0,3,10});
    int[] expected = {0,1,9,16,100};
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void leet2() {
    int[] result = solution.sortedSquares(new int[]{-7,-3,2,3,11});
    int[] expected = {4,9,9,49,121};
    Assert.assertTrue(Arrays.equals(expected, result));
  }


}