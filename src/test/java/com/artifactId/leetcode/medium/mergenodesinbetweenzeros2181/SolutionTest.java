package com.artifactId.leetcode.medium.mergenodesinbetweenzeros2181;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet1() {
        Solution solution = new Solution();
        assertThat(solution.mergeNodes(TestUtils.toListNode("[0,3,1,0,4,5,2,0]")))
                .isEqualTo(TestUtils.toListNode("[4,11]"));
    }
}