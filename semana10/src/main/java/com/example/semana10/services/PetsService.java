package com.example.semana10.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana10.entities.PetEntity;
import com.example.semana10.repositories.PetsRepository;

@Service
public class PetsService {
    @Autowired
    private PetsRepository repository;

    public PetEntity registerPet(PetEntity pet) {
        return repository.save(pet);
    }

    public List<PetEntity> getAllPets() {
        return repository.findAll();
    }
}
