package com.example.aims;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @FXML
    Button btnConfirmPayment;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 900);
        ProductListHandler controller = fxmlLoader.getController();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

//        PayOrderScreenHandler payOrderScreen = new PayOrderScreenHandler("pay-order.fxml", stage);
//        payOrderScreen.show();

    }

    @FXML
    public void clicked() {
        System.out.println("Clicked");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        launch();
    }
}