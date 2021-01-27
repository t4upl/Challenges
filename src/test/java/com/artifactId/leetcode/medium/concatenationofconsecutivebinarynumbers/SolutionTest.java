package com.artifactId.leetcode.medium.concatenationofconsecutivebinarynumbers;

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
    int n = 1;
    int expected = 1;
    int result = solution.concatenatedBinary(n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int n = 3;
    int expected = 27;
    int result = solution.concatenatedBinary(n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int n = 12;
    int expected = 505379714;
    int result = solution.concatenatedBinary(n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    int n = 42;
    int expected = 727837408;
    int result = solution.concatenatedBinary(n);
    Assert.assertEquals(expected, result);
  }


}