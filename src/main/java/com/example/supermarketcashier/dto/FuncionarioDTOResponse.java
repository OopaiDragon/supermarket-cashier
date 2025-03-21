package com.example.supermarketcashier.dto;

import lombok.Data;

@Data
public class FuncionarioDTOResponse {
    private Long id;
    private String nome;
    private String login;
    private Boolean ativo;
}