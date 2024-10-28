package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

public class GetProduct {

    private final GenericRepository<Product> repository;

    public GetProduct(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public Product getProduct(String uuid) {
        return repository.getItem(uuid);
    }

}
