package com.artifactId.cheatsheet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheatSheetTest {

    @Test
    void sortPeopleTest() {
        List<Person> people = new CheatSheet().sortPeople();
        System.out.println("stop");
    }
}