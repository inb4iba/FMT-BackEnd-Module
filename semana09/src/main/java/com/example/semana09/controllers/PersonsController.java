package com.example.semana09.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semana09.entities.Person;
import com.example.semana09.services.PersonsService;

@RestController
@RequestMapping("/persons")
public class PersonsController {
    @Autowired
    private PersonsService service;

    @PostMapping
    public Person registerPerson(@RequestBody Person person) {
        return service.registerPerson(person);
    }
}
