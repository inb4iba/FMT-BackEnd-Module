package com.example.semana10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.semana10.entities.UserEntity;

public interface UsersRepository extends JpaRepository<UserEntity, Long> {

}
