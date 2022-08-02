package com.artifactId.random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JosephusTest {

  private Josephus josephus = new Josephus();

  @Test
  void test1() {
    Assertions.assertEquals(0, josephus.findJosephus(1));
    Assertions.assertEquals(0, josephus.findJosephus(2));
    Assertions.assertEquals(2, josephus.findJosephus(3));
    Assertions.assertEquals(2, josephus.findJosephus(5));
    Assertions.assertEquals(4, josephus.findJosephus(6));
  }


  @Test
  void test2() {
    Assertions.assertEquals(0, josephus.Josephus2(1));
    Assertions.assertEquals(0, josephus.Josephus2(2));
    Assertions.assertEquals(2, josephus.Josephus2(3));
    Assertions.assertEquals(2, josephus.Josephus2(5));
    Assertions.assertEquals(4, josephus.Josephus2(6));

  }



}
