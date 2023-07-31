package com.example.semana09.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.semana09.entities.Person;

public interface PersonsRepository extends JpaRepository<Person, Long> {

    public List<Person> findAllByStatusTrue();

    @Query(value = "select * from persons p where lower(p.name) like %:filter% or lower(p.email) like %:filter%", nativeQuery = true)
    public List<Person> findAllByFilter(@Param("filter") String filter);
}
