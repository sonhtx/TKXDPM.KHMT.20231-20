package com.example.aims.controller;

import com.example.aims.entity.productmangement.Product;
import com.example.aims.entity.productmangement.ProductId;
import com.example.aims.entity.productmangement.ProductList;
import javafx.scene.control.Alert;

public class AddProductController {
    public void addProduct(Product product) {
        if (!checkValid(product)) {
            showAlert("Product price must be from 30% to 150% of product's value");
            ProductId.decCurrentId();
            return;
        }
        ProductList instance = ProductList.getInstance();
        instance.addProduct(product);
    }

    public boolean checkValid(Product product) {
        double minPriceAccept = 3.0 * product.getValue() / 10.0;
        double maxPriceAccept = 15.0 * product.getValue() / 10.0;
        return minPriceAccept <= product.getPrice() && product.getPrice() <= maxPriceAccept;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
