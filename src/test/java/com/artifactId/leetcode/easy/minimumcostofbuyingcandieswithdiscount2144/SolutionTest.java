package com.artifactId.leetcode.easy.minimumcostofbuyingcandieswithdiscount2144;

import com.artifactId.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leet2() {
        int[] array = TestUtils.toArray("[6,5,7,9,2,2]");
        assertEquals(23, new Solution().minimumCost(array));
    }

    @Test
    void test1() {
        int[] array = TestUtils.toArray("[6,5,7]");
        assertEquals(13, new Solution().minimumCost(array));
    }

    @Test
    void test2() {
        int[] array = TestUtils.toArray("[6,7]");
        assertEquals(13, new Solution().minimumCost(array));
    }

}