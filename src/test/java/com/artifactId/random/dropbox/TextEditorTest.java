package com.artifactId.random.dropbox;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TextEditorTest {

  private TextEditor solution;

  @Before
  public void setUp() throws Exception {
    solution = new TextEditor();
  }

  @Test
  public void test1() {
    String[][] str = {
      {"APPEND", "Hey"},
      {"APPEND", " there"},
      {"APPEND", "!"}
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{"Hey", "Hey there", "Hey there!"};

    Assert.assertEquals(expected, solution);
  }

  @Test
  public void test2() {
    String[][] str = {
      {"APPEND", "Hey you"},
      {"MOVE", "3"},
      {"APPEND", ","},
      {"MOVE", "0"},
      {"APPEND", "A"},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{"Hey you", "Hey you", "Hey, you", "Hey, you", "AHey, you"};

    Assert.assertEquals(expected, solution);
  }

  @Test
  public void test3() {
    String[][] str = {
      {"APPEND", "Hey you"},
      {"MOVE", "8"},
      {"APPEND", ","},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{"Hey you", "Hey you", "Hey you,"};

    Assert.assertEquals(expected, solution);
  }

  @Test
  public void test4() {
    String[][] str = {
      {"APPEND", "Hey you"},
      {"BACKSPACE"},
      {"MOVE", "0"},
      {"BACKSPACE"},
      {"MOVE", "2"},
      {"BACKSPACE"},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{"Hey you", "Hey yo", "Hey yo", "Hey yo", "Hey yo", "Hy yo"};

    Assert.assertEquals(expected, solution);
  }

  // LEVEL 2
  @Test
  public void test5() {
    String[][] str = {
      {"APPEND", "Hello cruel world!"},
      {"SELECT", "5", "11"},
      {"APPEND", ","},
      {"SELECT", "5", "12"},
      {"BACKSPACE"},
      {"SELECT", "4", "6"},
      {"MOVE", "1"},
      {"APPEND", ","},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{"Hello cruel world!", "Hello cruel world!", "Hello, world!", "Hello, world!", "Hello!", "Hello!", "Hello!", "H,ello!"};

    Assert.assertEquals(expected, solution);
  }


  @Test
  public void test6() {
    String[][] str = {
      {"APPEND", "Hello, world!"},
      {"SELECT", "5", "12"},
      {"COPY"},
      {"MOVE", "12"},
      {"PASTE"},
      {"PASTE"},
      {"SELECT", "5", "19"},
      {"PASTE"}
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{
      "Hello, world!",
            "Hello, world!",
            "Hello, world!",
            "Hello, world!",
            "Hello, world, world!",
            "Hello, world, world, world!",
            "Hello, world, world, world!" ,
            "Hello, world, world!",
    };

    Assert.assertEquals(expected, solution);
  }


  // LEVEL 3
  @Test
  public void test7() {
    String[][] str = {
      {"APPEND", "Hello, world!"},
      {"SELECT", "7", "12"},
      {"BACKSPACE"},
      {"UNDO"},
      {"APPEND", "you"},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{
      "Hello, world!",
      "Hello, world!",
      "Hello, !",
      "Hello, world!",
      "Hello, you!"
    };

    Assert.assertEquals(expected, solution);
  }

  @Test
  public void test8() {
    String[][] str = {
      {"APPEND", "Hello, world!"},
      {"SELECT", "7", "12"},
      {"BACKSPACE"},
      {"MOVE", "6"},
      {"UNDO"},
      {"UNDO"},
      {"REDO"},
      {"REDO"},
    };

    String[] solution = this.solution.solution(str);
    String[] expected = new String[]{
      "Hello, world!",
      "Hello, world!",
      "Hello, !",
      "Hello, !",
      "Hello, world!",
      "",
      "Hello, world!",
      "Hello, !"
    };

    Assert.assertEquals(expected, solution);
  }



}