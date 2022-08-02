package com.artifactId.challengerocket.y2020.EY;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HighestNumber {

  public int solve(int N) {
    String string = new Integer(N).toString();
    char[] chars = string.toCharArray();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < chars.length; i++) {
      String string1 = String.valueOf(chars[i]);
      list.add(Integer.parseInt(string1));
    }

    list.sort(Comparator.reverseOrder());

    int result = 0;
    int pow  = 1;
    for (int i = 0; i < list.size(); i++) {
      result += (list.get(list.size() - 1 - i) * pow);
      pow*=10;
    }

    return result;
  }



}
