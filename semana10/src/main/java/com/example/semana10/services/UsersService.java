package com.example.semana10.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.semana10.entities.UserEntity;
import com.example.semana10.repositories.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repository;

    public UserEntity registerUser(UserEntity user) {
        return repository.save(user);
    }
}
