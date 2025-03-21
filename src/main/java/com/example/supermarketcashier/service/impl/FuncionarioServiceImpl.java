package com.example.supermarketcashier.service.impl;

import com.example.supermarketcashier.model.Funcionario;
import com.example.supermarketcashier.repository.FuncionarioRepository;
import com.example.supermarketcashier.service.interfaces.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        funcionario.setSenha(passwordEncoder.encode(funcionario.getSenha()));
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarAtivos() {
        return funcionarioRepository.findByAtivoTrue();
    }

    public void desativar(Long id) {
        Funcionario f = funcionarioRepository.findById(id).orElseThrow();
        f.setAtivo(false);
        funcionarioRepository.save(f);
    }
}

