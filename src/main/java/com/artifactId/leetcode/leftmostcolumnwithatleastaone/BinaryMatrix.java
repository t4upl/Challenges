package com.artifactId.leetcode.leftmostcolumnwithatleastaone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryMatrix {

   final int[][] matrix;

   public BinaryMatrix(int[][] matrix) {
      this.matrix = matrix;
   }

   public int get(int row, int col) {
      return matrix[row][col];
   }

   public List<Integer> dimensions() {
      int rows = matrix.length;
      int columns = matrix[0].length;
      return Arrays.asList(rows, columns);
   }

}
