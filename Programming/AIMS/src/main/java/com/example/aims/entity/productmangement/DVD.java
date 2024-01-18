package com.example.aims.entity.productmangement;

public class DVD extends Product {
    String director;
    String studio;

    public DVD(String director, String studio) {
        super();
        this.director = director;
        this.studio = studio;
    }

    public DVD(int id, String title, ProductCategory productCategory, int value, int price, int quantity, String imageUrl, String director, String studio) {
        super(id, title, productCategory, value, price, quantity, imageUrl);
        this.director = director;
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
