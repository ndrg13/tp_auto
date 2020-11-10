package com.projet.java.auto.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_concession")
public class Concession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String concession;
    @Column(name = "adresses")
    @OneToMany(mappedBy = "concession")
    private Set<Adresse> adresseSet = new HashSet<>();
    @Column(name = "marques")
    @ManyToMany
    private Set<Marque> marqueSet = new HashSet<>();

    public Concession() {
    }

}
