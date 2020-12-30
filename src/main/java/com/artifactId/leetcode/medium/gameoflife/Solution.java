package com.artifactId.leetcode.medium.gameoflife;

import java.util.Arrays;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
 * Memory Usage: 37.3 MB, less than 78.02% of Java online submissions for Game of Life.
 */
public class Solution {

  private int rows;
  private int columns;

  public void gameOfLife(int[][] board) {
    if (board.length == 0 || board[0].length == 0) {
      return;
    }

    this.rows = board.length;
    this.columns = board[0].length;
    int[][] resultBoard = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        update(i, j, board, resultBoard);
      }
    }

    for (int i = 0; i < rows; i++) {
      board[i] = Arrays.copyOf(resultBoard[i], resultBoard[i].length);
    }

  }

  private void update(int i, int j, int[][] board, int[][] resultBoard) {
    int liveCountAround = getLiveCountAround(i, j, board);

    if (liveCountAround == 3 || (board[i][j] == 1 && liveCountAround == 2)) {
      resultBoard[i][j] = 1;
    }
  }

  private int getLiveCountAround(int i, int j, int[][] board) {
    int liveCountAround = 0;
    for (int k = -1; k < 2; k++) {
      for (int l = -1; l < 2; l++) {
        if (k == 0 && l == 0) {
          continue;
        }

        if (cellLegal(i + k, j + l) && board[i + k][j + l] == 1) {
          liveCountAround++;
        }
      }
    }
    return liveCountAround;
  }

  private boolean cellLegal(int row, int column) {
    return row > -1 && row < this.rows && column > -1 && column < this.columns;
  }


}
