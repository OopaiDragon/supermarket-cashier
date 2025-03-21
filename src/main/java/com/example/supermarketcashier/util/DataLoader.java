package com.example.supermarketcashier.util;

import com.example.supermarketcashier.model.Funcionario;
import com.example.supermarketcashier.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final FuncionarioRepository funcionarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        String loginPadrao = "admin";

        // Verifica se já existe um funcionário com o login padrão
        if (funcionarioRepository.findByLogin(loginPadrao).isEmpty()) {

            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Administrador");
            funcionario.setLogin(loginPadrao);
            funcionario.setSenha(passwordEncoder.encode("admin123"));
            funcionario.setAtivo(true);

            funcionarioRepository.save(funcionario);

            System.out.println("✅ Usuário admin criado com sucesso!");
        } else {
            System.out.println("ℹ️ Usuário admin já existe.");
        }
    }
}

