package com.example.aspoo.services;

import com.example.aspoo.dtos.request.ClienteRequest;
import com.example.aspoo.dtos.responses.ClienteResponse;
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

    public List<ClienteResponse> findAll(){
        List <ClienteResponse> clientes = clienteRepository.findAll()
                .stream()
                .map(item -> ClienteResponse.converteParaClienteResponse(item))
                .toList();
        return clientes;
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public Cliente criarCliente(ClienteRequest clienteRequest){
        return clienteRepository.save(Cliente.ConverteParaCliente(clienteRequest));
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente atualizarCliente(Long id, ClienteRequest clienteAtualizado){
        Cliente cliente = clienteRepository.findById(id).get();

        cliente.setNome(clienteAtualizado.getNome());
        cliente.setIdade(clienteAtualizado.getIdade());
        cliente.setPassword(clienteAtualizado.getPassword());

        return clienteRepository.save(cliente);
    }
}