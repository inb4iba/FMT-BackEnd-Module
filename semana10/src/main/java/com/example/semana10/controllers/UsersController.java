package com.example.semana10.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.semana10.entities.UserEntity;
import com.example.semana10.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService service;

    @PostMapping
    public UserEntity registerUser(@RequestBody UserEntity user) {
        return service.registerUser(user);
    }
}
