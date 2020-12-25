package com.artifactId.leetcode.medium.diagonaltraverse;

import java.lang.reflect.Array;
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
  public void leet1() {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    int[] expected = {1,2,4,7,5,3,6,8,9};
    int[] result = solution.findDiagonalOrder(matrix);
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void test1() {
    int[][] matrix = {
      {1}
    };

    int[] expected = {1};
    int[] result = solution.findDiagonalOrder(matrix);
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void test2() {
    int[][] matrix = {
      {1, 2},
      {4, 5},
      {7, 8}
    };

    int[] expected = {1,2,4,7,5,8};
    int[] result = solution.findDiagonalOrder(matrix);
    Assert.assertTrue(Arrays.equals(expected, result));
  }

  @Test
  public void test3() {
    int[][] matrix = {
      {1, 2, 3, 4},
      {5, 6, 7, 8}
    };

    int[] expected = {1,2,5, 6,3,4,7,8};
    int[] result = solution.findDiagonalOrder(matrix);
    Assert.assertTrue(Arrays.equals(expected, result));
  }


}