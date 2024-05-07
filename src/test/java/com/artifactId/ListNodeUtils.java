package com.artifactId;

import com.artifactId.leetcode.other.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListNodeUtils {

    /**
     *
     * @param string
     * @return [1,8,9] -> listNode(1) -> listNode(8) -> listNode(9)
     */
    public static ListNode toListNode(String string) {
        String substring = TestUtils.removeOuterSymbols(string);
        List<ListNode> listNodes = Arrays.stream(substring.split(","))
                .map(x -> new ListNode(Integer.parseInt(x)))
                .toList();

        IntStream.range(0, listNodes.size() - 1).forEach(index -> listNodes.get(index).next = listNodes.get(index + 1));
        return listNodes.get(0);
    }

}
