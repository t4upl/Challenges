package com.artifactId.leetcode.medium.countsortedvowelstrings;

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
    int expected = 5;
    int result = solution.countVowelStrings(n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int n = 2;
    int expected = 15;
    int result = solution.countVowelStrings(n);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet3() {
    int n = 33;
    int expected = 66045;
    int result = solution.countVowelStrings(n);
    Assert.assertEquals(expected, result);
  }


}