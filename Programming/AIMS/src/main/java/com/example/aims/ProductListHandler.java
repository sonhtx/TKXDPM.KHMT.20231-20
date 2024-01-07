package com.example.aims;

import com.example.aims.screenhandler.AddProductHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductListHandler {
    @FXML
    private HBox buttonContainer;

    @FXML
    private void onAddProductClick() {
        try {
            String path = "add-product.fxml";
            System.out.println(getClass().getResource(path));
            // Load FXML file for "Add Product" screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent addProductRoot = loader.load();

            // Get the controller for "Add Product" screen
            AddProductHandler addProductHandler = loader.getController();

            // Create a new stage for "Add Product" screen
            Stage addProductStage = new Stage();
            addProductStage.setTitle("Add Product");
            addProductStage.setScene(new Scene(addProductRoot));

            // Show the "Add Product" screen
            addProductStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onDeleteClick() {
        // Xử lý khi nút "Delete" được nhấn
        showAlert("Delete Clicked");
    }

    @FXML
    private void onViewClick() {
        // Xử lý khi nút "View" được nhấn
        showAlert("View Clicked");
    }

    @FXML
    private void onUpdateClick() {
        // Xử lý khi nút "Update" được nhấn
        showAlert("Update Clicked");
    }

    @FXML
    private void onProductClick() {
        // Xử lý khi VBox chứa thông tin sản phẩm được nhấn
        showAlert("Product Clicked");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
