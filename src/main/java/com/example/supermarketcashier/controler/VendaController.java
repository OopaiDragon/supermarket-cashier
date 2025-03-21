package com.example.supermarketcashier.controler;

import com.example.supermarketcashier.model.Venda;
import com.example.supermarketcashier.service.impl.VendaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
@RequiredArgsConstructor
public class VendaController {
    private final VendaServiceImpl service;

    @PostMapping
    public Venda criarVenda() {
        return service.criarVenda();
    }

    @PostMapping("/{idVenda}/itens")
    public Venda adicionarItem(@PathVariable Long idVenda,
                               @RequestParam Long produtoId,
                               @RequestParam int quantidade) {
        return service.adicionarItem(idVenda, produtoId, quantidade);
    }
}
