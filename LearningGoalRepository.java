package com.example.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.LearningGoal;

public interface LearningGoalRepository extends JpaRepository<LearningGoal, Long> {

}
