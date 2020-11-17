package com.artifactId.leetcode.other.intToRoman;

/**
 * Runtime: 6 ms, faster than 21.77% of Java online submissions for Integer to Roman.
 * Memory Usage: 36 MB, less than 100.00% of Java online submissions for Integer to Roman.
 */
public class Solution implements SolutionInterface {

  String[] roman = { "I", "V", "X", "L", "C", "D", "M"};

  @Override
  public String intToRoman(int num) {
    String s = "0000" + Integer.valueOf(num).toString();
    s = s.substring(s.length() - 4, s.length());
    char[] chars = s.toCharArray();
    StringBuilder result = new StringBuilder();
    for (int i  = 0; i < chars.length; i++) {
      int index = chars.length - i - 1;
      int value = Character.getNumericValue(chars[i]);
      if (value == 0) {
        continue;
      }

      if (index == 3) {
        result.append(getMTimes(value));
      } else {
        result.append(getRoman(value, index));
      }
    }

    return result.toString();
  }

  private String getRoman(int value, int index) {
    index =  index * 2;
    String A = roman[index];
    String B = roman[index + 1];
    String C = roman[index + 2];

    switch (value) {
      case 0: return "";
      case 1: return A;
      case 2: return A + A;
      case 3: return A + A + A;
      case 4: return A + B ;
      case 5: return B;
      case 6: return B + A;
      case 7: return B + A + A;
      case 8: return B + A + A + A;
      case 9: return A + C;
    }

    throw new RuntimeException("Something went wrong");
  }

  private String getMTimes(int num) {
    return num == 3 ? "MMM" : num == 2 ? "MM" : "M";
  }

}
