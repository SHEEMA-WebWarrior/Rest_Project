package com.example.model.Service;

import com.example.model.Repository.LearningGoalRepository;
import com.example.model.entity.LearningGoal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LearningGoalService {

    @Autowired
    private LearningGoalRepository learningGoalRepository;

    public LearningGoal saveLearningGoal(LearningGoal goal) {
        return learningGoalRepository.save(goal);
    }

    public Optional<LearningGoal> getLearningGoalById(Long id) {
        return learningGoalRepository.findById(id);
    }

    public Page<LearningGoal> findLearningGoalsByUserId(Long userId, Pageable pageable) {
        return learningGoalRepository.findByUserId(userId, pageable);
    }

    public Page<LearningGoal> searchByKeyword(String keyword, Pageable pageable) {
        return learningGoalRepository.searchByKeyword(keyword, pageable);
    }
}
