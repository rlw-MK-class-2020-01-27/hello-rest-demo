package com.galvanize.entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person = null;

    @BeforeEach
    void setUp() {
        Calendar ci = Calendar.getInstance();
        ci.add(Calendar.YEAR, -10);
        Date dob = ci.getTime();

        person = new Person("Rob", dob, "rob.wing@galvanize.com");
    }

    @Test
    public void createPerson() {
        assertNotNull(person);
    }

    @Test
    void getAge() {
        assertEquals(person.getAge(), 10);
    }

    @Test
    void getName() {
        assertEquals(person.getName(), "Rob");
    }

    @Test
    void getEmail() {
        assertEquals(person.getEmail(), "rob.wing@galvanize.com");
    }
}