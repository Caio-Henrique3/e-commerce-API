package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

public class DeleteProduct {

    private final GenericRepository<Product> repository;

    public DeleteProduct(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public void deleteProduct(String uuid) {
        repository.deleteItem(uuid);
    }

}
