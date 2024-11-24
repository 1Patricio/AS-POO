package com.example.aspoo.services;

import com.example.aspoo.dtos.request.CarroRequest;
import com.example.aspoo.dtos.responses.CarroResponse;
import com.example.aspoo.dtos.responses.CarroResponseDetails;
import com.example.aspoo.models.Carro;
import com.example.aspoo.repositories.CarroRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    final CarroRepository carroRepository;
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    //Get all cars
    public List<CarroResponse> findAll(){
        List <CarroResponse> carros = carroRepository.findAll()
                .stream()
                .map(item -> CarroResponse.converteParaCarroResponse(item))
                .toList();
        return carros;
    }

    //Describe everything about any car
    public CarroResponseDetails encontrarPelaPlaca(String placa) {
        // Tente encontrar o carro pelo repositório
        Carro carro = carroRepository.findByPlaca(placa)
                .orElseThrow(() -> new EntityNotFoundException("Carro com placa " + placa + " não encontrado"));

        return CarroResponseDetails.converteParaCarroResponse(carro);
    }

    //Create car
    public Carro criarCarro(Carro carro){
        return carroRepository.save(carro);
    }

    //Delete car
    public void deleteCarro(Long id){
        carroRepository.deleteById(id);
    }

    //Update car
    public Carro atualizarCarro(Long id, CarroRequest carroAtualizado){
        Carro carroAtual = carroRepository.findById(id).get();

        carroAtual.setRenavam(carroAtualizado.getRenavam());
        carroAtual.setMarca( carroAtualizado.getMarca());
        carroAtual.setModelo(carroAtualizado.getModelo());
        carroAtual.setAno(carroAtualizado.getAno());
        carroAtual.setPlaca( carroAtualizado.getPlaca());
        carroAtual.setCor(carroAtualizado.getCor());

        return carroRepository.save(carroAtual);

    }

    //Paint car
    public Carro pintarCarro(Long id, CarroRequest carroAtualizado){
        Carro carroAtual = carroRepository.findById(id).get();
        carroAtual.setCor(carroAtualizado.getCor());

        return carroRepository.save(carroAtual);

    }

    //Clean car
    public Carro limparCarro(Long id){
        Carro carroAtual = carroRepository.findById(id).get();

        carroAtual.setClean(true);
        return carroRepository.save(carroAtual);
    }
}
