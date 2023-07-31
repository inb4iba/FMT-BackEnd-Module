package com.example.semana09.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping
    public List<Person> getAllPersons(@RequestParam(required = false, name = "filter") String filter) {
        if (filter != null)
            return service.getPersonsByFilter(filter.toLowerCase());
        return service.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @GetMapping("/active")
    public List<Person> getPersonsActive() {
        return service.getPersonsActive();
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedData) {
        return service.updatePerson(id, updatedData);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        service.deletePerson(id);
    }
}
