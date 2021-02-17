package com.artifactId.leetcode.medium.containerwithmostwater;

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
    int[] height = TestUtils.toArray("[1,8,6,2,5,4,8,3,7]");
    int expected = 49;
    int result = solution.maxArea(height);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] height = TestUtils.toArray("[1,1]");
    int expected = 1;
    int result = solution.maxArea(height);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[] height = TestUtils.toArray("[4,3,2,1,4]");
    int expected = 16;
    int result = solution.maxArea(height);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    int[] height = TestUtils.toArray("[1,2,1]");
    int expected = 2;
    int result = solution.maxArea(height);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet5() {
    int[] height = TestUtils.toArray("[4,2,4,2,6,12,5,4,2,4]");
    int expected = 36;
    int result = solution.maxArea(height);
    Assert.assertEquals(expected, result);
  }


}