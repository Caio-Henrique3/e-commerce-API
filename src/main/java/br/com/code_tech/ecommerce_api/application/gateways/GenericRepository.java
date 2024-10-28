package br.com.code_tech.ecommerce_api.application.gateways;

import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

import java.util.List;

public interface GenericRepository<T> {

    List<T> listItems();

    T getItem(String uuid);

    void registerItem(T item);

    void updateItem(T item);

    void deleteItem(String uuid);

}
