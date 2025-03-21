package com.example.supermarketcashier.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemVenda> itens = new ArrayList<>();

    public Double getTotal() {
        return itens.stream()
                .mapToDouble(ItemVenda::getSubtotal)
                .sum();
    }
}

