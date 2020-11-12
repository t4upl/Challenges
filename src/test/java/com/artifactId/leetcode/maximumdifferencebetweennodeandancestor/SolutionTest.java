package com.artifactId.leetcode.maximumdifferencebetweennodeandancestor;

import static org.junit.Assert.*;

import com.artifactId.leetcode.maximumdifferencebetweennodeandancestor.Solution.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    String treeString = "[8,3,10,1,6,null,14,null,null,4,7,13]";
    TreeNode treeNode = parse(treeString);
    int expected = 7;
    int result = solution.maxAncestorDiff(treeNode);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void leet2() {
    String treeString = "[1,null,2,null,0,3]";
    TreeNode treeNode = parse(treeString);
    int expected = 3;
    int result = solution.maxAncestorDiff(treeNode);
    Assert.assertEquals(expected, result);
  }

  private TreeNode parse(String treeString) {
    String substring = treeString.substring(1, treeString.length() - 1);
    String[] split = substring.split(",");
    List<TreeNode> treeNodes = new ArrayList<>();
    for (String s : split) {
      if (!s.equals("null")) {
        treeNodes.add(new TreeNode(Integer.parseInt(s)));
      } else {
        treeNodes.add(null);
      }
    }

    int childPointer = 1;
    for (int i = 0; i < treeNodes.size(); i++) {
      TreeNode treeNode = treeNodes.get(i);
      if (treeNode != null) {
        if (childPointer < treeNodes.size()) {
          treeNode.left = treeNodes.get(childPointer);
          childPointer++;
        }
        if (childPointer < treeNodes.size()) {
          treeNode.right = treeNodes.get(childPointer);
          childPointer++;
        }
      }
    }

    return treeNodes.get(0);
  }


}