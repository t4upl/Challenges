package com.artifactId.leetcode.medium.binarysearchtreeiterator;

import com.artifactId.leetcode.TestUtils;
import com.artifactId.leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTIteratorTest {

  private BSTIterator solution;

  @Test
  public void leet1() {
    String string = "[7, 3, 15, null, null, 9, 20]";
    TreeNode treeNode = TestUtils.parseTreeNode(string);
    solution = new BSTIterator(treeNode);
    List<Integer> result = getResult(solution);
    List<Integer> expected = Arrays.asList(3, 7, 9, 15, 20);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test1() {
    String string = "[8, 4, 9, 2, 5, null, null, 1, 3, 6, 7]";
    TreeNode treeNode = TestUtils.parseTreeNode(string);
    solution = new BSTIterator(treeNode);
    List<Integer> result = getResult(solution);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6, 5, 7, 8, 9);
    Assert.assertEquals(expected, result);
  }

  private List<Integer> getResult(BSTIterator solution) {
    ArrayList<Integer> objects = new ArrayList<>();
    while (solution.hasNext()) {
      objects.add(solution.next());
    }
    return objects;
  }


}