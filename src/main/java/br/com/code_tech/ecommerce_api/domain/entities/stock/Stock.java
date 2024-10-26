package br.com.code_tech.ecommerce_api.domain.entities.stock;

import br.com.code_tech.ecommerce_api.domain.entities.produtct.Product;

import java.math.BigDecimal;

public record Stock(Integer quantityAvailable,
                    Integer minimumQuantity,
                    Integer reservedQuantity,
                    Product product) {}
