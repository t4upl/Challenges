package com.artifactId.leetcode.other.numberofislands;

import java.util.Arrays;
import java.util.List;

/**
 * Runtime: 3 ms, faster than 25.33% of Java online submissions for Number of Islands.
 * Memory Usage: 42.1 MB, less than 9.69% of Java online submissions for Number of Islands.
 */
public class Solution {

  int m;
  int n;
  char[][] grid;

  public int numIslands(char[][] grid) {
    m = grid.length;
    n = grid[0].length;
    this.grid = grid;
    int sum = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          sum++;
          dfs(i, j);
        }
      }
    }
    return sum;
    
  }

  private void dfs(Integer mItr, Integer nItr) {
    grid[mItr][nItr] = '\u0000';

    List<Integer> ms = Arrays.asList(mItr + 1, mItr - 1, mItr, mItr);
    List<Integer> ns = Arrays.asList(nItr, nItr, nItr + 1, nItr -1);
    for (int i = 0; i < ms.size(); i++) {
      int neighbourM =  ms.get(i);
      int neighbourN =  ns.get(i);

      if (-1  < neighbourM && neighbourM < m && -1  < neighbourN && neighbourN < n) {
        if (grid[neighbourM][neighbourN] == '1' ) {
          dfs(neighbourM, neighbourN);
        }
      }
    }
  }

}
