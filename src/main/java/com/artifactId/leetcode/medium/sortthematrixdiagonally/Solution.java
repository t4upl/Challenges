package com.artifactId.leetcode.medium.sortthematrixdiagonally;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Runtime: 19 ms, faster than 5.22% of Java online submissions for Sort the Matrix Diagonally.
 * Memory Usage: 45.7 MB, less than 5.17% of Java online submissions for Sort the Matrix Diagonally.
 */
public class Solution {

  private int rows;
  private int columns;

  public int[][] diagonalSort(int[][] mat) {
    rows = mat.length;
    columns = mat[0].length;

    int startX = 0;
    int startY = columns - 1;
    boolean goLeft = true;
    while (startX < rows) {
      sortAndInsert(mat, startX, startY);
      if (goLeft) {
        startY--;
        if (startY == -1) {
          goLeft = false;
          startX = 1;
          startY = 0;
        }
      } else {
        startX++;
      }

    }

    return mat;
  }

  private void sortAndInsert(int[][] mat, int startX_a, int startY_a) {
    List<Integer> ans = new LinkedList<>();
    int startX = startX_a;
    int startY = startY_a;
    while (startX < rows && startY < columns) {
      ans.add(mat[startX][startY]);
      startX++;
      startY++;
    }

    ans.sort(Comparator.naturalOrder());

    startX = startX_a;
    startY = startY_a;
    while (startX < rows && startY < columns) {
      mat[startX][startY] = ((LinkedList<Integer>) ans).pop();
      startX++;
      startY++;
    }
  }

}
