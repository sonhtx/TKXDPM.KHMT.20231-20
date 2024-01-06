package com.example.aims;

import com.example.aims.views.payorder.PayOrderScreenHandler;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class App extends Application {
    @FXML
    Button btnConfirmPayment;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pay-order.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 900);
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