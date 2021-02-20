package com.artifactId.leetcode.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution2 implements SolutionInterface {

  /**
   *
   * Runtime: 6 ms, faster than 51.47% of Java online submissions for Roman to Integer.
   * Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Roman to Integer.
   *
   */

  @Override
  public int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put( 'I', 1 );
    map.put( 'V', 5 );
    map.put( 'X', 10 );
    map.put( 'L', 50  );
    map.put( 'C', 100 );
    map.put( 'D', 500 );
    map.put( 'M', 1000 );

    char[] chars = s.toCharArray();
    int result = 0;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (c == 'M') {
        result += map.get(c);
      } else {
        int current = map.get(c);
        if (i+1 < chars.length && map.get(chars[i+1]) > current) {
          result-=current;
        } else {
          result += current;
        }
      }
    }

    return result;
  }
}
