package com.example.aspoo.dtos.responses;

import com.example.aspoo.models.Carro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroResponseDetails {
    private Long id;
    private String renavam;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String cor;
    private boolean clean = false;

    public static CarroResponseDetails converteParaCarroResponse(Carro carro) {
        CarroResponseDetails carroResponseDetails = new CarroResponseDetails();
        carroResponseDetails.setId(carro.getId());
        carroResponseDetails.setRenavam(carro.getRenavam());
        carroResponseDetails.setMarca(carro.getMarca());
        carroResponseDetails.setModelo(carro.getModelo());
        carroResponseDetails.setAno(carro.getAno());
        carroResponseDetails.setPlaca(carro.getPlaca());
        carroResponseDetails.setCor(carro.getCor());
        carroResponseDetails.setClean(carro.isClean());

        return carroResponseDetails;
    }
}
