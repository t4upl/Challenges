package com;

import com.journaldev.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void test() {
        Person person = new Person();
        Assertions.assertTrue(person.isBiggerthan10(11));
    }

    @Test
    void test2() {
        Person person = new Person();
        Assertions.assertFalse(person.isBiggerthan10(10));
        Assertions.assertFalse(person.isBiggerthan10(9));
    }
}
