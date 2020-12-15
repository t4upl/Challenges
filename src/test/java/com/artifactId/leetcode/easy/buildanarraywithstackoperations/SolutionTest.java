package com.artifactId.leetcode.easy.buildanarraywithstackoperations;

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
  public void test1() {
    int[] target = {1};
    String[] expected = {"Push"};

    List<String> result = solution.buildArray(target, 1);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void test2() {
    int[] target = {2};
    String[] expected = {"Push", "Pop", "Push"};

    List<String> result = solution.buildArray(target, 3);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void test3() {
    int[] target = {3,5};
    String[] expected = {"Push", "Pop", "Push", "Pop", "Push", "Push", "Pop", "Push"};

    List<String> result = solution.buildArray(target, 5);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void leet1() {
    int[] target = {1,2,3};
    int n = 3;
    String[] expected = {"Push", "Push", "Push"};

    List<String> result = solution.buildArray(target, n);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void leet2() {
    int[] target = {1,2};
    int n = 3;
    String[] expected = {"Push", "Push"};

    List<String> result = solution.buildArray(target, n);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void leet3() {
    int[] target = {1,2};
    int n = 4;
    String[] expected = {"Push","Push"};

    List<String> result = solution.buildArray(target, n);
    Assert.assertEquals(Arrays.asList(expected), result);
  }

  @Test
  public void leet4() {
    int[] target = {2,3,4};
    int n = 4;
    String[] expected = {"Push","Pop","Push","Push","Push"};

    List<String> result = solution.buildArray(target, n);
    Assert.assertEquals(Arrays.asList(expected), result);
  }


}