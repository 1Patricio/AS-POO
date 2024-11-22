package com.example.aspoo.controllers;


import com.example.aspoo.dtos.request.ClienteRequest;
import com.example.aspoo.dtos.responses.ClienteResponse;
import com.example.aspoo.models.Cliente;
import com.example.aspoo.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    final
    ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    List<ClienteResponse> listaTodosClientes(){
        return clienteService.findAll();
    }

    @PostMapping
    Cliente criaCliente(@RequestBody ClienteRequest cliente){
        return clienteService.criarCliente(cliente);
    }
}
