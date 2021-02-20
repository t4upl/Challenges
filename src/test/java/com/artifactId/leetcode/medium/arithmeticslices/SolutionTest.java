package com.artifactId.leetcode.medium.arithmeticslices;

import com.artifactId.TestUtils;
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
    int[] A = TestUtils.toArray("[1, 2, 3, 4]");
    int expected = 3;
    int result = solution.numberOfArithmeticSlices(A);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[] A = TestUtils.toArray("[1, 2, 3, 4, 4]");
    int expected = 3;
    int result = solution.numberOfArithmeticSlices(A);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] A = TestUtils.toArray("[1, 2, 3, 4, 4, 4]");
    int expected = 4;
    int result = solution.numberOfArithmeticSlices(A);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] A = TestUtils.toArray("[1, 1, 2, 3, 4, 4]");
    int expected = 3;
    int result = solution.numberOfArithmeticSlices(A);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    int[] A = TestUtils.toArray("[1, 2, 3, 4, 5]");
    int expected = 6;
    int result = solution.numberOfArithmeticSlices(A);
    Assert.assertEquals(expected, result);
  }


}