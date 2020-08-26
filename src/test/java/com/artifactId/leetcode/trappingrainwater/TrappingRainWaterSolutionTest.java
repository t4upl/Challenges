package com.artifactId.leetcode.trappingrainwater;

import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrappingRainWaterSolutionTest {

  TrappingRainWaterSolution trappingRainWaterSolution;

  @Before
  public void setup() {
    trappingRainWaterSolution = new TrappingRainWaterSolutionTwoPointersImpl();
  }

  /**
   *          x
   *    x     x
   *    x _ _ x _ x
   */
  @Test
  public void test1() {
    int[] array = new int[]{2, 0, 0, 3, 0, 1};
    int expectedResult = 5;
    int result = trappingRainWaterSolution.trap(array);
    Assert.assertEquals(expectedResult, result);

    array = reverseArray(array);
    result = trappingRainWaterSolution.trap(array);
    Assert.assertEquals(expectedResult, result);
  }

  /**
   *                x
   *        x       x x   x
   *  _ x _ x x _ x x x x x x
   */
  @Test
  public void leetTest1() {
    int[] array = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    int expectedResult = 6;
    int result = trappingRainWaterSolution.trap(array);
    Assert.assertEquals(expectedResult, result);

    array = reverseArray(array);
    result = trappingRainWaterSolution.trap(array);
    Assert.assertEquals(expectedResult, result);
  }

  private int[] reverseArray(int[] arr) {
      return IntStream.rangeClosed(1, arr.length)
        .mapToObj(i -> arr[arr.length - i])
        .mapToInt(x -> x)
        .toArray();
  }

}
