package com.example.model.Repository;

import com.example.model.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    // JPQL to find courses by difficulty level with pagination
    @Query("SELECT c FROM Course c WHERE c.difficultyLevel = :difficultyLevel")
    Page<Course> findByDifficultyLevel(String difficultyLevel, Pageable pageable);

    // Custom JPA method to find courses by instructor name
    Page<Course> findByInstructor(String instructor, Pageable pageable);
}
