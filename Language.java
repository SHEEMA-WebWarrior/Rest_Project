package com.example.model.entity;

import jakarta.persistence.*;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    public Language() {
    }

    public Language(String name) {
        this.name = name;
    }

    // Getters and Setters
}
