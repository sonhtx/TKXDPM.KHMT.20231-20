package com.example.aims.entity.productmangement;

import java.time.LocalDate;

public class Book extends Product {
    String author;
    String publisher;
    LocalDate publicationDate;
    CoverType coverType;

    public Book(String author, String publisher, LocalDate publicationDate, CoverType coverType) {
        super();
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.coverType = coverType;
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

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }
}
