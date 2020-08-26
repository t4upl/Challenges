package com.artifactId.leetcode.romanToInt;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solutionInterface;
  SolutionInterface solutionInterface2;
  String input;

  @Before
  public void setUp() {
    solutionInterface = new Solution2();
    solutionInterface2 = new Solution3();
  }

  @After
  public void countT1() {
    long t1 = System.nanoTime();
    IntStream.range(0, 1000).forEach(x -> solutionInterface.romanToInt(input));
    t1 = System.nanoTime() - t1;
    long t2 = System.nanoTime();
    IntStream.range(0, 1000).forEach(x -> solutionInterface2.romanToInt(input));
    t2 = System.nanoTime() - t2;
    System.out.println(t1 / t2);
  }

  @Test
  public void leet1() {
    this.input = "III";
    Assert.assertEquals(3, solutionInterface.romanToInt(input));
    countT1();
  }

  @Test
  public void leet2() {
    this.input = "IV";
    Assert.assertEquals(4, solutionInterface.romanToInt(input));
  }

  @Test
  public void leet3() {
    this.input = "IX";
    Assert.assertEquals(9, solutionInterface.romanToInt(input));
  }

  @Test
  public void leet4() {
    this.input = "LVIII";
    Assert.assertEquals(58, solutionInterface.romanToInt(input));
  }

  @Test
  public void leet5() {
    this.input = "MCMXCIV";
    Assert.assertEquals(1994, solutionInterface.romanToInt(input));
  }

}
