package com.artifactId.challengerocket.y2020.EY;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighestNumberTest {

  @Test
  public void name() {
    HighestNumber highestNumber = new HighestNumber();
    int solve = highestNumber.solve(23423);
    assertEquals(43322, solve);
  }
}