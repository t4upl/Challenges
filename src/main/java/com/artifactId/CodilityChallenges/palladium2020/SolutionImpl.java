package com.artifactId.CodilityChallenges.palladium2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionImpl implements Solution {

  @Override
  public int solution(int[] H) {
    Map<Integer, Long> secondFrequency = Arrays.stream(H).boxed()
      .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

    int[] sortedLengthsArr = Arrays.copyOf(H, H.length);
    Arrays.sort(sortedLengthsArr);
    List<Integer> sortedLengths  = Arrays.stream(sortedLengthsArr).boxed().sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());

    //single banner
    int result = sortedLengths.get(0) * H.length;
    int highestInFirst = -1;
    int highestInSecond = sortedLengths.get(0);


    for (int i = 0; i < H.length; i++) {
      int newBlockInFirst = H[i];
      highestInFirst = Math.max(highestInFirst, newBlockInFirst);

      Long elementCount = secondFrequency.get(newBlockInFirst);
      elementCount--;
      secondFrequency.put(newBlockInFirst, elementCount);
      if (elementCount == 0) {
        secondFrequency.remove(newBlockInFirst);
        if (newBlockInFirst == highestInSecond) {
        highestInSecond = Math
          .toIntExact(secondFrequency.keySet().stream().max(Comparator.naturalOrder()).orElse(0));
        }
      }

      int newResult = highestInFirst * (i + 1) + highestInSecond * (H.length - i - 1);
      result = Math.min(newResult, result);
    }

    return result;
  }
}
