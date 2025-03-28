package com.example.model.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String preferredLanguage;
    private String profilePicture;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enrollment> enrolledCourses = new ArrayList<>();

    public User() {
    }

    public User(String name, String email, String password, String preferredLanguage, String profilePicture) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.preferredLanguage = preferredLanguage;
        this.profilePicture = profilePicture;
    }

    // Getters and Setters
}
