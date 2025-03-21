package com.example.supermarketcashier.repository;

import com.example.supermarketcashier.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByAtivoTrue();
    Optional<Funcionario> findByLogin(String login);

}

