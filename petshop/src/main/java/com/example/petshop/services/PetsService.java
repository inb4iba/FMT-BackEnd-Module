package com.example.petshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop.models.Pet;
import com.example.petshop.repositories.PetsRepository;

@Service
public class PetsService {
    @Autowired
    private PetsRepository repository;

    public Pet registerPet(Pet pet) {
        return repository.registerPet(pet);
    }

    public List<Pet> getPets() {
        return repository.getPets();
    }

    public Pet updatePet(int id, Pet pet) {
        return repository.updatePet(id, pet);
    }

    public Boolean deletePet(int id) {
        return repository.deletePet(id);
    }
}
