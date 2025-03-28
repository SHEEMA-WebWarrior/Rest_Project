package com.example.model.Service;

import com.example.model.Repository.EnrollmentRepository;
import com.example.model.entity.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> findEnrollmentsByUserId(Long userId) {
        return enrollmentRepository.findByUserId(userId);
    }

    public List<Enrollment> findEnrollmentsByCourseId(Long courseId) {
        return enrollmentRepository.findByCourseId(courseId);
    }
}
