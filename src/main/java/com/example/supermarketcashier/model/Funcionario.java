package com.example.supermarketcashier.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String login;
    private String senha;
    private Boolean ativo = true;
}

