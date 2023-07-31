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

import com.example.petshop.models.Tutor;
import com.example.petshop.services.TutorsService;

@RestController
@RequestMapping("/tutors")
public class TutorsController {

    @Autowired
    private TutorsService service;

    @PostMapping
    public Tutor registerTutor(@RequestBody Tutor tutor) {
        return service.registerTutor(tutor);
    }

    @GetMapping
    public List<Tutor> getTutors() {
        return service.getTutors();
    }

    @PutMapping("/{id}")
    public Tutor updateTutor(@PathVariable("id") int id, @RequestBody Tutor tutor) {
        return service.updateTutor(id, tutor);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteTutor(@PathVariable("id") int id) {
        return service.deleteTutor(id);
    }
}
