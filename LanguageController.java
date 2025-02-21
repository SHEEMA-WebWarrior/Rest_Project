package com.example.model.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.model.Language;
import com.example.model.Repository.LanguageRepository;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping
    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    @PostMapping
    public Language createLanguage(@RequestBody Language language) {
        return languageRepository.save(language);
    }

    @GetMapping("/{id}")
    public Language getLanguageById(@PathVariable Long id) {
        return languageRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Language updateLanguage(@PathVariable Long id, @RequestBody Language updatedLanguage) {
        if (languageRepository.existsById(id)) {
            updatedLanguage.setId(id);
            return languageRepository.save(updatedLanguage);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLanguage(@PathVariable Long id) {
        languageRepository.deleteById(id);
    }
}
