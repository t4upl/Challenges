package com.CodilityChallenges.palladium2020;

import com.artifactId.CodilityChallenges.palladium2020.Solution;
import com.artifactId.CodilityChallenges.palladium2020.SolutionImpl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class SolutionTest {

  Solution solution100;
  Solution solution2;

  @Before
  public void setUp() {
    solution100 = new SolutionImpl();
    solution2 = new SolutionImpl();
  }

  @Test
  public void codility1() throws Exception {
    int[] arr = {3, 1, 4};
    int expected = 10;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility2() throws Exception {
    int[] arr = {5, 3, 2, 4};
    int expected = 17;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility3() throws Exception {
    int[] arr = {5, 3, 5, 2, 1};
    int expected = 19;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility4() {
    int[] arr = {7, 7, 3, 7, 7};
    int expected = 35;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility5() {
    int[] arr = {1, 1, 7, 6, 6, 6};
    int expected = 30;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test1() {
    int[] arr = {1};
    int expected = 1;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test2() {
    int[] arr = {1, 2};
    int expected = 3;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test3() {
    int[] arr = {1, 2, 3};
    int expected = 7;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test4() {
    int[] arr = {1, 3, 2, 2, 2, 3};
    int expected = 16;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test5() {
    int[] arr = {5, 5, 5};
    int expected = 15;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test6() {
    int[] arr = {1, 5, 5, 5};
    int expected = 16;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test7() {
    int[] arr = {1, 5, 5, 5, 2};
    int expected = 21;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test8() {
    int[] arr = {1, 5, 5, 5, 1, 1};
    int expected = 22;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test9() {
    int[] arr = {1, 10, 0, 4, 9};
    int expected = 41;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @Test
  public void test10() {
    int[] arr = {7, 10, 5, 9, 0};
    // 10 10 10 10 0
    int expected = 40;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @Test
  public void test11() {
    int[] arr = {4, 7, 1, 3, 7, 0, 8, 7, 0};
    int expected = 64;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @Test
  public void test12() {
    int[] arr = {1, 2, 3, 7, 8};
    int expected = 25;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @Test
  public void test13() {
    int[] arr = {1, 1, 1, 1, 7, 8, 1};
    int expected = 28;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @Test
  public void test14() {
    int[] arr = {1, 1, 7, 8, 1};
    int expected = 26;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test15() {
    int[] arr = {1, 1, 7, 8, 7, 1};
    int expected = 34;
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    System.out.println("First Assertion passed");
    reverseTest(arr, expected);
    System.out.println("Reverse Assertion passed");
  }

  @RepeatedTest(5)
  public void randomizedTest() throws Exception {
    setUp();
    int arrayLength = ThreadLocalRandom.current().nextInt(2, 10 + 1);
    int minValue = 1;
    int maxValue = 10;
    int[] arr = generateRandomArray(arrayLength, minValue, maxValue);
    System.out.println(Arrays.toString(arr));
    int expected = solution100.solution(arr);
    int result = solution2.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  private int[] generateRandomArray(int arrayLength, int minValue, int maxValue) {
    int[] arr = new int[arrayLength];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
    }
    return arr;
  }

  private void reverseTest(int[] arr, int expected) {
    System.out.println("-----------\nNormal test passed starting reversed test");
    setUp();
    List<Integer> ints = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.reverse(ints);
    int[] objects =  ints.stream().mapToInt(i->i).toArray();
    int result2 = solution2.solution(objects);
    Assertions.assertEquals(expected, result2);
  }

}
