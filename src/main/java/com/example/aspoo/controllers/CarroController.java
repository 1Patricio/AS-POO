package com.example.aspoo.controllers;

import com.example.aspoo.models.Carro;
import com.example.aspoo.services.CarroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {

    final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @PostMapping
    Carro criarCarro(@RequestBody Carro carro){
        return carroService.criarCarro(carro);
    }
}
