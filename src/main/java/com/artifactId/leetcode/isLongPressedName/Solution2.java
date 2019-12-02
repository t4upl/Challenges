package com.artifactId.leetcode.isLongPressedName;

/**
 *  Runtime: 1 ms, faster than 55.72% of Java online submissions for Long Pressed Name.
 *  Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Long Pressed Name.
 */
public class Solution2 implements SolutionInterface {

  @Override
  public boolean isLongPressedName(String name, String typed) {
    if (name.length() > typed.length()) {
      return false;
    }

    char[] nameArr = name.toCharArray();
    char[] typedArr = typed.toCharArray();
    int i = 0;
    int j = 0;
    Block nameBlock = new Block('a', 0);
    Block typeBlock = new Block('a', 0);
    while (i < name.length() && j < typed.length()) {
      getBlock(nameArr, i, nameBlock);
      getBlock(typedArr, j, typeBlock);
      if (!(nameBlock.getC() == typeBlock.getC() && nameBlock.getCount() <= typeBlock.getCount())) {
        return false;
      }

      i+= nameBlock.getCount();
      j+= typeBlock.getCount();
    }

    if (i == nameArr.length && j == typedArr.length) {
      return true;
    }

    return false;
  }

  void getBlock(char[] chars, int index,
    Block block) {
    char c = chars[index];
    int count = 1;
    index++;
    while ( index < chars.length && chars[index] == c) {
      count++;
      index++;
    }

    block.setCount(count);
    block.setC(c);
  }

  class Block {
    private char c;
    private int count;
    public Block(char c, int count) {
      this.c = c;
      this.count = count;
    }

    public char getC() {
      return c;
    }

    public int getCount() {
      return count;
    }

    public void setC(char c) {
      this.c = c;
    }

    public void setCount(int count) {
      this.count = count;
    }
  }
}
