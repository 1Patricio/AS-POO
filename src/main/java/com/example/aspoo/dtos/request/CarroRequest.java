package com.example.aspoo.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroRequest {
    private String renavam;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String cor;
    private boolean clean = false;
}
