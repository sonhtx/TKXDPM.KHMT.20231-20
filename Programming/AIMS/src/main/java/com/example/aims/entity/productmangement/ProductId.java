package com.example.aims.entity.productmangement;

public class ProductId {
    private static ProductId instance;
    private static int currentId;
    private ProductId() {
        currentId = 0;
    }

    public static ProductId getInstance() {
        if (instance == null) {
            instance =  new ProductId();
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
