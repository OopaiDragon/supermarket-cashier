package com.example.supermarketcashier.service.interfaces;

import com.example.supermarketcashier.model.Caixa;

import java.util.List;

public interface CaixaService {
    Caixa abrirCaixa();
    Caixa fecharCaixa(Long id);
    List<Caixa> listarCaixasAtivos();
}

