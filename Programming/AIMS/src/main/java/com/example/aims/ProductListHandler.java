package com.example.aims;

import com.example.aims.entity.productmangement.Product;
import com.example.aims.entity.productmangement.ProductList;
import com.example.aims.screenhandler.AddProductHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ProductListHandler implements Initializable {

    @FXML
    ImageView imageView;

    @FXML
    ImageView imageView1;

    @FXML
    ImageView imageView2;

    @FXML
    ImageView imageView3;

    @FXML
    ImageView imageView4;

    @FXML
    ImageView imageView5;

    @FXML
    GridPane productListGrid;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Inside product list initialize");
        System.out.println(productListGrid);
        // Take product in ProductList to show;
//        Image image = new Image("file:/C:/sonesto/TKXDPM.KHMT.20231-20/Programming/AIMS/src/main/java/com/example/aims/assets/images/aims.png");
//        imageView.setImage(image);
//        Image image1 = new Image(getClass().getResourceAsStream("clean_code.jpg"));
//        imageView1.setImage(image1);
//        Image image2 = new Image(getClass().getResourceAsStream("code_complete.jpg"));
//        imageView2.setImage(image2);
//        Image image3 = new Image(getClass().getResourceAsStream("study_in_red.jpg"));
//        imageView3.setImage(image3);
//        Image image4 = new Image(getClass().getResourceAsStream("divide.jpg"));
//        imageView4.setImage(image4);
//        Image image5 = new Image(getClass().getResourceAsStream("X_cover.jpg"));
//        imageView5.setImage(image5);
        clearView();
        updateView();
    }

    public void updateView() {
        System.out.println("Inside update view");
        System.out.println(productListGrid);
        ProductList productList = ProductList.getInstance();
        List<Product> listProduct = productList.getProductList();
        for (Product product : listProduct) {
            System.out.println("Product " + product.getId() + " Info: ");
            product.printInfo();
            VBox productBox = new VBox();
            ImageView imageView = new ImageView();
            Label title = new Label("Title: " + product.getTitle());
            Label category = new Label("Category: " + product.getCategory());
            Label value = new Label("Value: " + product.getValue() + " VND");
            Label price = new Label("Price: " + product.getPrice() + " VND");
            Image image = new Image(product.getImageUrl());
            imageView.setImage(image);
            imageView.setFitWidth(150);  // Set the width
            imageView.setFitHeight(250);
            productBox.getChildren().add(imageView);
            productBox.getChildren().add(title);
            productBox.getChildren().add(category);
            productBox.getChildren().add(value);
            productBox.getChildren().add(price);
            int gridSize = productListGrid.getChildren().size();
            int stt = gridSize + 1;
            int row = (stt - 1) / 4;
            int col = (stt - 1) % 4;
            productListGrid.add(productBox, col, row);
        }
    }

    public void clearView() {
        productListGrid.getChildren().clear();
    }

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

    @FXML
    private void onRefreshClick() {
        clearView();
        updateView();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
