package com.example.supermarketcashier.service.impl;

import com.example.supermarketcashier.model.Produto;
import com.example.supermarketcashier.repository.ProdutoRepository;
import com.example.supermarketcashier.service.interfaces.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository repo;

    public Produto salvar(Produto p) { return repo.save(p); }

    public List<Produto> listar() { return repo.findAll(); }
}
