package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

public class RegisterProduct {

    private final GenericRepository<Product> repository;

    public RegisterProduct(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public void registerProduct(Product product) {
        repository.registerItem(product);
    }

}
