package com.example.model.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.model.LearningGoal;
import com.example.model.Repository.LearningGoalRepository;

@RestController
@RequestMapping("/learning-goals")
public class LearningGoalController {

    @Autowired
    private LearningGoalRepository learningGoalRepository;

    @GetMapping
    public List<LearningGoal> getAllLearningGoals() {
        return learningGoalRepository.findAll();
    }

    @PostMapping
    public LearningGoal createLearningGoal(@RequestBody LearningGoal learningGoal) {
        return learningGoalRepository.save(learningGoal);
    }

    @GetMapping("/{id}")
    public LearningGoal getLearningGoalById(@PathVariable Long id) {
        return learningGoalRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public LearningGoal updateLearningGoal(@PathVariable Long id, @RequestBody LearningGoal updatedGoal) {
        if (learningGoalRepository.existsById(id)) {
            updatedGoal.setId(id);
            return learningGoalRepository.save(updatedGoal);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLearningGoal(@PathVariable Long id) {
        learningGoalRepository.deleteById(id);
    }
}
