package com.example.aims;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AppTest extends Application {
    @FXML
    Button btnConfirmPayment;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
        System.out.println(getClass().getResource("product-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        ProductListHandler controller = fxmlLoader.getController();
        stage.setTitle("AIMS");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void clicked() {
        System.out.println("Clicked");
    }

    public static void main(String[] args) {
        System.out.println("Starting app...");
        launch();
    }
}