package com.example.petshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petshop.models.Tutor;
import com.example.petshop.repositories.TutorsRepository;

@Service
public class TutorsService {
    @Autowired
    private TutorsRepository repository;

    public Tutor registerTutor(Tutor tutor) {
        return repository.registerTutor(tutor);
    }

    public List<Tutor> getTutors() {
        return repository.getTutors();
    }

    public Tutor updateTutor(int id, Tutor tutor) {
        return repository.updateTutor(id, tutor);
    }

    public Boolean deleteTutor(int id) {
        return repository.deleteTutor(id);
    }
}
