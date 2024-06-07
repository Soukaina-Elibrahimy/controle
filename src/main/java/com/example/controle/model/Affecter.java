package com.example.controle.model;

import jakarta.persistence.*;

@Entity
@Table(name = "affectation_projet")
public class Affecter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double implication;

}
