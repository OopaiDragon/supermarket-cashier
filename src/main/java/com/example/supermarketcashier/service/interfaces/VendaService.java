package com.example.supermarketcashier.service.interfaces;

import com.example.supermarketcashier.model.Venda;

public interface VendaService {
    Venda criarVenda();
    Venda adicionarItem(Long vendaId, Long produtoId, int quantidade);
}

