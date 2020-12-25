package com.artifactId.leetcode.medium.arithemticsubarrays;

import java.util.Arrays;
import java.util.List;
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
    int[] nums = {4,6,5,9,3,7};
    int[] l = {0,0,2};
    int[] r = {2,3,5};
    List<Boolean> expected = Arrays.asList(true, false, true);
    List<Boolean> result = solution.checkArithmeticSubarrays(nums, l, r);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
    int[] l = {0,1,6,4,8,7};
    int[] r = {4,4,9,7,9,10};
    List<Boolean> expected = Arrays.asList(false,true,false,false,true,true);
    List<Boolean> result = solution.checkArithmeticSubarrays(nums, l, r);
    Assert.assertEquals(expected, result);
  }


}