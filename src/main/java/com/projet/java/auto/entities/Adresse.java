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

}
