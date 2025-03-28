package com.example.model.controller;

import com.example.model.Service.LearningGoalService;
import com.example.model.entity.LearningGoal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/learning-goals")
public class LearningGoalController {

    @Autowired
    private LearningGoalService learningGoalService;

    @PostMapping
    public LearningGoal saveLearningGoal(@RequestBody LearningGoal goal) {
        return learningGoalService.saveLearningGoal(goal);
    }

    @GetMapping("/{id}")
    public Optional<LearningGoal> getLearningGoalById(@PathVariable Long id) {
        return learningGoalService.getLearningGoalById(id);
    }

    @GetMapping("/user/{userId}")
    public Page<LearningGoal> findLearningGoalsByUserId(@PathVariable Long userId, Pageable pageable) {
        return learningGoalService.findLearningGoalsByUserId(userId, pageable);
    }

    @GetMapping("/search")
    public Page<LearningGoal> searchByKeyword(@RequestParam String keyword, Pageable pageable) {
        return learningGoalService.searchByKeyword(keyword, pageable);
    }
}
