package com.artifactId.leetcode.other.leftmostcolumnwithatleastaone;

import java.util.List;

public class SolutionImpl implements Solution {

  @Override
  public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
    if (binaryMatrix == null) {
      return -1;
    }

    List<Integer> dimensions = binaryMatrix.dimensions();
    Integer rows = dimensions.get(0);
    Integer columns = dimensions.get(1);

    int row = 0;
    int column = columns - 1;

    int answer = -1;
    while (row != rows && column != -1 ) {
      int cellValue = binaryMatrix.get(row, column);
      if (cellValue == 1) {
        answer = answer == -1 ? column : answer;
        answer = Math.min(answer, column);
        column--;
      }

      if (cellValue == 0) {
        row++;
      }
    }

    return answer;
  }

}
