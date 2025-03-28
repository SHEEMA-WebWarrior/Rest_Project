package com.example.model.controller;

import com.example.model.Service.LanguageService;
import com.example.model.entity.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping
    public Language saveLanguage(@RequestBody Language language) {
        return languageService.saveLanguage(language);
    }

    @GetMapping("/{name}")
    public Optional<Language> getLanguageByName(@PathVariable String name) {
        return languageService.getLanguageByName(name);
    }
}
