package com.example.aims.controller;

import com.example.aims.entity.usermangement.User;
import com.example.aims.entity.usermangement.UserId;
import com.example.aims.entity.usermangement.UserList;
import javafx.scene.control.Alert;

public class AddUserController {
    public void addUser(User user) {
        UserList userList = UserList.getInstance();
        userList.addUser(user);
    }


}
