package com.artifactId.leetcode.searchinrotatedsortedarray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInRotatedSortedArrayImplTest {

  SearchInRotatedSortedArray searchInRotatedSortedArray;

  @Before
  public void setUp() throws Exception {
    searchInRotatedSortedArray = new SearchInRotatedSortedArrayImpl();
  }

  @Test
  public void test1() {
    int expectedResult = 0;
    int[] nums = {0};
    int result = searchInRotatedSortedArray.search(nums, 0);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test2() {
    int expectedResult = 0;
    int[] nums = {0, 1};
    int result = searchInRotatedSortedArray.search(nums, 0);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test3() {
    int expectedResult = 1;
    int[] nums = {0, 1};
    int result = searchInRotatedSortedArray.search(nums, 1);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test4() {
    int expectedResult = 0;
    int[] nums = {2, 0, 1};
    int result = searchInRotatedSortedArray.search(nums, 2);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test5() {
    int expectedResult = 1;
    int[] nums = {2, 0, 1};
    int result = searchInRotatedSortedArray.search(nums, 0);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test6() {
    int expectedResult = 2;
    int[] nums = {2, 0, 1};
    int result = searchInRotatedSortedArray.search(nums, 1);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void leet1() {
    int expectedResult = 1;
    int[] nums = {3, 1};
    int result = searchInRotatedSortedArray.search(nums, 1);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test7() {
    int expectedResult = 0;
    int[] nums = {3, 1};
    int result = searchInRotatedSortedArray.search(nums, 3);
    Assert.assertEquals(expectedResult, result);
  }


  @Test
  public void leet2() {
    int expectedResult = 4;
    int[] nums = {4,5,6,7,8,1,2,3};
    int result = searchInRotatedSortedArray.search(nums, 8);
    Assert.assertEquals(expectedResult, result);
  }

  @Test
  public void test8() {
    int expectedResult = 7;
    int[] nums = {4,5,6,7,8,1,2,3};
    int result = searchInRotatedSortedArray.search(nums, 3);
    Assert.assertEquals(expectedResult, result);
  }




}