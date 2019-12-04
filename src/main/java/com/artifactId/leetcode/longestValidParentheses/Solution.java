package com.artifactId.leetcode.longestValidParentheses;

import java.util.HashMap;
import java.util.Map;

public class Solution implements SolutionInterface {

  Map<Integer, Integer> positionValueMap = new HashMap<>();
  char[] chars;

  @Override
  public int longestValidParentheses(String s) {
    int longest = 0;
    chars = s.toCharArray();
    int openingBracketIndex = 0;
    for (int i = 0; i < chars.length; ) {
      if (chars[i] == '(') {
        openingBracketIndex = i;
        int closingBracket = findClosingBracket(i + 1);
        longest = closingBracket - i + 1;
        i = closingBracket + 1;
      } else {
        longest = i - openingBracketIndex + 1;
        i++;
      }
    }

    return longest;
  }


  private int findClosingBracket(int startingPostion) {
    for (int i = startingPostion; i < chars.length; ) {
      if (chars[i] == '(') {
        int closingBracket = findClosingBracket(i + 1);
        return closingBracket;
      } else {
        if (i + 1 < chars.length && chars[i + 1] == '(') {
          i = findClosingBracket(i + 2);
        }
        return i;
      }

    }
    return -1;
  }
}

//    }
//    for (int i = startingPostion; i < chars.length;) {
//      if ( chars[i] == '(') {
//        int closingBracket = findClosingBracket(i + 1);
////        if (chars[closingBracket + 1] < chars.length && chars[closingBracket + 1] == '(') {
////          closingBracket = findClosingBracket(closingBracket + 1);
////        }
//
//        return closingBracket;
//      } else {
//        if ( i + 1 < chars.length && chars[i+1] == '(') {
//          int closingBracket = findClosingBracket(i + 1);
//          return closingBracket;
//        }
//        return i;
//      }
//    }
//
//    throw new RuntimeException("dupa");

//  }
//}
