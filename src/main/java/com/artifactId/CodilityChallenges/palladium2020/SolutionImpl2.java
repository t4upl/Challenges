package com.artifactId.CodilityChallenges.palladium2020;

import java.util.Arrays;
import java.util.OptionalInt;

public class SolutionImpl2 implements Solution {

  int[] H;

  @Override
  public int solution(int[] H) {
    this.H = H;

    int max =-1;
    int maxMinIndex = -1;
    int maxMaxIndex = -1;

    for (int i = 0; i < H.length; i++) {
      if (H[i] > max) {
        max = H[i];
        maxMinIndex = i;
        maxMaxIndex = i;
        continue;
      }

      if (H[i] == max) {
        maxMaxIndex = i;
      }
    }


    if (maxMinIndex == 0 && maxMaxIndex == H.length -1) {
      return max * H.length;
    }


    int highestSection = getArea(maxMinIndex, maxMaxIndex + 1, max);
    int leftSectionWithHeightMax = getArea(0, maxMinIndex, max);
    int rightSectionWithHeightMax = getArea(maxMaxIndex +1, H.length, max);
    int leftMaxHeight = getMaxHeight(0, maxMinIndex);
    int rightMaxHeight = getMaxHeight(maxMaxIndex +1, H.length);
    int leftSectionWithLefHeight = getArea(0, maxMinIndex, leftMaxHeight);
    int rightSectionWithRightHeight = getArea(maxMaxIndex + 1, H.length, rightMaxHeight);

    int leftSectionAttachedToHigherArea = leftSectionWithHeightMax + rightSectionWithRightHeight;
    int rightSectionAttachedToHigherArea = leftSectionWithLefHeight + rightSectionWithHeightMax;

    int area = highestSection + Math.min(leftSectionAttachedToHigherArea, rightSectionAttachedToHigherArea);

//    if (leftAreaX == rightAreaX) {
//      int leftMaxHeight = getLeftMaxHeight(maxMinIndex);
//      int rightMaxHeight = getRightMaxHeight(maxMaxIndex);
//      shouldAttachLeftSectionToHigherBanner = leftMaxHeight > rightMaxHeight;
//    } else {
//      shouldAttachLeftSectionToHigherBanner = leftAreaX < rightAreaX;
//    }

//
//    int area = -1;
//    if (shouldAttachLeftSectionToHigherBanner) {
//      int rightMaxHeight = getRightMaxHeight(maxMaxIndex);
//      area = getArea(0, maxMaxIndex + 1, max) + getArea(maxMaxIndex + 1, H.length, rightMaxHeight);
//    } else {
//      int leftMaxHeight = getLeftMaxHeight(maxMinIndex);
//      area = getArea(0, maxMinIndex, leftMaxHeight) + getArea(maxMinIndex , H.length, max);
//    }

    return area;
  }

  private int getMaxHeight(int start, int end) {
    return Arrays.stream(H, start, end).max().orElse(-1);
  }

  private int getArea(int start, int end, int height) {
    return (end - start) * height;
  }

  private int getRightMaxHeight(int maxMaxIndex) {
    boolean seen = false;
    int best = 0;
    int bound = H.length;
    for (int j = maxMaxIndex + 1; j < bound; j++) {
      int i = H[j];
      if (!seen || i > best) {
        seen = true;
        best = i;
      }
    }
    return (seen ? OptionalInt.of(best) : OptionalInt.empty())
      .orElseThrow(() -> new RuntimeException(""));
  }

  private int getLeftMaxHeight(int maxMinIndex) {
    boolean seen = false;
    int best = 0;
    for (int j = 0; j < maxMinIndex; j++) {
      int i = H[j];
      if (!seen || i > best) {
        seen = true;
        best = i;
      }
    }
    return (seen ? OptionalInt.of(best) : OptionalInt.empty())
      .orElseThrow(() -> new RuntimeException(""));
  }

}
