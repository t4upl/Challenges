package com.artifactId.leetcode.removeDuplicateLetters;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime: 2 ms, faster than 86.80% of Java online submissions for Remove Duplicate Letters.
 * Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Remove Duplicate Letters.
 */
public class Solution implements SolutionInterface{

  @Override
  public String removeDuplicateLetters(String s) {
    int numberOfletters = 40;
    char[] chars = s.toCharArray();
    int[] numberOfLetterInString = new int[numberOfletters];
    boolean[] charsIsPresentInAnswer = new boolean[numberOfletters];
    for (int i = 0; i< chars.length; i++) {
      numberOfLetterInString[chars[i] - 'a']++;
    }


    List<Character> answer = new ArrayList<>();
    for (int i=0; i< chars.length; i++) {
      char c = chars[i];
      if (answer.size() > 0) {
        char lastElem = answer.get(answer.size() - 1);
        while (c < lastElem && numberOfLetterInString[lastElem - 'a'] > 0
            && !charsIsPresentInAnswer[c  - 'a']) {
          charsIsPresentInAnswer[lastElem  - 'a'] = false;
          answer.remove(answer.size() - 1);

          if (answer.size() == 0) {
            break;
          }
          lastElem = answer.get(answer.size() - 1);
        }
      }

      if (!charsIsPresentInAnswer[c  - 'a']) {
        answer.add(c);
        charsIsPresentInAnswer[c  - 'a'] = true;
      }
      numberOfLetterInString[c - 'a']--;

    }

    //build answer
    StringBuilder stringBuilder = new StringBuilder();
    for (int i=0; i < answer.size(); i++) {
      stringBuilder.append(answer.get(i));
    }

    return stringBuilder.toString();
  }
}
