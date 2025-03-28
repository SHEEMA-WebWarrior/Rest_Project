package com.example.model.Repository;

import com.example.model.entity.LearningGoal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningGoalRepository extends JpaRepository<LearningGoal, Long> {

    // Find learning goals by user ID with pagination
    Page<LearningGoal> findByUserId(Long userId, Pageable pageable);

    // JPQL query to find goals containing a specific keyword
    @Query("SELECT lg FROM LearningGoal lg WHERE LOWER(lg.goalDescription) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    Page<LearningGoal> searchByKeyword(String keyword, Pageable pageable);
}
