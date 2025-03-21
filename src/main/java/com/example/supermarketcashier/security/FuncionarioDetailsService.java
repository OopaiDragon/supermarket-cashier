package com.example.supermarketcashier.security;

import com.example.supermarketcashier.model.Funcionario;
import com.example.supermarketcashier.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FuncionarioDetailsService implements UserDetailsService {

    private final FuncionarioRepository funcionarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Funcionario funcionario = funcionarioRepository
                .findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Funcionário não encontrado"));

        return User.builder()
                .username(funcionario.getLogin())
                .password(funcionario.getSenha())
                .roles("FUNCIONARIO")
                .build();
    }
}
