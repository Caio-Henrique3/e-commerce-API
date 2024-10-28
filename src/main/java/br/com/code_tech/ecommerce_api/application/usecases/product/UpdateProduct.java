package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

public class UpdateProduct {

    private final GenericRepository<Product> repository;

    public UpdateProduct(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public void updateProduct(Product product) {
        repository.updateItem(product);
    }

}
