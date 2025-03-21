package com.example.supermarketcashier.service.interfaces;

import com.example.supermarketcashier.model.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente salvar(Cliente cliente);
    List<Cliente> listarTodos();
    Cliente buscarPorCpf(String cpf);
}
