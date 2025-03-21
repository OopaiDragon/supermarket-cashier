package com.example.supermarketcashier.service.interfaces;

import com.example.supermarketcashier.model.Produto;

import java.util.List;

public interface ProdutoService {
    Produto salvar(Produto produto);
    List<Produto> listar();
}

