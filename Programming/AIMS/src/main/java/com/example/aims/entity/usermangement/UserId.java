package com.example.aims.entity.usermangement;

public class UserId {
    private static UserId instance;
    private static int currentId;
    private UserId() {
        currentId = 0;
    }

    public static UserId getInstance() {
        if (instance == null) {
            instance =  new UserId();
        }
        return instance;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void incCurrentId() {
        currentId += 1;
    }

    public static void decCurrentId() { currentId -= 1; }
}
