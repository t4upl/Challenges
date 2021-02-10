package com.artifactId.leetcode.medium.copylistwithrandompointer;

import com.artifactId.leetcode.medium.copylistwithrandompointer.Solution.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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
  public void test1() {
    Node node7 = new Node(7);
    Node node13 = new Node(13);
    Node node11 = new Node(11);
    Node node10 = new Node(10);
    Node node1 = new Node(1);

    setNestAndRandom(node7, node13, null);
    setNestAndRandom(node13, node11, node7);
    setNestAndRandom(node11, node10, node1);
    setNestAndRandom(node10, node1, node11);
    setNestAndRandom(node1, null, node7);

    Node result = solution.copyRandomList(node7);

    List<Integer> expectedVals2 = getIntegers(node7, node -> node.val);
    List<Integer> resultVals2 = getIntegers(result, node -> node.val);
    Assert.assertEquals(expectedVals2, resultVals2);

    Function<Node, Integer> nodeIntegerFunction = node -> node.random == null ? null
      : node.random.val;

    List<Integer> expectedVals = getIntegers(node7, nodeIntegerFunction);
    List<Integer> resultVals = getIntegers(result, nodeIntegerFunction);
    Assert.assertEquals(expectedVals, resultVals);
  }

  private List<Integer> getIntegers(Node node, Function<Node, Integer> function) {
    List<Integer> list = new ArrayList<>();
    while (node != null) {
      list.add(function.apply(node));
      node = node.next;
    }

    return list;
  }


  private void setNestAndRandom(Node node, Node next, Node random) {
    node.next = next;
    node.random = random;
  }


}