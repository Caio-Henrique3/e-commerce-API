package br.com.code_tech.ecommerce_api.application.gateways;

import br.com.code_tech.ecommerce_api.domain.entities.product.Product;

import java.util.List;
import java.util.UUID;

public interface GenericRepository<T> {

    List<T> listItems();

    T getItem(UUID uuid);

    void registerItem(T item);

    void updateItem(UUID uuid, T item);

    void deleteItem(UUID uuid);

}