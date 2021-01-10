package com.artifactId.leetcode.easy.checkiftwostringarraysareequivalent;

/**
 * Runtime: 1 ms, faster than 66.19% of Java online submissions for Check If Two String Arrays are Equivalent.
 * Memory Usage: 36.6 MB, less than 98.94% of Java online submissions for Check If Two String Arrays are Equivalent.
 */
public class Solution {

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    Tokeninzer tokeninzer1 = new Tokeninzer(word1);
    Tokeninzer tokeninzer2 = new Tokeninzer(word2);

    Character token1 = tokeninzer1.getToken();
    Character token2 = tokeninzer2.getToken();
    while (token1 != null && token2 != null) {
      if (token1 != token2) {
        return false;
      }
      token1 = tokeninzer1.getToken();
      token2 = tokeninzer2.getToken();
    }

    return token1 == null && token2 == null;
  }

  class Tokeninzer {
    String[] word;
    int wordIndex = 0;
    int tokenIndex = 0;

    Tokeninzer(String[] word) {
      this.word = word;
    }

    Character getToken() {
      if (tokenIndex == word[wordIndex].length()) {
        wordIndex = Math.min(wordIndex + 1, word.length);
        if (wordIndex == word.length) {
          return null;
        }
        tokenIndex = 0;
      }

      return word[wordIndex].charAt(tokenIndex++);
    }
  }

}
