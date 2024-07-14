package com.artifactId.leetcode.medium.reversesubstringsbetweeneachpairofparentheses1190;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().reverseParentheses("(abcd)")).isEqualTo("dcba");
    }

    @Test
    void leet2() {
        assertThat(new Solution().reverseParentheses("(u(love)i)")).isEqualTo("iloveu");
    }


    @Test
    void leet3() {
        assertThat(new Solution().reverseParentheses("(ed(et(oc))el)")).isEqualTo("leetcode");
    }
}