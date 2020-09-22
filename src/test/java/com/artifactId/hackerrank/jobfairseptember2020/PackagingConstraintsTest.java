package com.artifactId.hackerrank.jobfairseptember2020;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PackagingConstraintsTest {

  PackagingConstraints packagingConstraints;

  @Test
  public void test1() {
    List<Integer> ints = Arrays.stream(new Integer[]{2, 5, 7, 6, 9, 8, 4, 2}).collect(toList());
    int result = PackagingConstraints.findDolls(ints);
    assertEquals(5, result);

  }
}