package com.example.aims.entity.productmangement;

import java.time.LocalDate;

public class Book extends Product {
    String author;
    String publisher;

    public Book(String author, String publisher) {
        super();
        this.author = author;
        this.publisher = publisher;
    }

    public Book(int id, String title, ProductCategory productCategory, int value, int price, int quantity, String imageUrl, String author, String publisher) {
        super(id, title, productCategory, value, price, quantity, imageUrl);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
