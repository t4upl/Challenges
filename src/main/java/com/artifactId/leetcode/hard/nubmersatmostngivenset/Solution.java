package com.artifactId.leetcode.hard.nubmersatmostngivenset;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

/**
 * Runtime: 4 ms, faster than 14.24% of Java online submissions for Numbers At Most N Given Digit Set.
 * Memory Usage: 36.6 MB, less than 25.28% of Java online submissions for Numbers At Most N Given Digit Set.
 */
public class Solution {

  public int atMostNGivenDigitSet(String[] digits, int n) {
    if (digits.length == 0 || n < 1) {
      return 0;
    }

    int countOfNumbersWithNumberOfElementsSmallerThanN = getCountOfNumbersWithNumberOfElementsSmallerThanN(
      digits, n);

    String nAsString = String.valueOf(n);
    List<Integer> digitsAsInteger = Arrays.stream(digits).map(Integer::valueOf).collect(toList());

    int countOfNumbersWithSameNumberOfDigitsAsN = getCombo(digitsAsInteger, nAsString, 0);

    return countOfNumbersWithNumberOfElementsSmallerThanN + countOfNumbersWithSameNumberOfDigitsAsN ;
  }

  private int getCombo(List<Integer> digits, String nAsString, int position) {
    if (position == nAsString.length()) {
      return nCanBeWrittenUsingDigits(nAsString, digits) ? 1 : 0;
    }

    int digitInN = nAsString.charAt(position) - '0';
    int numberOfDigitsSmallerThanDigitInN = getMumberOfDigitsSmallerThanDigitInN(digits, digitInN);
    int smallerThanNCombinations =
      (int) (numberOfDigitsSmallerThanDigitInN * Math.pow(digits.size(), nAsString.length() - position - 1));

    int comboInNextPosition = 0;
    if (digits.contains(digitInN)) {
      comboInNextPosition = getCombo(digits, nAsString, position + 1);
    }

    return smallerThanNCombinations +  comboInNextPosition;
  }

  private boolean nCanBeWrittenUsingDigits(String nAsString, List<Integer> digits) {
    for (char c : nAsString.toCharArray()) {
      int i = c - '0';
      if (!digits.contains(i)) {
        return false;
      }
    }
    return true;
  }

  private int getMumberOfDigitsSmallerThanDigitInN(List<Integer> digits, int digitInN) {
    return (int) digits.stream().filter(x -> x < digitInN).count();
  }


  private int getCountOfNumbersWithNumberOfElementsSmallerThanN(String[] digits, int n) {
    int k = 1;
    int counter = 0;
    while (k <= n) {
      k *= 10;
      counter++;
    }

    int sum = 0;
    for (int i = 0; i < counter -1; i++) {
      sum += Math.pow(digits.length, i + 1);
    }

    return sum;
  }

}
