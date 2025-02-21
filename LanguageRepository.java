package com.example.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {

}
