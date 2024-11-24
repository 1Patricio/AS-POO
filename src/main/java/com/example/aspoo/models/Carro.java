package com.example.aspoo.models;

import com.example.aspoo.dtos.request.CarroRequest;
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
    private String renavam;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String cor;
    private boolean clean = false;

    public static Carro  ConverteParaCarro(CarroRequest carroRequest) {
        Carro carro = new Carro();
        carro.setRenavam(carroRequest.getRenavam());
        carro.setMarca(carroRequest.getMarca());
        carro.setModelo(carroRequest.getModelo());
        carro.setAno(carroRequest.getAno());
        carro.setPlaca(carroRequest.getPlaca());
        carro.setCor(carroRequest.getCor());
        carro.setClean(false);

        return carro;
    }
}
