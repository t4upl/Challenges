package com.artifactId.leetcode.easy.sortthepeople2418;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        assertThat(new Solution().sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170}))
                .containsSequence("Mary","Emma","John");
    }
}