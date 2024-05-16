package com.artifactId.leetcode.medium.flipbinarytreetomatchpreordertraversal;

import com.artifactId.NodeUtils;
import com.artifactId.TestUtils;
import com.artifactId.leetcode.TreeNode;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void test1() {
    TreeNode root = NodeUtils.parseTreeNode("[1, 2, 3, 4, null, 5, 6, null, null, 7, 8]");
    int[] voyage = TestUtils.toArray("[1, 2, 4, 3, 5, 7, 8, 6 ]");
    List<Integer> expected = Arrays.asList();

    List<Integer> result = solution.flipMatchVoyage(root, voyage);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void test2() {
    TreeNode root = NodeUtils.parseTreeNode("[1, 2, 3, 4, null, 5, 6, null, null, 7, 8]");
    int[] voyage = TestUtils.toArray("[1, 2, 4, 3, 5, 8, 7, 6 ]");
    List<Integer> expected = Arrays.asList(5);

    List<Integer> result = solution.flipMatchVoyage(root, voyage);
    Assert.assertEquals(expected, result);
  }


}