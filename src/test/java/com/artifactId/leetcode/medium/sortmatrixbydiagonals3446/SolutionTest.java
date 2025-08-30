package com.artifactId.leetcode.medium.sortmatrixbydiagonals3446;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test1() {
        assertThat(new Solution().sortMatrix(TestUtils.toMatrix("[[1,7,3],[9,8,2],[4,5,6]]")))
                .isEqualTo(TestUtils.toMatrix("[[8,2,3],[9,6,7],[4,5,1]]"));
    }
}