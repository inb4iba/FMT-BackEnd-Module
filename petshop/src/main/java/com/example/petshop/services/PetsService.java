package com.example.petshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop.models.Pet;
import com.example.petshop.models.Tutor;
import com.example.petshop.repositories.PetsRepository;
import com.example.petshop.repositories.TutorsRepository;

@Service
public class PetsService {
    @Autowired
    private PetsRepository repository;

    @Autowired
    private TutorsRepository tutorsRepository;

    public Pet registerPet(Pet pet) {
        Tutor t = getTutorById(pet.getTutor().getId());
        pet.setTutor(t);
        return repository.registerPet(pet);
    }

    public List<Pet> getPets() {
        return repository.getPets();
    }

    public Pet updatePet(int id, Pet pet) {
        Tutor t = getTutorById(pet.getTutor().getId());
        pet.setTutor(t);
        return repository.updatePet(id, pet);
    }

    public Boolean deletePet(int id) {
        return repository.deletePet(id);
    }

    private Tutor getTutorById(int id) {
        return tutorsRepository.getTutorById(id);
    }
}
