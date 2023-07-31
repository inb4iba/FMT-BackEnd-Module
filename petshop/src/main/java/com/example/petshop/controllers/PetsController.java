package com.example.petshop.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop.models.Pet;

@RestController
@RequestMapping("/pets")
public class PetsController {
    private ArrayList<Pet> pets = new ArrayList<>();
    private Integer count = 0;

    @PostMapping
    public Pet registerPet(@RequestBody Pet pet) {
        count++;
        pet.setId(count);
        pets.add(pet);
        return pet;
    }

    @GetMapping
    public ArrayList<Pet> getPets() {
        return pets;
    }

    @PutMapping("/{id}")
    public Pet updatePet(@RequestBody Pet pet, @PathVariable("id") Integer id) {
        boolean petFound = false;
        for (Pet p : this.pets) {
            if (p.getId() == id) {
                petFound = true;
                break;
            }
        }
        pet.setId(id);
        List<Pet> pets = this.pets.stream().map(p -> {
            if (p.getId() == id) {
                p = pet;
            }
            return p;
        }).toList();
        this.pets = new ArrayList<>(pets);
        return petFound ? pet : null;
    }

    @DeleteMapping("/{id}")
    public Boolean deletePet(@PathVariable("id") Integer id) {
        boolean itemFound = false;
        int index = -1;
        for (Pet p : pets) {
            if (p.getId() == id) {
                itemFound = true;
                index = pets.indexOf(p);
                break;
            }
        }
        System.out.println(index);
        if (itemFound)
            pets.remove(index);
        return itemFound;
    }
}
