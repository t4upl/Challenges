package com.artifactId.hackerrank.jobfairseptember2020;

import java.util.Comparator;
import java.util.List;

public class PackagingConstraints {


  public static int findDolls(List<Integer> size) {
    // Write your code here
    size.sort(Comparator.naturalOrder());

    int[] merged = new int[size.size()];
    int mergeCount = 0;
    int smallestStart = size.size() - 1;
    for (int i = 0; i < size.size(); i++) {
      int outerBoxIndex = size.size() - i - 1;
      if (merged[outerBoxIndex] == 1) {
        continue;
      }

      int smallerIndex = findSmaller(size.get(outerBoxIndex), size, merged, smallestStart);
      if (smallerIndex != -1) {
        merged[outerBoxIndex] = 1;
        merged[smallerIndex] = 1;
        mergeCount+=1;
        smallestStart = smallerIndex;
      }

    }

    return size.size() - mergeCount;

  }

  private static int findSmaller(int value, List<Integer> size,
    int[] merged, int smallestStart) {
    for (int i = 0; i < size.size(); i++) {
      int toBeSwallowedIndex = size.size() -1 -i;
      if (toBeSwallowedIndex > smallestStart) {
        continue;
      }
      if (merged[toBeSwallowedIndex] == 0 && size.get(toBeSwallowedIndex) * 2 < value) {
        return toBeSwallowedIndex;
      }
    }
    return -1;
  }

}
