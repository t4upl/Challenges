package com.artifactId.leetcode.medium.averagewaitingtime1701;

import com.artifactId.TestUtils;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void leet1() {
        assertThat(new Solution().averageWaitingTime(TestUtils.toMatrix("[[1,2],[2,5],[4,3]]")))
                .isCloseTo(5.0, Offset.offset(0000.1));
    }

    @Test
    void leet2() {
        assertThat(new Solution().averageWaitingTime(TestUtils.toMatrix("[[5,2],[5,4],[10,3],[20,1]]")))
                .isCloseTo(3.25, Offset.offset(0000.1));
    }

}