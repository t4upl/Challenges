package com.artifactId.hackerrank.jobfairseptember2020;

public class CircularLeftShift {

  public static int countStrings(String s) {
    // Write your code here
    if (s == null || s.length() == 0) {
      return 0;
    }

    if (s.length() == 1) {
      return 1;
    }

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      s = s.substring(1, s.length()) + s.charAt(0);
      if (s.charAt(0) == s.charAt(s.length() -1 )) {
        result++;
      }
    }
    return result;

    // Write your code here
  }

}
