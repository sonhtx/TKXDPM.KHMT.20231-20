package com.example.aims.controller;

import com.example.aims.database.DBConnection;
import com.example.aims.entity.productmangement.Product;
import com.example.aims.entity.productmangement.ProductId;
import com.example.aims.entity.productmangement.ProductList;
import javafx.scene.control.Alert;

public class AddProductController {
    public void addProduct(Product product) {
        if (!isPriceAccept(product)) {
            showAlert("Product price must be from 30% to 150% of product's value");
            ProductId.decCurrentId();
            return;
        }
        ProductList productList = ProductList.getInstance();
        productList.addProduct(product);
        DBConnection.addProduct(product);
    }

    public boolean isPriceAccept(Product product) {
        // Should use constant instead
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
