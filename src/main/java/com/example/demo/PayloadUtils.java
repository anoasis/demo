package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayloadUtils {

    static public List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person();
        p1.setFirstName("f1");
        p1.setLastName("l1");
        p1.setDob(new Date());
        p1.setEmail("email");
        Person p2 = new Person();
        p2.setFirstName("f2");
        p2.setLastName("l1");
        p2.setDob(new Date());
        p2.setEmail("email");
        Person p3 = new Person();
        p3.setFirstName("f3");
        p3.setLastName("l1");
        p3.setDob(new Date());
        p3.setEmail("email");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        return people;
    }
}
