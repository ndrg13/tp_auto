package com.projet.java.auto.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_marque")
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String marque;
    @Column(name = "voitures")
    @OneToMany(mappedBy = "marque")
    private Set<Voiture> voitureSet = new HashSet<>();
    @Column(name = "concessions")
    @ManyToMany
    private Set<Concession> concessionSet = new HashSet<>();

    public Marque() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Set<Voiture> getVoitureSet() {
        return voitureSet;
    }

    public void setVoitureSet(Set<Voiture> voitureSet) {
        this.voitureSet = voitureSet;
    }

    public Set<Concession> getConcessionSet() {
        return concessionSet;
    }

    public void setConcessionSet(Set<Concession> concessionSet) {
        this.concessionSet = concessionSet;
    }
}
