package com.example.aspoo.dtos.responses;

import com.example.aspoo.models.Cliente;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteResponse {
    private String nome;
    private String idade;

    public static ClienteResponse converteParaClienteResponse(Cliente cliente) {
        ClienteResponse clienteResponse = new ClienteResponse();
        clienteResponse.setNome(cliente.getNome());
        clienteResponse.setIdade(cliente.getIdade());

        return clienteResponse;
    }
}
