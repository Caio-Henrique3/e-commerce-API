package br.com.code_tech.ecommerce_api.domain.entities.stock;

import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

public record Stock(String uuid,
                    Integer quantityAvailable,
                    Integer minimumQuantity,
                    Integer reservedQuantity,
                    Product product) {}
