package com.example.model.Repository;

import com.example.model.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

    // Find language by name
    Optional<Language> findByName(String name);
}
