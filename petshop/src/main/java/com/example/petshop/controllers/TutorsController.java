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

import com.example.petshop.models.Tutor;

@RestController
@RequestMapping("/tutors")
public class TutorsController {
    private ArrayList<Tutor> tutors = new ArrayList<>();
    private Integer count = 0;

    @PostMapping
    public Tutor registerTutor(@RequestBody Tutor tutor) {
        count++;
        tutor.setId(count);
        tutors.add(tutor);
        return tutor;
    }

    @GetMapping
    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    @PutMapping("/{id}")
    public Tutor updateTutor(@PathVariable("id") Integer id, @RequestBody Tutor tutor) {
        boolean tutorFound = false;
        for (Tutor t : this.tutors) {
            if (t.getId() == id) {
                tutorFound = true;
                break;
            }
        }
        tutor.setId(id);
        List<Tutor> tutors = this.tutors.stream().map(t -> {
            if (t.getId() == id) {
                t = tutor;
            }
            return t;
        }).toList();
        this.tutors = new ArrayList<>(tutors);
        return tutorFound ? tutor : null;
    }

    @DeleteMapping("/{id}")
    public Boolean deleteTutor(@PathVariable("id") Integer id) {
        boolean itemFound = false;
        int index = -1;
        for (Tutor t : tutors) {
            if (t.getId() == id) {
                itemFound = true;
                index = tutors.indexOf(t);
                break;
            }
        }
        if (itemFound)
            tutors.remove(index);
        return itemFound;
    }
}
