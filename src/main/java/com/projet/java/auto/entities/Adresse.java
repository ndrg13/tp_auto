package com.projet.java.auto.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "tbl_adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String adresse;
    @ManyToOne
    @JoinColumn(name = "concession_id")
    private Concession concession;

    public Adresse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Concession getConcession() {
        return concession;
    }

    public void setConcession(Concession concession) {
        this.concession = concession;
    }
}
