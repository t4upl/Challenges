package com.artifactId.rocketchallenge.y2020.schaeffler;

import java.util.Arrays;


//60% dont know what is the error

public class Solution {



  public int solve(int N, int[] arr) {
    if (N == 1) {
      return getSum(arr);
    }

    Arrays.sort(arr);
    reverse(arr);
    int[] values = new int[N];
    for (int i = 0; i < arr.length; i++) {
      int task = arr[i];
      int smallestIndex = findSmallest(values);
      values[smallestIndex] = values[smallestIndex] + task;
    }

    return findMax(values);
  }

  private int getSum(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }

  static void reverse(int[] validData) {
    for(int i = 0; i < validData.length / 2; i++)
    {
      int temp = validData[i];
      validData[i] = validData[validData.length - i - 1];
      validData[validData.length - i - 1] = temp;
    }
  }

  static int findMax(int[] values) {
    boolean seen = false;
    int best = 0;
    for (int value : values) {
      if (!seen || value > best) {
        seen = true;
        best = value;
      }
    }
    return seen ? best : -1;

  }

  static int findSmallest(int[] values) {
    int minIndex = 0;
    for (int i = 1; i <  values.length; i++) {
      if (values[minIndex] > values[i]) {
        minIndex = i;
      }

    }
    return minIndex;
  }

}
