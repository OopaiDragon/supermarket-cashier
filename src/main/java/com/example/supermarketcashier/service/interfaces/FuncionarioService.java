package com.example.supermarketcashier.service.interfaces;

import com.example.supermarketcashier.model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    Funcionario salvar(Funcionario funcionario);
    List<Funcionario> listarAtivos();
    void desativar(Long id);
}