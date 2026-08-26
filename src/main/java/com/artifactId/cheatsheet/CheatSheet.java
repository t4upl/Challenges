package com.artifactId.cheatsheet;

import java.util.Comparator;
import java.util.List;

public class CheatSheet {

    public List<Person> sortPeople() {
        Comparator<Person> personComparator = Comparator.comparing((Person x) -> x.getName(), Comparator.reverseOrder())
                .thenComparing((Person x) -> x.getSurname(), Comparator.reverseOrder());
        return List.of(
                new Person("Aname", "ASurname"),
                new Person("Aname", "BSurname"),
                new Person("Aname", "CSurname"),
                new Person("Bname", "ASurname"),
                new Person("Bname", "BSurname"),
                new Person("Bname", "CSurname"),
                new Person("Cname", "ASurname"),
                new Person("Cname", "BSurname"),
                new Person("Cname", "CSurname")
        ).stream().sorted(personComparator).toList();
    }

}
