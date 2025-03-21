package com.example.supermarketcashier.controller;

import com.example.supermarketcashier.dto.FuncionarioDTOResponse;
import com.example.supermarketcashier.model.Funcionario;
import com.example.supermarketcashier.service.interfaces.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @PostMapping
    public FuncionarioDTOResponse cadastrar(@RequestBody Funcionario funcionario) {
        Funcionario salvo = funcionarioService.salvar(funcionario);
        return toDTO(salvo);
    }

    @GetMapping("/ativos")
    public List<FuncionarioDTOResponse> listarAtivos() {
        return funcionarioService.listarAtivos()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping("/{id}/desativar")
    public void desativar(@PathVariable Long id) {
        funcionarioService.desativar(id);
    }

    private FuncionarioDTOResponse toDTO(Funcionario funcionario) {
        FuncionarioDTOResponse dto = new FuncionarioDTOResponse();
        dto.setId(funcionario.getId());
        dto.setNome(funcionario.getNome());
        dto.setLogin(funcionario.getLogin());
        dto.setAtivo(funcionario.getAtivo());
        return dto;
    }
}
