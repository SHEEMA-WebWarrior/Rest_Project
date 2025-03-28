package com.example.model.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private double progressPercentage;
    private Date enrollmentDate;

    public Enrollment() {
    }

    public Enrollment(User user, Course course, double progressPercentage, Date enrollmentDate) {
        this.user = user;
        this.course = course;
        this.progressPercentage = progressPercentage;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters and Setters
}
