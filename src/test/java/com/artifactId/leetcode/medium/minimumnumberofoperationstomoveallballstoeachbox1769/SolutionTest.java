package com.artifactId.leetcode.medium.minimumnumberofoperationstomoveallballstoeachbox1769;

import com.artifactId.TestUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet2() {
        Assertions.assertThat(new Solution().minOperations( "001011")).isEqualTo(TestUtils.toArray("[11,8,5,4,3,4]"));
    }
}