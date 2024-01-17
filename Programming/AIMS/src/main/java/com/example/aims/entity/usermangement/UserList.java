package com.example.aims.entity.usermangement;

import java.util.ArrayList;
import java.util.List;

// Singleton Design Pattern with lazy initialization

public class UserList {
    private static UserList instance;
    private static List<User> userList;

    private UserList() {
        // Replace by get all user lists from database;
        userList = new ArrayList<User>();
    }

    public static UserList getInstance() {
        if (instance == null) {
            instance = new UserList();
        }
        return instance;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        System.out.println("Adding user here");
        userList.add(user);
    }

    void updateUser(User user) {

    }

    void deleteUser(User user) {

    }

    void viewUser(User user) {

    }
}
