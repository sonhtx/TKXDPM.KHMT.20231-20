package com.example.aims.views.payorder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import com.example.aims.views.FXMLScreenHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PayOrderScreenHandler extends FXMLScreenHandler {

    @FXML
    private Button btnConfirmPayment;

    @FXML
    private ImageView loadingImage;

    public PayOrderScreenHandler(String screenPath, Stage stage) throws IOException {
        super(screenPath, stage);
        btnConfirmPayment.setOnMouseClicked(e -> {
            try {
                System.out.println("Clicked");
            } catch (Exception exp) {
                System.out.println(Arrays.toString(exp.getStackTrace()));
            }
        });
    }

    @FXML
    private Label pageTitle;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField holderName;

    @FXML
    private TextField expirationDate;

    @FXML
    private TextField securityCode;
}
