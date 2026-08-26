package com.artifactId.cheatsheet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheatSheetTest {

    @Test
    void sortPeopleTest() {
        List<Person> people = new CheatSheet().sortPeople();
        System.out.println("stop");
    }

    @Test
    void binarySearch() {
//        int result = new BinarySearch().binarySearch(new int[]{10}, 0, 0, 10);
//        assertThat(result).isEqualTo(0);

        int[] arr = {9, 10, 11};
        int result = new BinarySearch().binarySearch(arr, 0, arr.length - 1, 9);
        assertThat(result).isEqualTo(0);
    }
}