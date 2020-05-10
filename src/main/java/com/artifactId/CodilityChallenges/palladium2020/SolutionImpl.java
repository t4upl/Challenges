package com.artifactId.CodilityChallenges.palladium2020;

import java.util.HashMap;
import java.util.Map;

/**
 *  Codility Silver Award
 *
 *  correct functionality, problems with scalability
 */
public class SolutionImpl implements Solution {

  @Override
  public int solution(int[] H) {
    Map<Integer, Long> secondFrequency = getFrequency(H);
    int maxValue  = getMaxValue(H);

    //single banner
    int result = maxValue * H.length;
    int highestInFirst = -1;
    int highestInSecond = maxValue;


    for (int i = 0; i < H.length; i++) {
      int newBlockInFirst = H[i];
      highestInFirst = Math.max(highestInFirst, newBlockInFirst);

      Long elementCount = secondFrequency.get(newBlockInFirst);
      elementCount--;
      secondFrequency.put(newBlockInFirst, elementCount);
      if (elementCount == 0) {
        secondFrequency.remove(newBlockInFirst);
        if (newBlockInFirst == highestInSecond) {
        highestInSecond = getHighestInSecond(secondFrequency);
        }
      }

      int newResult = highestInFirst * (i + 1) + highestInSecond * (H.length - i - 1);
      result = Math.min(newResult, result);
    }

    return result;
  }

  private int getHighestInSecond(Map<Integer, Long> secondFrequency) {
    int max = -1;
    for (Integer integer : secondFrequency.keySet()) {
      max = Math.max(integer, max);
    }
    return max;
  }

  private Map<Integer, Long> getFrequency(int[] H) {
    Map<Integer, Long> map = new HashMap<>();
    for (int i : H) {
      if (!map.containsKey(i)) {
        map.put(i, 0L);
      }
      map.put(i, map.get(i) + 1);
    }

    return map;
  }

  private int getMaxValue(int[] H) {
    boolean seen = false;
    int best = 0;
    for (int i : H) {
      if (!seen || i > best) {
        seen = true;
        best = i;
      }
    }
    return seen ? best : 0;
  }
}
