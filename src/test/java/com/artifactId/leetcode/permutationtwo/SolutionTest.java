package com.artifactId.leetcode.permutationtwo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    int[] nums = {1,1,2};
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,1,2), Arrays.asList(1,2,1),
      Arrays.asList(2, 1 ,1));
    List<List<Integer>> result = solution.permuteUnique(nums);

    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    int[] nums = {1, 2, 3};
    List<List<Integer>> expected = Arrays.asList(
      Arrays.asList(1,2,3), Arrays.asList(1,3,2), Arrays.asList(2,1,3), Arrays.asList(2,3,1),
      Arrays.asList(3,1,2), Arrays.asList(3,2,1));
    List<List<Integer>> result = solution.permuteUnique(nums);

    Assert.assertEquals(expected, result);
  }


}
