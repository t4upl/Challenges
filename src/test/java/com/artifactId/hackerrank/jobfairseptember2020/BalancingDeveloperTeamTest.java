package com.artifactId.hackerrank.jobfairseptember2020;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BalancingDeveloperTeamTest {

  @Test
  public void test1() {
    List<Integer> ints = Arrays.stream(new Integer[]{5, 4, 1, 3, 4}).collect(toList());
    int result = BalancingDeveloperTeam.maxBalancedTeams(ints, 2);
    assertEquals(3, result);
  }
}