package com.example.semana09.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "persons")
@Data
public class Person {
    private Long id;
    private String name;
    private String email;
    private Boolean status;
}
