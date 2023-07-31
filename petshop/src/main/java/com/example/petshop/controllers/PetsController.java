package com.example.petshop.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @PostMapping
    public String registerPet() {
        return "Register Pet";
    }

    @GetMapping
    public String getPets() {
        return "Read Pets";
    }

    @PutMapping
    public String updatePet() {
        return "Update Pet";
    }

    @DeleteMapping
    public String deletePet() {
        return "Delete Pet";
    }
}
