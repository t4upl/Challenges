package com.artifactId.leetcode.medium.maximizehappinessofselectedchildren3075;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.maximumHappinessSum(TestUtils.toArray("[1,2,3]"), 2)).isEqualTo(4);
    }

    @Test
    void leet3() {
        Solution solution = new Solution();
        assertThat(solution.maximumHappinessSum(TestUtils.toArray("[2,3,4,5]"), 1)).isEqualTo(5);
    }

}