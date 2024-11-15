package com.example.aspoo.services;

import com.example.aspoo.models.Cliente;
import com.example.aspoo.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente criarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }


}
