package com.example.aims.entity.productmangement;

public class Product {
    private int id;
    private String title;
    ProductCategory category;
    private int value, price;
    private int quantity;
    private String imageUrl;

    public Product() {}

    public Product(int id, String title, ProductCategory category, int value, int price, int quantity, String imageUrl) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.value = value;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void printInfo() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Value: " + value);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("ImageUrl: " + imageUrl);
    }
}
