package com.sokyrko;

import java.util.ArrayList;
import java.util.List;

public class MaternityHouse {

    public List<Person> createPeople(){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alex", 32));
        people.add(new Person("Mary", 20));
        people.add(new Person("John", 15));
        people.add(new Person("Clara", 66));
        people.add(new Person("Bob", 23));
        people.add(new Person("Sonya", 55));

        return people;
    };
}
