package com.artifactId.leetcode.combinationsum3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
    List<List<Integer>> result = solution.combinationSum3(1, 5);
    List<List<Integer>> expectedResult = new LinkedList<>();
    expectedResult.add(Arrays.asList(5));
    assertEquals(expectedResult, result);
  }

  @Test
  public void test2() {
    List<List<Integer>> result = solution.combinationSum3(2, 5);
    List<List<Integer>> expectedResult = new LinkedList<>();
    expectedResult.add(Arrays.asList(1, 4));
    expectedResult.add(Arrays.asList(2, 3));
    assertEquals(expectedResult, result);
  }

  @Test
  public void test3() {
    List<List<Integer>> result = solution.combinationSum3(3, 18);
    assertEquals(7, result.size());
  }

  @Test
  public void leet1() {
    List<List<Integer>> result = solution.combinationSum3(3, 7);
    List<List<Integer>> expectedResult = new LinkedList<>();
    expectedResult.add(Arrays.asList(1, 2, 4));
    assertEquals(expectedResult, result);
  }

  @Test
  public void leet2() {
    List<List<Integer>> result = solution.combinationSum3(3, 9);
    List<List<Integer>> expectedResult = new LinkedList<>();
    expectedResult.add(Arrays.asList(1, 2, 6));
    expectedResult.add(Arrays.asList(1, 3, 5));
    expectedResult.add(Arrays.asList(2, 3, 4));
    assertEquals(expectedResult, result);
  }

}