package com.example.aspoo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "carros")
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;
    private String modelo;
}
