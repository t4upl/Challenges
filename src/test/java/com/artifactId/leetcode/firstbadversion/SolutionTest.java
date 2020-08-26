package com.artifactId.leetcode.firstbadversion;

import java.util.Random;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class SolutionTest {

  Solution solution;

  @Test
  public void test1() {
    solution = new SolutionImpl((version) -> version > 1);
    int expected = 2;
    int result = solution.firstBadVersion(2);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    solution = new SolutionImpl((version) -> version > 1);
    int expected = 2;
    int result = solution.firstBadVersion(3);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void test3() {
    solution = new SolutionImpl((version) -> version > 2);
    int expected = 3;
    int result = solution.firstBadVersion(3);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void test4() {
    solution = new SolutionImpl((version) -> version > 0);
    int expected = 1;
    int result = solution.firstBadVersion(1);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void test5() {
    solution = new SolutionImpl((version) -> version > 0);
    int expected = 1;
    int result = solution.firstBadVersion(4);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void leet1() {
    solution = new SolutionImpl((version) -> version > 3);
    int expected = 4;
    int result = solution.firstBadVersion(5);
    Assertions.assertEquals(expected, result);
  }


  @Test(timeout = 1000)
  @RepeatedTest(10)
  public void randomTest() {
    Random rand = new Random();
    int n = rand.nextInt(1000);
    int cutoff = rand.nextInt(n / 2);

    solution = new SolutionImpl((version) -> version > cutoff);
    int expected = 1;
    int result = solution.firstBadVersion(4);
//    Assertions.assertEquals(expected, result);
  }


}
