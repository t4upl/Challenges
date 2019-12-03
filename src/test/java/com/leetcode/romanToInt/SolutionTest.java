package com.leetcode.romanToInt;

import com.artifactId.leetcode.romanToInt.Solution;
import com.artifactId.leetcode.romanToInt.SolutionInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solutionInterface;

  @Before
  public void setUp() {
    solutionInterface = new Solution();
  }

  @Test
  public void leet1() {
    Assert.assertEquals(3, solutionInterface.romanToInt("III"));
  }

  @Test
  public void leet2() {
    Assert.assertEquals(4, solutionInterface.romanToInt("IV"));
  }

  @Test
  public void leet3() {
    Assert.assertEquals(9, solutionInterface.romanToInt("IX"));
  }

  @Test
  public void leet4() {
    Assert.assertEquals(58, solutionInterface.romanToInt("LVIII"));
  }

  @Test
  public void leet5() {
    Assert.assertEquals(1994, solutionInterface.romanToInt("MCMXCIV"));
  }

}
