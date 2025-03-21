package com.example.supermarketcashier.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produto produto;

    private Integer quantidade;

    public Double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}

