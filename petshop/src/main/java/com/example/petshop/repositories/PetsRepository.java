package com.example.petshop.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.petshop.models.Pet;

@Repository
public class PetsRepository {
    private ArrayList<Pet> pets = new ArrayList<>();
    private Integer count = 0;

    public Pet registerPet(Pet pet) {
        count++;
        pet.setId(count);
        pets.add(pet);
        return pet;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public Pet updatePet(int id, Pet updatedPet) {
        boolean petFound = false;
        for (Pet p : this.pets) {
            if (p.getId() == id) {
                petFound = true;
                break;
            }
        }
        updatedPet.setId(id);
        List<Pet> pets = this.pets.stream().map(p -> {
            if (p.getId() == id) {
                p = updatedPet;
            }
            return p;
        }).toList();
        this.pets = new ArrayList<>(pets);
        return petFound ? updatedPet : null;
    }

    public Boolean deletePet(int id) {
        boolean itemFound = false;
        int index = -1;
        for (Pet p : pets) {
            if (p.getId() == id) {
                itemFound = true;
                index = pets.indexOf(p);
                break;
            }
        }
        if (itemFound)
            pets.remove(index);
        return itemFound;
    }
}
