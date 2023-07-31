package com.example.semana09.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.semana09.entities.Person;

public interface PersonsRepository extends JpaRepository<Person, Long> {

    public List<Person> findAllByStatusTrue();
}
