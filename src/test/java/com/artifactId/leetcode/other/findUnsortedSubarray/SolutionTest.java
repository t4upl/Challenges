package com.artifactId.leetcode.other.findUnsortedSubarray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  SolutionInterface solution;

  @Before
  public void setup() {
    solution = new Solution();
  }

  @Test
  public void test1() {
    Assert.assertEquals(0, solution.findUnsortedSubarray(new int[]{1}));
  }

  @Test
  public void test2() {
    Assert.assertEquals(0, solution.findUnsortedSubarray(new int[]{1, 2, 3, 4, 5, 6}));
  }

  @Test
  public void test3() {
    Assert.assertEquals(2, solution.findUnsortedSubarray(new int[]{1, 2, 3, 5, 4, 6}));
  }

  @Test
  public void test4() {
    Assert.assertEquals(3, solution.findUnsortedSubarray(new int[]{3, 2, 1, 4, 5, 6}));
  }

  @Test
  public void test5() {
    Assert.assertEquals(2, solution.findUnsortedSubarray(new int[]{1, 2, 3, 4, 6, 5}));
  }

}
