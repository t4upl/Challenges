package com.artifactId.leetcode.medium.shortestandlexicographicallysmallestbeautifulstring2904;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().shortestBeautifulSubstring("100011001", 3)).isEqualTo("11001");
    }

    @Test
    void leet2() {
        assertThat(new Solution().shortestBeautifulSubstring("1011", 2)).isEqualTo("11");
    }

    @Test
    void leet3() {
        assertThat(new Solution().shortestBeautifulSubstring("000", 1)).isEqualTo("");

    }
}