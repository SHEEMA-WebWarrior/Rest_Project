package com.example.model.Service;

import com.example.model.Repository.CourseRepository;
import com.example.model.entity.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public Page<Course> findByDifficultyLevel(String difficultyLevel, Pageable pageable) {
        return courseRepository.findByDifficultyLevel(difficultyLevel, pageable);
    }
}
