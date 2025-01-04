package com.artifactId.leetcode.medium.uniquelength3palindromicsubsequences;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Assertions.assertThat(new Solution().countPalindromicSubsequence("aabca")).isEqualTo(3);
    }

    @Test
    void leet2() {
        Assertions.assertThat(new Solution().countPalindromicSubsequence("bbcbaba")).isEqualTo(4);
    }

    @Test
    void test1() {
        Assertions.assertThat(new Solution().countPalindromicSubsequence("a")).isEqualTo(0);
    }

    @Test
    void test2() {
        Assertions.assertThat(new Solution().countPalindromicSubsequence("aa")).isEqualTo(0);
    }

    @Test
    void test3() {
        Assertions.assertThat(new Solution().countPalindromicSubsequence("aaa")).isEqualTo(1);
    }
}