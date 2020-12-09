package com.artifactId.leetcode.medium.spiralmatrixtwo;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
 * Memory Usage: 37.4 MB, less than 38.41% of Java online submissions for Spiral Matrix II.
 */
public class Solution {

  private int val = 1;

  public int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];
    layer(new Pair(0, 0), n, result);
    return result;
  }

  private void layer(Pair pair, int numberOfSteps, int[][] result) {
    if (numberOfSteps == 0) {
      return;
    }

    if (numberOfSteps == 1) {
      result[pair.x][pair.y] = val;
      return;
    }

    line(pair, 0, 1, numberOfSteps, result);
    pair.x += 1;
    if (numberOfSteps - 2 > 0) {
      line(pair, 1, 0, numberOfSteps - 2, result);
      pair.x += 1;
    }
    line(pair, 0, -1, numberOfSteps, result);
    pair.x += -1;
    if (numberOfSteps - 2 > 0) {
      line(pair, -1, 0, numberOfSteps - 2, result);
      pair.y += 1;
    }
    layer(pair, numberOfSteps - 2, result);
  }

  private void line(Pair pair, int xStep, int yStep, int numberOfSteps, int[][] result) {
    for (int i = 0; i < numberOfSteps; i++) {
      result[pair.x][pair.y] = val;
      val++;
      pair.x += xStep;
      pair.y += yStep;
    }

    pair.x -= xStep;
    pair.y -= yStep;

  }

  private class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

}
