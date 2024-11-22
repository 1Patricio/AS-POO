package com.example.aspoo.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {
    private String nome;
    private Integer idade;
    private String password;
}
