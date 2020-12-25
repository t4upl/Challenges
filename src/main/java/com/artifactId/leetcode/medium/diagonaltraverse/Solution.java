package com.artifactId.leetcode.medium.diagonaltraverse;

/**
 * Runtime: 123 ms, faster than 5.10% of Java online submissions for Diagonal Traverse.
 * Memory Usage: 41.1 MB, less than 67.28% of Java online submissions for Diagonal Traverse.
 */
public class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return new int[0];
    }

    int rows = matrix.length;
    int columns = matrix[0].length;

    int elemMatrixCount = rows * columns;

    int[] ans  = new int[elemMatrixCount];
    int ansIndex = 0;

    int[] reverseArr = new int[Math.max(rows, columns)];
    int reverseArrIndex= 0;

    int rowProccesed = 0;
    boolean isUpwards = true;
    while (ansIndex < elemMatrixCount) {
      int i = rowProccesed;
      int j = 0;
      while (i > -1) {

        if (j == columns) {
          break;
        }

        if (i < rows) {
          int matrixElem = matrix[i][j];
          if (isUpwards) {
            ans[ansIndex++] = matrixElem;
          } else {
            reverseArr[reverseArrIndex++] = matrixElem;
          }
        }
        i--;
        j++;
      }

      if (!isUpwards) {
        pasteReversed(reverseArr, ans, ansIndex, reverseArrIndex);
        ansIndex += reverseArrIndex;
        reverseArrIndex = 0;
      }

      isUpwards = !isUpwards;
      rowProccesed++;
    }



    return ans;
  }

  private void pasteReversed(int[] reverseArr, int[] ans, int ansIndex, int reverseArrLength) {
    for (int j = 0; j < reverseArrLength; j++) {
      ans[ansIndex++] = reverseArr[reverseArrLength - j - 1];
    }
  }

}
