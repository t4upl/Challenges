package com.artifactId.leetcode.intToRoman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solutionInterface;

  @Before
  public  void setup() {
    solutionInterface = new Solution();
  }

  @Test
  public void leet1() {
    Assert.assertEquals("III", solutionInterface.intToRoman(3));
  }

  @Test
  public void leet2() {
    Assert.assertEquals("IV", solutionInterface.intToRoman(4));
  }

  @Test
  public void leet3() {
    Assert.assertEquals("IX", solutionInterface.intToRoman(9));
  }

  @Test
  public void leet4() {
    Assert.assertEquals("LVIII", solutionInterface.intToRoman(58));
  }

  @Test
  public void leet5() {
    Assert.assertEquals("MCMXCIV", solutionInterface.intToRoman(1994));
  }


}
