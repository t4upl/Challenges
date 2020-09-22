package com.artifactId.hackerrank.jobfairseptember2020;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CircularLeftShiftTest {

  CircularLeftShift circularLeftShift;

  @Before
  public void setUp() throws Exception {
    circularLeftShift = new CircularLeftShift();
  }

  @Test
  public void test1() {
    int result = CircularLeftShift.countStrings("aaabbba");
    assertEquals(5, result);

  }
}