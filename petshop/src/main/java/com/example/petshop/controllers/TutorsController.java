package com.example.petshop.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutors")
public class TutorsController {
    @PostMapping
    public String registerTutor() {
        return "Register Tutor";
    }

    @GetMapping
    public String getTutors() {
        return "Read Tutors";
    }

    @PutMapping
    public String updateTutor() {
        return "Update Tutor";
    }

    @DeleteMapping
    public String deleteTutor() {
        return "Delete Tutor";
    }
}
