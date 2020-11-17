package com.artifactId.leetcode.medium.validsquare;

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
  public void leet1() {
    int[] p1 = {0,0};
    int[] p2 = {1,1};
    int[] p3 = {1,0};
    int[] p4 = {0,1};
    boolean expected = true;
    boolean result = solution.validSquare(p1, p2, p3, p4);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] p1 = {0,0};
    int[] p2 = {1,1};
    int[] p3 = {1,0};
    int[] p4 = {0,12};
    boolean expected = false;
    boolean result = solution.validSquare(p1, p2, p3, p4);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int[] p1 = {1,0};
    int[] p2 = {-1,0};
    int[] p3 = {0,1};
    int[] p4 = {0,-1};
    boolean expected = true;
    boolean result = solution.validSquare(p1, p2, p3, p4);
    Assert.assertEquals(expected, result);
  }

}