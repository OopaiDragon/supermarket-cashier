package com.example.supermarketcashier.repository;

import com.example.supermarketcashier.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long> {
    List<Caixa> findByStatus(String status);
}

