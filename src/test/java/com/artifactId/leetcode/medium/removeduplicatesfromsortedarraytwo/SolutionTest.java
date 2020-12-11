package com.artifactId.leetcode.medium.removeduplicatesfromsortedarraytwo;

import java.lang.reflect.Array;
import java.util.Arrays;
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
  public void test1() {
    int[] nums = {1,1,1,1};
    int[] expectedNums = {1,1};
    int expected = 2;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }

  @Test
  public void test2() {
    int[] nums = {1,2,3};
    int[] expectedNums = {1,2,3};
    int expected = 3;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }


  @Test
  public void test3() {
    int[] nums = {1,1,2,2,3,3,3};
    int[] expectedNums = {1,1,2,2,3,3};
    int expected = 6;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }

  @Test
  public void test4() {
    int[] nums = {1,1,2,2,2,3};
    int[] expectedNums = {1,1,2,2,3};
    int expected = 5;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }

  @Test
  public void leet1() {
    int[] nums = {1,1,1,2,2,3};
    int[] expectedNums = {1,1,2,2,3};
    int expected = 5;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }

  @Test
  public void leet2() {
    int[] nums = {0,0,1,1,1,1,2,3,3};
    int[] expectedNums = {0,0,1,1,2,3,3};
    int expected = 7;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(expected, result);
    Assert.assertTrue(Arrays.equals(expectedNums, Arrays.copyOf(nums, expected)));
  }


}