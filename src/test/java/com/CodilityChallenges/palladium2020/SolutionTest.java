package com.CodilityChallenges.palladium2020;

import com.artifactId.CodilityChallenges.palladium2020.Solution;
import com.artifactId.CodilityChallenges.palladium2020.SolutionImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
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
  public void codility1() {
    int[] arr = {3, 1, 4};
    int expected = 10;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility2() {
    int[] arr = {5, 3, 2, 4};
    int expected = 17;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility3() {
    int[] arr = {5, 3, 5, 2, 1};
    int expected = 19;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility4() {
    int[] arr = {7, 7, 3, 7, 7};
    int expected = 35;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void codility5() {
    int[] arr = {1, 1, 7, 6, 6, 6};
    int expected = 30;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test1() {
    int[] arr = {1};
    int expected = 1;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test2() {
    int[] arr = {1, 2};
    int expected = 3;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test3() {
    int[] arr = {1, 2, 3};
    int expected = 7;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  @Test
  public void test4() {
    int[] arr = {1, 3, 2, 2, 2, 3};
    int expected = 16;
    int result = solution.solution(arr);
    Assertions.assertEquals(expected, result);
    reverseTest(arr, expected);
  }

  private void reverseTest(int[] arr, int expected) {
    List<Integer> ints = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.reverse(ints);
    int[] objects =  ints.stream().mapToInt(i->i).toArray();
    int result2 = solution.solution(objects);
    Assertions.assertEquals(expected, result2);
  }

}
