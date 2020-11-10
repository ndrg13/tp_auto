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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoiture() {
        return voiture;
    }

    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

