package com.artifactId.leetcode.medium.validatestacksequences;

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
    int[] pushed = TestUtils.toArray("[1,2,3,4,5]");
    int[] popped = TestUtils.toArray("[4,5,3,2,1]");
    boolean expected = true;
    boolean result = solution.validateStackSequences(pushed, popped);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] pushed = TestUtils.toArray("[1,2,3,4,5]");
    int[] popped = TestUtils.toArray("[4,3,5,1,2]");
    boolean expected = false;
    boolean result = solution.validateStackSequences(pushed, popped);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    int[] pushed = TestUtils.toArray("[1,2,3,4,5]");
    int[] popped = TestUtils.toArray("[2,1,3,4,5]");
    boolean expected = true;
    boolean result = solution.validateStackSequences(pushed, popped);
    Assert.assertEquals(expected, result);
  }


}