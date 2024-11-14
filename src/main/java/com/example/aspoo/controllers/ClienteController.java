package com.example.aspoo.controllers;


import com.example.aspoo.models.Cliente;
import com.example.aspoo.repositories.ClienteRepository;
import com.example.aspoo.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Cliente> listaTodosClientes(){
        return repository.findAll();
    }

    @PostMapping
    Cliente criaCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
}
