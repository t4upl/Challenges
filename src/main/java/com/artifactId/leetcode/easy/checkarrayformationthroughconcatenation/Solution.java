package com.artifactId.leetcode.easy.checkarrayformationthroughconcatenation;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Check Array Formation Through Concatenation.
 * Memory Usage: 38.3 MB, less than 52.57% of Java online submissions for Check Array Formation Through Concatenation.
 */
public class Solution {

  public boolean canFormArray(int[] arr, int[][] pieces) {
    for (int i = 0; i < arr.length; ) {
      int[] pieceStartingWith = getPieceStartingWith(arr[i], pieces);
      if (pieceStartingWith.length == 0 || !matches(arr, i, pieceStartingWith)) {
        return false;
      }

      i += pieceStartingWith.length;
    }

    return true;
  }

  private boolean matches(int[] arr, int indexInArr, int[] pieceStartingWith) {
    for (int i = 0; i < pieceStartingWith.length; i++) {
      if (arr[indexInArr + i] != pieceStartingWith[i]) {
        return false;
      }
    }
    return true;
  }

  private int[] getPieceStartingWith(int firstNumberInPiece, int[][] pieces) {
    for (int[] piece : pieces) {
      if (piece[0] == firstNumberInPiece) {
        return piece;
      }
    }
    return new int[0];
  }

}
