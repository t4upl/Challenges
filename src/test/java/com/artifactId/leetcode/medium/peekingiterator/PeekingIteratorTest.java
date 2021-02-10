package com.artifactId.leetcode.medium.peekingiterator;

import com.artifactId.TestUtils;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class PeekingIteratorTest {

  private PeekingIterator peekingIterator;

  @Test
  public void leet1() {
    String string = "[1,2,3]";
    List<Integer> integerList = TestUtils.toIntegerList(string);
    Iterator<Integer> iterator = integerList.iterator();
    PeekingIterator peekingIterator = new PeekingIterator(iterator);

    Assert.assertEquals(new Integer(1), peekingIterator.next());
    Assert.assertEquals(new Integer(2), peekingIterator.peek());
    Assert.assertEquals(new Integer(2), peekingIterator.next());
    Assert.assertEquals(new Integer(3), peekingIterator.next());
    Assert.assertEquals(false, peekingIterator.hasNext());
  }

  @Test
  public void test1() {
    String string = "[1,2,3,4]";
    List<Integer> integerList = TestUtils.toIntegerList(string);
    Iterator<Integer> iterator = integerList.iterator();
    PeekingIterator peekingIterator = new PeekingIterator(iterator);

    Assert.assertEquals(true, peekingIterator.hasNext());
    Assert.assertEquals(new Integer(1), peekingIterator.peek());
    Assert.assertEquals(new Integer(1), peekingIterator.peek());

    Assert.assertEquals(new Integer(1), peekingIterator.next());
    Assert.assertEquals(new Integer(2), peekingIterator.next());

    Assert.assertEquals(new Integer(3), peekingIterator.peek());
    Assert.assertEquals(new Integer(3), peekingIterator.peek());

    Assert.assertEquals(new Integer(3), peekingIterator.next());

    Assert.assertEquals(new Integer(4), peekingIterator.peek());
    Assert.assertEquals(new Integer(4), peekingIterator.peek());
    Assert.assertEquals(true, peekingIterator.hasNext());

    Assert.assertEquals(new Integer(4), peekingIterator.next());
    Assert.assertEquals(false, peekingIterator.hasNext());
  }


}