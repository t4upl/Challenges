package com.artifactId.leetcode.medium.checkIfastringcontainsallbinarycodesofsizek;

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
    String s = "00110110";
    int k = 2;
    boolean expected = true;
    boolean result = solution.hasAllCodes(s, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String s = "00110";
    int k = 2;
    boolean expected = true;
    boolean result = solution.hasAllCodes(s, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    String s = "0110";
    int k = 1;
    boolean expected = true;
    boolean result = solution.hasAllCodes(s, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet4() {
    String s = "0110";
    int k = 2;
    boolean expected = false;
    boolean result = solution.hasAllCodes(s, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet5() {
    String s = "0000000001011100";
    int k = 4;
    boolean expected = false;
    boolean result = solution.hasAllCodes(s, k);
    Assert.assertEquals(expected, result);
  }


}