package com.example.model.entity;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DifficultyLevel difficultyLevel;

    @Column(nullable = false, length = 100)
    private String instructor;

    public Course() {
    }

    public Course(String name, DifficultyLevel difficultyLevel, String instructor) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.instructor = instructor;
    }

    // Getters and Setters
}
