package com.example.aspoo.services;

import com.example.aspoo.models.Carro;
import com.example.aspoo.repositories.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> findAll(){
        return carroRepository.findAll();
    }

    public Carro criarCarro(Carro carro){
        return carroRepository.save(carro);
    }
}
