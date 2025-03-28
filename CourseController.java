package com.example.model.controller;

import com.example.model.Service.CourseService;
import com.example.model.entity.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping("/difficulty")
    public Page<Course> findByDifficultyLevel(@RequestParam String level, Pageable pageable) {
        return courseService.findByDifficultyLevel(level, pageable);
    }
}
