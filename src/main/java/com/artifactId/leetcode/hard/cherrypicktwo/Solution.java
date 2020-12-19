package com.artifactId.leetcode.hard.cherrypicktwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Runtime: 138 ms, faster than 5.92% of Java online submissions for Cherry Pickup II.
 * Memory Usage: 47 MB, less than 8.80% of Java online submissions for Cherry Pickup II.
 */
public class Solution {

  private int columns;
  private int rows;

  private final Map<Entry, Integer> memoization = new HashMap<>();

  public int cherryPickup(int[][] grid) {
    if (grid.length == 0) {
      return 0;
    }

    this.rows = grid.length;
    this.columns = grid[0].length;


    return dfs(0, columns - 1, 0, grid);
  }

  private int dfs(int robotOnePosition, int robotTwoPosition, int row, int[][] grid) {
    Entry memoizationKey = new Entry(robotOnePosition, robotTwoPosition, row);
    Integer memoizationVal = memoization.get(memoizationKey);
    if (memoizationVal != null) {
      return memoizationVal;
    }

    int sum = grid[row][robotOnePosition] + grid[row][robotTwoPosition];
    if (robotOnePosition == robotTwoPosition) {
      sum-= grid[row][robotOnePosition];
    }

    int lowerRowsSum = 0;

    row++;
    if (row < this.rows) {
      int newRobotOnePosition;
      int newRobotTwoPosition;
      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; j++) {
          newRobotOnePosition = robotOnePosition + i;
          newRobotTwoPosition = robotTwoPosition + j;
          if (isPositionLegal(newRobotOnePosition) && isPositionLegal(newRobotTwoPosition)) {
            lowerRowsSum = Math.max(dfs(newRobotOnePosition, newRobotTwoPosition, row, grid), lowerRowsSum);
          }
        }
      }
    }

    int answer = sum + lowerRowsSum;
    memoization.put(memoizationKey, answer);
    return answer;
  }

  private boolean isPositionLegal(int position) {
    return position > -1 && position < this.columns;
  }

  private class Entry {
    private int robotOnePosition;
    private int robotTwoPosition;
    private int row;

    public Entry(int robotOnePosition, int robotTwoPosition, int row) {
      this.robotOnePosition = robotOnePosition;
      this.robotTwoPosition = robotTwoPosition;
      this.row = row;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Entry entry = (Entry) o;
      return robotOnePosition == entry.robotOnePosition &&
        robotTwoPosition == entry.robotTwoPosition &&
        row == entry.row;
    }

    @Override
    public int hashCode() {
      return Objects.hash(robotOnePosition, robotTwoPosition, row);
    }
  }

}
