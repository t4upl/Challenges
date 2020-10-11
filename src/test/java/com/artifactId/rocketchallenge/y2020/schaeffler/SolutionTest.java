package com.artifactId.rocketchallenge.y2020.schaeffler;

import static org.junit.Assert.assertEquals;

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
    int N = 3;
    int[] arr = {2,1,3,2,3,1};
    int result = solution.solve(N, arr);
    assertEquals(4, result);
  }

  @Test
  public void test2() {
    int N = 2;
    int[] arr = {1,2,3,4,5};
    int result = solution.solve(N, arr);
    assertEquals(8, result);
  }

  @Test
  public void test3() {
    int N = 2;
    int[] arr = {1,1,1,1,1};
    int result = solution.solve(N, arr);
    assertEquals(3, result);
  }

  @Test
  public void test4() {
    int N = 30;
    int[] arr = {2,1,3,2,3,1};
    int result = solution.solve(N, arr);
    assertEquals(3, result);
  }

  @Test
  public void test5() {
    int N = 3;
    int[] arr = {7,6,3,1,1,1,1,1, 1};
    int result = solution.solve(N, arr);
    assertEquals(8, result);
  }

  @Test
  public void test6() {
    int N = 2;
    int[] arr = {4,3, 2,2,2,2};
    int result = solution.solve(N, arr);
    assertEquals(8, result);
  }

  @Test
  public void test7() {
    int N = 2;
    int[] arr = {8,4 , 3,3,3,3,3, 3};
    int result = solution.solve(N, arr);
    assertEquals(17, result);
  }



}