package com.example.supermarketcashier.service.impl;

import com.example.supermarketcashier.model.Caixa;
import com.example.supermarketcashier.repository.CaixaRepository;
import com.example.supermarketcashier.service.interfaces.CaixaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CaixaServiceImpl implements CaixaService {
    private final CaixaRepository repo;

    public Caixa abrirCaixa() {
        Caixa c = new Caixa();
        c.setStatus("ABERTO");
        return repo.save(c);
    }

    public Caixa fecharCaixa(Long id) {
        Caixa c = repo.findById(id).orElseThrow();
        c.setStatus("FECHADO");
        return repo.save(c);
    }

    public List<Caixa> listarCaixasAtivos() {
        return repo.findByStatus("ABERTO");
    }
}
