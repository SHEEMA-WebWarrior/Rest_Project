package com.example.model.entity;

import jakarta.persistence.*;

@Entity
public class LearningGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String goalDescription;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public LearningGoal() {
    }

    public LearningGoal(String goalDescription, User user) {
        this.goalDescription = goalDescription;
        this.user = user;
    }

    // Getters and Setters
}
