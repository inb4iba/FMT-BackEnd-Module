package com.example.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop.models.Pet;
import com.example.petshop.services.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    private PetsService service;

    @PostMapping
    public Pet registerPet(@RequestBody Pet pet) {
        return service.registerPet(pet);
    }

    @GetMapping
    public List<Pet> getPets() {
        return service.getPets();
    }

    @PutMapping("/{id}")
    public Pet updatePet(@RequestBody Pet pet, @PathVariable("id") int id) {
        return service.updatePet(id, pet);
    }

    @DeleteMapping("/{id}")
    public Boolean deletePet(@PathVariable("id") int id) {
        return service.deletePet(id);
    }
}
