package com.example.aims.entity.productmangement;

import java.util.ArrayList;
import java.util.List;

// Singleton Design Pattern with lazy initialization

public class ProductList {
    private static ProductList instance;
    private static List<Product> productList;

    private ProductList() {
        // Replace by get all product lists from database;
        productList = new ArrayList<Product>();
    }

    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
        }
        return instance;
    }

    public void addProduct(Product product) {
        System.out.println("Adding product here");
        productList.add(product);
    }

    void updateProduct(Product product) {

    }

    void deleteProduct(Product product) {

    }

    void viewProduct(Product product) {

    }
}
