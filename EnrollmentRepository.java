package com.example.model.Repository;

import com.example.model.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    // Find enrollments by user ID
    List<Enrollment> findByUserId(Long userId);

    // Find enrollments by course ID
    List<Enrollment> findByCourseId(Long courseId);
}
