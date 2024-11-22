package com.example.aspoo.models;

import com.example.aspoo.dtos.request.ClienteRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "clientes")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String password;
    private String nome;
    private Integer idade;

    public static Cliente ConverteParaCliente(ClienteRequest clienteRequest) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequest.getNome());
        cliente.setIdade(clienteRequest.getIdade());
        cliente.setPassword(clienteRequest.getPassword());

        return cliente;
    }
}
