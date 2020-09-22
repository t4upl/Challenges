package com.artifactId.hackerrank.jobfairseptember2020;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class BalancingDeveloperTeam {

  public static int maxBalancedTeams(List<Integer> developers, int maxNewHires) {
    // Write your code here
    HashSet<Integer> teamSizes = new HashSet<>(developers);

    developers.sort(Comparator.naturalOrder());
    int max = 0;

    for (int teamSize : teamSizes) {
      int numberOfBalancedTeams =  getNumberOfBalancedTeams(teamSize, developers, maxNewHires);
      max = Math.max(max, numberOfBalancedTeams);
    }

    return max;
  }

  private static int getNumberOfBalancedTeams(int teamSize, List<Integer> developers,
    int maxNewHires) {

    int result = 0;
    for (int i = 0; i < developers.size(); i++) {
      int index = developers.size() - 1 - i;
      Integer devTeamSize = developers.get(index);
      if (devTeamSize > teamSize) {
        continue;
      }

      if (maxNewHires >= teamSize - devTeamSize) {
        result++;
        maxNewHires = maxNewHires - (teamSize - devTeamSize);
      }
    }


    return result;
  }


}
