package com.example.semana09.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana09.entities.Person;
import com.example.semana09.repositories.PersonsRepository;

@Service
public class PersonsService {
    @Autowired
    private PersonsRepository repository;

    public Person registerPerson(Person person) {
        return repository.save(person);
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public Person getPersonById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Person> getPersonsActive() {
        return repository.findAllByStatusTrue();
    }
}
