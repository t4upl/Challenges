package com.artifactId.leetcode.medium.kthlargestelementinarray;

import com.artifactId.leetcode.TestUtils;
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
    int[] ints = TestUtils.toArray("[3,2,1,5,6,4]");
    int k = 2;
    int expected = 5;
    int result = solution.findKthLargest(ints, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] ints = TestUtils.toArray("[3,2,3,1,2,4,5,5,6]");
    int k = 4;
    int expected = 4;
    int result = solution.findKthLargest(ints, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    int[] ints = TestUtils.toArray("[100]");
    int k = 1;
    int expected = 100;
    int result = solution.findKthLargest(ints, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    int[] ints = TestUtils.toArray("[100, 100, 99]");
    int k = 2;
    int expected = 100;
    int result = solution.findKthLargest(ints, k);
    Assert.assertEquals(expected, result);
  }


}