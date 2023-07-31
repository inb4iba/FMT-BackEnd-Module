package com.example.semana09.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana09.repositories.PersonsRepository;

@Service
public class PersonsService {
    @Autowired
    private PersonsRepository repository;
}
