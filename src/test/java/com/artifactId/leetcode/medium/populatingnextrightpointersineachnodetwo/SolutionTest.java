package com.artifactId.leetcode.medium.populatingnextrightpointersineachnodetwo;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void leet1() {
    Node nodeFour = new Node(4);
    Node nodeFive = new Node(5);
    Node nodeTwo = new Node(2, nodeFour, nodeFive, null);

    Node nodeSeven = new Node(7);
    Node nodeThree = new Node(3, null, nodeSeven, null);

    Node nodeOne = new Node(1, nodeTwo, nodeThree, null);

    solution.connect(nodeOne);

    Assert.assertEquals(nodeTwo.next, nodeThree);
    Assert.assertEquals(nodeFour.next, nodeFive);
    Assert.assertEquals(nodeFive.next, nodeSeven);
  }

  @Test
  public void leet2() {
    solution.connect(null);
  }


}