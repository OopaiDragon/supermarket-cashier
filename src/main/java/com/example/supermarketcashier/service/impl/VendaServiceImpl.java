package com.example.supermarketcashier.service.impl;

import com.example.supermarketcashier.model.ItemVenda;
import com.example.supermarketcashier.model.Produto;
import com.example.supermarketcashier.model.Venda;
import com.example.supermarketcashier.repository.ProdutoRepository;
import com.example.supermarketcashier.repository.VendaRepository;
import com.example.supermarketcashier.service.interfaces.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@RequiredArgsConstructor
public class VendaServiceImpl implements VendaService {
    private final VendaRepository repo;
    private final ProdutoRepository produtoRepo;

    public Venda criarVenda() {
        Venda venda = new Venda();
        venda.setDataHora(LocalDateTime.now());
        return repo.save(venda);
    }

    public Venda adicionarItem(Long vendaId, Long produtoId, int quantidade) {
        Venda venda = repo.findById(vendaId).orElseThrow();
        Produto produto = produtoRepo.findById(produtoId).orElseThrow();

        ItemVenda item = new ItemVenda();
        item.setProduto(produto);
        item.setQuantidade(quantidade);

        venda.getItens().add(item);
        return repo.save(venda);
    }
}
