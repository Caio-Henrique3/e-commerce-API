package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.application.gateways.product.ProductRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

import java.util.UUID;

public class UpdateProduct {

    private final GenericRepository<Product> repository;

    public UpdateProduct(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public void updateProduct(UUID uuid, Product product) {
        repository.updateItem(uuid, product);
    }

}
