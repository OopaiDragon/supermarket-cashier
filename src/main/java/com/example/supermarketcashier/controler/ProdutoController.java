package com.example.supermarketcashier.controler;

import com.example.supermarketcashier.model.Produto;
import com.example.supermarketcashier.service.impl.ProdutoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoServiceImpl service;

    @PostMapping
    public Produto criar(@RequestBody Produto p) {
        return service.salvar(p);
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }
}

