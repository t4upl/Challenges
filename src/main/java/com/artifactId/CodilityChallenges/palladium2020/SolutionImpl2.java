package com.artifactId.CodilityChallenges.palladium2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * not working :(
 */
public class SolutionImpl2 implements Solution {

  int[] H;
  int higherBannerMinIndex = -1;
  int higherBannerMaxIndex = -1;
  int maxValue;

  @Override
  public int solution(int[] H) {
    this.H = H;
    maxValue = getMaxValue(H);
    for (int i = 0; i < H.length; i++) {
      if (maxValue == H[i]) {
        higherBannerMaxIndex = i;
        if (higherBannerMinIndex == -1) {
          higherBannerMinIndex = i;
        }
      }
    }

    if (higherBannerMinIndex == 0 && higherBannerMaxIndex == H.length - 1) {
      return H.length * maxValue;
    }

    // check if right or left section should be attached to higher banner
    int extraBlocksLeft = getExtraBlocks(0, higherBannerMinIndex);
    int extraBlocksRight = getExtraBlocks(higherBannerMaxIndex, H.length);

    boolean shouldAttachRight = extraBlocksRight < extraBlocksLeft;
    if (shouldAttachRight) {
      higherBannerMaxIndex = H.length - 1;
    } else {
      higherBannerMinIndex = 0;
    }
    int higherBannerArea = getArea(higherBannerMinIndex, higherBannerMaxIndex + 1, maxValue);
    System.out.println("higher area: " + higherBannerArea);


    //add some of blocks of the lower banner to higher banner
    int startOfLowerBanner = 0;
    int endOfLowerBanner = higherBannerMinIndex;
    if (!shouldAttachRight) {
      startOfLowerBanner = higherBannerMaxIndex + 1;
      endOfLowerBanner = H.length;
    }


    int lowerBannerArea = -1000;
    if (shouldAttachRight) {
      lowerBannerArea = getLowerAreaLeft(startOfLowerBanner, endOfLowerBanner);
    } else {
      lowerBannerArea = getLowerAreaRight(startOfLowerBanner, endOfLowerBanner);
    }


    int area = higherBannerArea + lowerBannerArea;
    return area;
  }

  private int getLowerAreaLeft(int startOfLowerBanner, int endOfLowerBanner) {
    //move some blocks from lower banner to higher banner
    List<Integer> valuesInLowerBannerInDescOrder = getValuesInLowerBannerInDescOrder(
      startOfLowerBanner, endOfLowerBanner);
    Map<Integer, Pair> valueToPositionPair = getValueToPositionPair(startOfLowerBanner,
      endOfLowerBanner);

    int higherBannerMinIndex = this.higherBannerMinIndex;
    int sumArea = getArea(startOfLowerBanner, endOfLowerBanner, valuesInLowerBannerInDescOrder.get(0));

    for (int i = 0; i < valuesInLowerBannerInDescOrder.size() - 1; i++) {
      int heightToBeJoinedToHighestBanner = valuesInLowerBannerInDescOrder.get(i);
      int newHeightOfLowerBanner = valuesInLowerBannerInDescOrder.get(i + 1);

      int newHigherBannerMinIndex = valueToPositionPair.get(heightToBeJoinedToHighestBanner ).start;
      if (newHigherBannerMinIndex > higherBannerMinIndex) {
        continue;
      }

      int newLowerAreaBannerArea = getArea(startOfLowerBanner, newHigherBannerMinIndex, newHeightOfLowerBanner);
      int newHigherBannerArea =  getArea(newHigherBannerMinIndex, endOfLowerBanner, maxValue);
      int newSumArea = newLowerAreaBannerArea + newHigherBannerArea;

      if (newSumArea < sumArea) {
        sumArea = newSumArea;
        higherBannerMinIndex = newHigherBannerMinIndex;
      }
    }
    return sumArea;
  }

  private int getLowerAreaRight(int startOfLowerBanner, int endOfLowerBanner) {
    List<Integer> valuesInLowerBannerInDescOrder = getValuesInLowerBannerInDescOrder(
      startOfLowerBanner, endOfLowerBanner);
    Map<Integer, Pair> valueToPositionPair = getValueToPositionPair(startOfLowerBanner,
      endOfLowerBanner);

    int higherBannerMaxIndex = this.higherBannerMaxIndex;
    int sumArea = getArea(startOfLowerBanner, endOfLowerBanner, valuesInLowerBannerInDescOrder.get(0));

    for (int i = 0; i < valuesInLowerBannerInDescOrder.size() - 1; i++) {
      int heightToBeJoinedToHighestBanner = valuesInLowerBannerInDescOrder.get(i);
      int newHeightOfLowerBanner = valuesInLowerBannerInDescOrder.get(i + 1);

      int newHigherBannerMaxIndex = valueToPositionPair.get(heightToBeJoinedToHighestBanner ).end;
      if (newHigherBannerMaxIndex < higherBannerMaxIndex) {
        continue;
      }

      int newLowerAreaBannerArea = getArea(newHigherBannerMaxIndex + 1, endOfLowerBanner, newHeightOfLowerBanner);
      int newHigherBannerArea =  getArea(startOfLowerBanner, newHigherBannerMaxIndex + 1, maxValue);
      int newSumArea = newLowerAreaBannerArea + newHigherBannerArea;

      if (newSumArea < sumArea) {
        sumArea = newSumArea;
        higherBannerMaxIndex = newHigherBannerMaxIndex;
      }
    }
    return sumArea;
  }

  private int getArea(int start, int end, Integer height) {
    return (end - start) * height;
  }

  private Map<Integer, Pair> getValueToPositionPair(int startOfLowerBanner, int endOfLowerBanner) {
    Map<Integer, Pair> map = new HashMap<>();

    IntStream.range(startOfLowerBanner, endOfLowerBanner).forEach(index -> {
      if (!map.containsKey(H[index])) {
        map.put(H[index], new Pair(index, index));
      }

      map.put(H[index], new Pair(map.get(H[index]).start, index));

    });
    return map;
  }

  private List<Integer> getValuesInLowerBannerInDescOrder(int startOfLowerBanner,
    int endOfLowerBanner) {
    return Arrays.stream(H, startOfLowerBanner, endOfLowerBanner)
      .distinct()
      .boxed()
      .sorted(Collections.reverseOrder())
      .collect(Collectors.toList());
  }

  private int getExtraBlocks(int start, int end) {
    int extraBlocks = Arrays.stream(H, start, end)
      .boxed()
      .mapToInt(x -> maxValue - x)
      .sum();

    return extraBlocks;
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

  private class Pair {

    int start;
    int end;

    public Pair(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

}
