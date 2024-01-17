package com.example.aims.screenhandler;

import com.example.aims.UserListHandler;
import com.example.aims.controller.AddUserController;
import com.example.aims.entity.usermangement.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class AddUserHandler {

    @FXML
    private TextField name;


    @FXML
    private TextField email;

    @FXML
    private TextField address;


    @FXML
    private TextField phone;

    @FXML
    private Button chooseImage;

    @FXML
    private TextField imageUrlTf;

    @FXML
    private void onAddUserClick() {
        System.out.println("Clicked");
        String name = this.name.getText();
        String email = this.email.getText();
        String address = this.address.getText();
        String phone = this.phone.getText();

        UserId.incCurrentId();
        int id = UserId.getCurrentId();
        User user = new User(id, name, email, address, phone);
        AddUserController addUserController = new AddUserController();
        addUserController.addUser(user);
    }


    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
