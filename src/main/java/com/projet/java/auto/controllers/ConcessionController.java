package com.projet.java.auto.controllers;

import com.projet.java.auto.entities.Concession;
import com.projet.java.auto.repositories.ConcessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/concession")
public class ConcessionController {
    @Autowired
    private ConcessionRepository concessionRepository;

    @GetMapping
    public Iterable<Concession> getConcessions() {
        return concessionRepository.findAll();
    }

    @GetMapping("/{concessionId}")
    public Optional<Concession> getConcession(@PathVariable("concessionId") int concessionId) {
        return concessionRepository.findById(concessionId);
    }
}
