package com.artifactId.CodilityChallenges.palladium2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  Codility Silver Award
 *
 *  correct functionality, problems with scalability
 */
public class SolutionImpl implements Solution {

  private List<Integer> valuesInSecondSorted;
  private int highestValueInSecondIndex = 0;

  @Override
  public int solution(int[] H) {
    Map<Integer, Long> secondFrequency = getFrequency(H);
    valuesInSecondSorted = getValuesInSecondSorted(H);
    int maxValue  = getMaxValue(H);
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
        if (newBlockInFirst == highestInSecond && secondFrequency.size() > 0) {
          highestInSecond = getHighestInSecondV2(secondFrequency);
        }
      }

      int newResult = highestInFirst * (i + 1) + highestInSecond * (H.length - i - 1);
      result = Math.min(newResult, result);
    }

    return result;
  }

  private int getHighestInSecondV2(Map<Integer, Long> secondFrequency) {
    Long mapValue = secondFrequency.get(valuesInSecondSorted.get(highestValueInSecondIndex));
    while (mapValue == null) {
      highestValueInSecondIndex++;
      mapValue = secondFrequency.get(valuesInSecondSorted.get(highestValueInSecondIndex));
    }

    return valuesInSecondSorted.get(highestValueInSecondIndex);
  }

  private List<Integer> getValuesInSecondSorted(int[] H) {
    List<Integer> list = new ArrayList<>();
    Set<Integer> uniqueValues = new HashSet<>();
    for (int i : H) {
      if (uniqueValues.add(i)) {
        Integer integer = i;
        list.add(integer);
      }
    }
    list.sort(Collections.reverseOrder());
    return list;
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
