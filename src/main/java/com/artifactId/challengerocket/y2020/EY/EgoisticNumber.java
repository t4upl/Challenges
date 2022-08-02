package com.artifactId.challengerocket.y2020.EY;

public class EgoisticNumber {

  public boolean isEgoistic(String N) {
    char[] chars = N.toCharArray();
    String string1 = String.valueOf(chars[chars.length-1]);
    int i1 = Integer.parseInt(string1);
    int squ = i1 * i1;
    return squ % 10 == i1;
  }

}
