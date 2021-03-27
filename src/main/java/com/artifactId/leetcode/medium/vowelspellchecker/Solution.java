package com.artifactId.leetcode.medium.vowelspellchecker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Runtime: 117 ms, faster than 5.11% of Java online submissions for Vowel Spellchecker.
 * Memory Usage: 115.1 MB, less than 5.19% of Java online submissions for Vowel Spellchecker.
 */
public class Solution {

  public String[] spellchecker(String[] wordlist, String[] queries) {

    Set<String> exact = new HashSet<>(wordlist.length);
    Map<String, String> captial = new HashMap<>(wordlist.length);
    Map<String, String> vowel = new HashMap<>(wordlist.length);

    for (String word : wordlist) {
      exact.add(word);
      captial.putIfAbsent(word.toLowerCase(), word);
      vowel.putIfAbsent(hash(word), word);
    }

    String[] ans  = new String[queries.length];
    for (int i = 0; i < ans.length; i++) {
      String word = queries[i];

      if (exact.contains(word)) {
        ans[i] = word;
        continue;
      }

      String wordLowerCase = word.toLowerCase();
      if (captial.containsKey(wordLowerCase)) {
        ans[i] = captial.get(wordLowerCase);
        continue;
      }

      String hash = hash(word);
      if (vowel.containsKey(hash)) {
        ans[i] = vowel.get(hash);
        continue;
      }
      ans[i] = "";
    }

    return ans;
  }

  private String hash(String word) {
    return word.toLowerCase().replaceAll("[aeiou]", "*");
  }

}
