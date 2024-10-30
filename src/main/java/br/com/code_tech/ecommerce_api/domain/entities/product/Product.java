package br.com.code_tech.ecommerce_api.domain.entities.product;

import br.com.code_tech.ecommerce_api.domain.entities.enums.Category;
import br.com.code_tech.ecommerce_api.domain.entities.enums.Status;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(UUID uuid,
                      String name,
                      String description,
                      BigDecimal price,
                      Category category,
                      Status status) {}
