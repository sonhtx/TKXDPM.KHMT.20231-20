package com.example.aims;

import com.example.aims.entity.usermangement.User;
import com.example.aims.entity.usermangement.UserList;
import com.example.aims.screenhandler.AddUserHandler;
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

public class UserListHandler implements Initializable {

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
    GridPane userListGrid;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Inside user list initialize");
        System.out.println(userListGrid);
        // Take user in UserList to show;
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
        System.out.println(userListGrid);
        UserList userList = UserList.getInstance();
        List<User> listUser = userList.getUserList();
        for (User user : listUser) {
            System.out.println("User " + user.getId() + " Info: ");
            user.printInfo();
            VBox userBox = new VBox();
            Label Name = new Label("Name: " + user.getName());
            Label Email = new Label("Email: " + user.getEmail());
            Label Address = new Label("Address: " + user.getAddress());
            Label Phone = new Label("Phone: " + user.getPhone());
            userBox.getChildren().add(Name);
            userBox.getChildren().add(Email);
            userBox.getChildren().add(Address);
            userBox.getChildren().add(Phone);
            int gridSize = userListGrid.getChildren().size();
            int stt = gridSize + 1;
            int row = (stt - 1) / 4;
            int col = (stt - 1) % 4;
            userListGrid.add(userBox, col, row);
        }
    }

    public void clearView() {
        userListGrid.getChildren().clear();
    }

    @FXML
    private HBox buttonContainer;

    @FXML
    private void onAddUserClick() {
        try {
            String path = "add-user.fxml";
            System.out.println(getClass().getResource(path));
            // Load FXML file for "Add User" screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent addUserRoot = loader.load();

            // Get the controller for "Add User" screen
            AddUserHandler addUserHandler = loader.getController();

            // Create a new stage for "Add User" screen
            Stage addUserStage = new Stage();
            addUserStage.setTitle("Add User");
            addUserStage.setScene(new Scene(addUserRoot));

            // Show the "Add User" screen
            addUserStage.show();
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
    private void onUserClick() {
        // Xử lý khi VBox chứa thông tin sản phẩm được nhấn
        showAlert("User Clicked");
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
