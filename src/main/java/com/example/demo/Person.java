package com.example.demo;

import java.util.Calendar;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date dob;
    //private int age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
/*
    public int getAge() {
        long diff = new Date().getTime() - getDob().getTime();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(diff);
        return c.get(Calendar.YEAR)-1970;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
