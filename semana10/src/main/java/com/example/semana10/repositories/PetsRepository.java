package com.example.semana10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.semana10.entities.PetEntity;

public interface PetsRepository extends JpaRepository<PetEntity, Long> {

}
