package com.projet.java.auto.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String client;
    @OneToMany(mappedBy = "client")
    private Set<Voiture> voitureSet = new HashSet<>();

    public Client() {
    }

}
