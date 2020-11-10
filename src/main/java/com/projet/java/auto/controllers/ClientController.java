package com.projet.java.auto.controllers;

import com.projet.java.auto.entities.Client;
import com.projet.java.auto.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{clientId}")
    public Optional<Client> getClient(@PathVariable("ClientId") int clientId) {
        return clientRepository.findById(clientId);
    }
}
