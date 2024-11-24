package com.example.aspoo.dtos.responses;

import com.example.aspoo.models.Carro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroResponse {
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean clean;

    public static CarroResponse converteParaCarroResponse(Carro carro) {
        CarroResponse carroResponse = new CarroResponse();
        carroResponse.setId(carro.getId());
        carroResponse.setMarca(carro.getMarca());
        carroResponse.setModelo(carro.getModelo());
        carroResponse.setAno(carro.getAno());
        carroResponse.setCor(carro.getCor());
        carroResponse.setClean(carro.isClean());

        return carroResponse;
    }
}
