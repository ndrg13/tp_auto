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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcession() {
        return concession;
    }

    public void setConcession(String concession) {
        this.concession = concession;
    }

    public Set<Adresse> getAdresseSet() {
        return adresseSet;
    }

    public void setAdresseSet(Set<Adresse> adresseSet) {
        this.adresseSet = adresseSet;
    }

    public Set<Marque> getMarqueSet() {
        return marqueSet;
    }

    public void setMarqueSet(Set<Marque> marqueSet) {
        this.marqueSet = marqueSet;
    }
}
