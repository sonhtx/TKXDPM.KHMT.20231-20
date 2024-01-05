package com.example.aims.entity.productmangement;

import java.util.List;

public class ProductList {
    List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    void add(Product product) {
        this.productList.add(product);
    }

    void update(Product product) {

    }

    void delete(Product product) {

    }

    void view(Product product) {
        
    }
}
