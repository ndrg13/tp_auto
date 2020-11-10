package com.projet.java.auto.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "tbl_voiture")
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String voiture;
    @ManyToOne
    @JoinColumn(name = "marque_id")
    private Marque marque;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Voiture() {
    }

}

