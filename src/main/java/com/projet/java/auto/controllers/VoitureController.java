package com.projet.java.auto.controllers;

import com.projet.java.auto.entities.Voiture;
import com.projet.java.auto.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/voiture")
public class VoitureController {
    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping
    public Iterable<Voiture> getVoitures() {
        return voitureRepository.findAll();
    }

    @GetMapping("/{voitureId}")
    public Optional<Voiture> getVoiture(@PathVariable("voitureId") int voitureId) {
        return voitureRepository.findById(voitureId);
    }
}
