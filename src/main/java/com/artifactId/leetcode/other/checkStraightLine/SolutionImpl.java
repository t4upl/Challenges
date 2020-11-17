package com.artifactId.leetcode.other.checkStraightLine;

/**
 * You runtime beats 100% of java submissions
 */
public class SolutionImpl implements Solution {

  @Override
  public boolean checkStraightLine(int[][] coordinates) {
    if (coordinates.length == 2) {
      return true;
    }
    int[] firstPoint = coordinates[0];
    int[] secondPoint = coordinates[1];

    int bigX = secondPoint[0] - firstPoint[0];
    int bigY = secondPoint[1] - firstPoint[1];

    for (int i=2; i< coordinates.length; i++) {
      int[] point = coordinates[i];
      if (bigX * (point[1] - firstPoint[1]) != bigY * (point[0] - firstPoint[0])) {
        return false;
      }
    }


    return true;
  }
}
