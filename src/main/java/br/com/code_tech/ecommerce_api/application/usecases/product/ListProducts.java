package br.com.code_tech.ecommerce_api.application.usecases.product;

import br.com.code_tech.ecommerce_api.application.gateways.GenericRepository;
import br.com.code_tech.ecommerce_api.application.gateways.product.ProductRepository;
import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

import java.util.List;

public class ListProducts {

    private final GenericRepository<Product> repository;

    public ListProducts(GenericRepository<Product> repository) {
        this.repository = repository;
    }

    public List<Product> listProducts() {
        return repository.listItems();
    }

}
