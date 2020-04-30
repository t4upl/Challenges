package com.leetcode.leftmostcolumnwithatleastaone;

import com.artifactId.leetcode.leftmostcolumnwithatleastaone.BinaryMatrix;
import com.artifactId.leetcode.leftmostcolumnwithatleastaone.Solution;
import com.artifactId.leetcode.leftmostcolumnwithatleastaone.SolutionImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new SolutionImpl();
  }

  @Test
  public void leet1() {
    BinaryMatrix binaryMatrix = new BinaryMatrix(new int[][]{{0, 0}, {1, 1}});
    int result = solution.leftMostColumnWithOne(binaryMatrix);
    Assertions.assertEquals(0, result);
  }

  @Test
  public void leet2() {
    BinaryMatrix binaryMatrix = new BinaryMatrix(new int[][]{{0, 0}, {0, 0}});
    int result = solution.leftMostColumnWithOne(binaryMatrix);
    Assertions.assertEquals(-1, result);
  }

  @Test
  public void leet3() {
    BinaryMatrix binaryMatrix = new BinaryMatrix(new int[][]{{0, 0, 0, 1}, {0, 0, 1, 1},
      {0, 1, 1, 1}});
    int result = solution.leftMostColumnWithOne(binaryMatrix);
    Assertions.assertEquals(1, result);
  }

  @Test
  public void test1() {
    BinaryMatrix binaryMatrix = new BinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 1},
      {0, 1, 1}});
    int result = solution.leftMostColumnWithOne(binaryMatrix);
    Assertions.assertEquals(0, result);
  }





}
