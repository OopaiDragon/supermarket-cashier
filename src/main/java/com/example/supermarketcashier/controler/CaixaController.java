package com.example.supermarketcashier.controler;

import com.example.supermarketcashier.model.Caixa;
import com.example.supermarketcashier.service.impl.CaixaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caixa")
@RequiredArgsConstructor
public class CaixaController {
    private final CaixaServiceImpl service;

    @PostMapping("/abrir")
    public Caixa abrir() {
        return service.abrirCaixa();
    }

    @PostMapping("/{id}/fechar")
    public Caixa fechar(@PathVariable Long id) {
        return service.fecharCaixa(id);
    }

    @GetMapping("/ativos")
    public List<Caixa> listarCaixasAtivos() {
        return service.listarCaixasAtivos();
    }
}

