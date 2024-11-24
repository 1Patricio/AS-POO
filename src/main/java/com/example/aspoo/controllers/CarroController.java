package com.example.aspoo.controllers;

import com.example.aspoo.dtos.request.CarroRequest;
import com.example.aspoo.dtos.responses.CarroResponse;
import com.example.aspoo.dtos.responses.CarroResponseDetails;
import com.example.aspoo.models.Carro;
import com.example.aspoo.services.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    final CarroService carroService;
    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @GetMapping
    public List<CarroResponse> getAllCarros() {
        return carroService.findAll();
    }

    @GetMapping("/{placa}")
    public CarroResponseDetails encontrarPelaPlaca(@PathVariable String placa) {
        return carroService.encontrarPelaPlaca(placa);
    }

    @PostMapping
    Carro criarCarro(@RequestBody Carro carro){
        return carroService.criarCarro(carro);
    }

    @DeleteMapping("/{id}")
    public void deletarCarro(@PathVariable Long id){
        carroService.deleteCarro(id);
    }

    @PutMapping("/{id}")
    public void atualizarCarro(@PathVariable Long id, @RequestBody CarroRequest carro){
         carroService.atualizarCarro(id, carro);
    }

    @PutMapping("/paint/{id}")
    public void pintarCarro(@PathVariable Long id, @RequestBody CarroRequest carro){
        carroService.pintarCarro(id, carro);
    }

    @PutMapping("/wash/{id}")
    public void limparCarro(@PathVariable Long id){
        carroService.limparCarro(id);
    }
}
