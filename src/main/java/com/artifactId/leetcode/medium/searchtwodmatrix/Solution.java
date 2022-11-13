package com.artifactId.leetcode.medium.searchtwodmatrix;

import java.util.Arrays;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search texteditor 2D Matrix.
 * Memory Usage: 38.2 MB, less than 93.83% of Java online submissions for Search texteditor 2D Matrix.
 */
public class Solution {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int row = getRow(matrix, target);
    if (row == -1) {
      return false;
    }

    int searchIndex = Arrays.binarySearch(matrix[row], target);
    return searchIndex >= 0;
  }

  private int getRow(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      int[] row = matrix[i];
      if (row[0] <= target && row[row.length -1] >= target) {
        return i;
      }
    }
    return -1;
  }

}
