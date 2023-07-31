package com.example.petshop.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.petshop.models.Tutor;

@Repository
public class TutorsRepository {
    private ArrayList<Tutor> tutors = new ArrayList<>();
    private Integer count = 0;

    public Tutor registerTutor(Tutor tutor) {
        count++;
        tutor.setId(count);
        tutors.add(tutor);
        return tutor;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public Tutor updateTutor(int id, Tutor updatedTutor) {
        boolean tutorFound = false;
        for (Tutor t : this.tutors) {
            if (t.getId() == id) {
                tutorFound = true;
                break;
            }
        }
        updatedTutor.setId(id);
        List<Tutor> tutors = this.tutors.stream().map(t -> {
            if (t.getId() == id) {
                t = updatedTutor;
            }
            return t;
        }).toList();
        this.tutors = new ArrayList<>(tutors);
        return tutorFound ? updatedTutor : null;
    }

    public Boolean deleteTutor(int id) {
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
