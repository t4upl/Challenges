package com.artifactId.leetcode.medium.peekingiterator;

import java.util.Iterator;

/**
 * Runtime: 4 ms, faster than 94.26% of Java online submissions for Peeking Iterator.
 * Memory Usage: 38.8 MB, less than 91.21% of Java online submissions for Peeking Iterator.
 */
public class PeekingIterator implements Iterator<Integer> {

  private final Iterator<Integer> iterator;
  private Integer next;

  public PeekingIterator(Iterator<Integer> iterator) {
    this.iterator = iterator;
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    if (next != null) {
      return next;
    }

    if (iterator.hasNext()) {
      next = iterator.next();
      return next;
    }

    return null;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    if (next != null) {
      Integer next = this.next;
      this.next = null;
      return next;

    }

    return iterator.next();
  }

  @Override
  public boolean hasNext() {
    if (next != null) {
      return true;
    }

    return iterator.hasNext();
  }

}
