package com.example.semana10.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semana10.entities.PetEntity;
import com.example.semana10.entities.UserEntity;
import com.example.semana10.services.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    private PetsService service;

    @PostMapping
    public PetEntity registerPet(@RequestBody PetEntity pet) {
        return service.registerPet(pet);
    }

    @GetMapping
    public List<PetEntity> getAllPets() {
        return service.getAllPets();
    }

    @PutMapping("/{id}")
    public PetEntity adoptPet(@PathVariable Long id, @RequestBody UserEntity user) {
        return service.adoptPet(id, user);
    }
}
