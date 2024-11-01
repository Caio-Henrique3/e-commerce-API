package br.com.code_tech.ecommerce_api.domain.entities.order;

import br.com.code_tech.ecommerce_api.domain.entities.enums.OrderStatus;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Order(String uuid,
                    LocalDateTime orderDate,
                    LocalDateTime orderDeliveryDate,
                    List<Product> orderItems,
                    String orderNotes,
                    BigDecimal totalValue,
                    OrderStatus orderStatus) {}
