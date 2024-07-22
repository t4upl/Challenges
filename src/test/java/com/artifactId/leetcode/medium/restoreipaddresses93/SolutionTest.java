package com.artifactId.leetcode.medium.restoreipaddresses93;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void leet1() {
        assertThat(new Solution().restoreIpAddresses("25525511135")).containsOnly("255.255.11.135","255.255.111.35");
    }

    @Test
    void leet3() {
        assertThat(new Solution().restoreIpAddresses("101023")).containsOnly("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3");
    }

}