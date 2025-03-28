package com.example.model.Service;

import com.example.model.Repository.LanguageRepository;
import com.example.model.entity.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    public Optional<Language> getLanguageByName(String name) {
        return languageRepository.findByName(name);
    }
}
