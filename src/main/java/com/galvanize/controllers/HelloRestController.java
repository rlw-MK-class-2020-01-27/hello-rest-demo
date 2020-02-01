package com.galvanize.controllers;

import com.galvanize.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public Person helloRegistration(@RequestParam String name,
                                    @RequestParam Date birthDate,
                                    @RequestParam String email){
        Person person = new Person(name, birthDate, email);
        return person;
    }

    @PostMapping("/hello")
    public Person postRegistration(@RequestBody Person person){
        return person;
    }
}
