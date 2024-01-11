package com.example.aims.screenhandler;

import com.example.aims.ProductListHandler;
import com.example.aims.controller.AddProductController;
import com.example.aims.entity.productmangement.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class AddProductHandler {

    @FXML
    private TextField titleTextField;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField valueTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private HBox invisibleHBox1;

    @FXML
    private Label invisibleLabel1;

    @FXML
    private TextField invisibleField1;

    @FXML
    private HBox invisibleHBox2;

    @FXML
    private Label invisibleLabel2;

    @FXML
    private TextField invisibleField2;

    @FXML
    private TextField quantityField;

    @FXML
    private Button chooseImage;

    @FXML
    private TextField imageUrlTf;

    @FXML
    private void onAddProductClick() {
        System.out.println("Clicked");
        String title = titleTextField.getText();
        String category = categoryComboBox.getValue();
        int value = Integer.parseInt(valueTextField.getText());
        int price = Integer.parseInt(priceTextField.getText());
        int quantity = Integer.parseInt(quantityField.getText());
        String imageUrl = imageUrlTf.getText();

        ProductId.incCurrentId();
        int id = ProductId.getCurrentId();
        Product product = new Product();
        switch (category) {
            case "Book":
                String author = invisibleField1.getText();
                String publisher = invisibleField2.getText();
                product = new Book(id, title, ProductCategory.Book, value, price, quantity, imageUrl, author, publisher);
                break;
            case "CD":
                String artist = invisibleField1.getText();
                String recordLabel = invisibleLabel2.getText();
                product = new CD(id, title, ProductCategory.CD, value, price, quantity, imageUrl, artist, recordLabel);
                break;
            case "LP":
                artist = invisibleField1.getText();
                recordLabel = invisibleLabel2.getText();
                product = new LP(id, title, ProductCategory.LP, value, price, quantity, imageUrl, artist, recordLabel);
                break;
            case "DVD":
                String director = invisibleField1.getText();
                String studio = invisibleLabel2.getText();
                product = new DVD(id, title, ProductCategory.DVD, value, price, quantity, imageUrl, director, studio);
                break;
        }
        AddProductController addProductController = new AddProductController();
        addProductController.addProduct(product);

        if (addProductController.isPriceAccept(product)) {
            showAlert("Product Added", "Product information:\nTitle: " + title + "\nCategory: " + category + "\nValue: " + value + "\nPrice: " + price);
        }
        else {
            showAlert("Product Add Failed", "Your new product doesn't meet requirement.");
        }
    }

    @FXML
    private void onChooseImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose your image");
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            String imageUrl = selectedFile.toURI().toString();
            System.out.println(imageUrl);
            imageUrlTf.setText(imageUrl);
        }
    }

    @FXML
    private void handleCategoryChoosing() {
        String selectedCategory = categoryComboBox.getValue();
        if ("Book".equals(selectedCategory)) {
            requireBookDetails();
        } else if ("CD".equals(selectedCategory)) {
            requireCDDetails();
        } else if ("LP".equals(selectedCategory)) {
            requireLPDetails();
        } else if ("DVD".equals(selectedCategory)) {
            requireDVDDetails();
        } else {
            invisibleHBox1.setVisible(false);
            invisibleHBox2.setVisible(false);
        }
    }

    // Book - 4
    // CD - 2
    // LP - 2
    // DVD - 3

    @FXML
    void requireBookDetails() {
        invisibleLabel1.setText("Author:");
        invisibleLabel2.setText("Publisher:");
        invisibleHBox1.setVisible(true);
        invisibleHBox2.setVisible(true);
    }

    @FXML
    void requireCDDetails() {
        invisibleLabel1.setText("Artist:");
        invisibleLabel2.setText("Record Label:");
        invisibleHBox1.setVisible(true);
        invisibleHBox2.setVisible(true);
    }

    @FXML
    void requireLPDetails() {
        invisibleLabel1.setText("Artist:");
        invisibleLabel2.setText("Record Label:");
        invisibleHBox1.setVisible(true);
        invisibleHBox2.setVisible(true);
    }

    @FXML
    void requireDVDDetails() {
        invisibleLabel1.setText("Director");
        invisibleLabel2.setText("Studio");
        invisibleHBox1.setVisible(true);
        invisibleHBox2.setVisible(true);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
