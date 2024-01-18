package com.example.aims.entity.productmangement;

public class CD extends Product {
    String artist;
    String recordLabel;

    public CD(String artist, String recordLabel) {
        super();
        this.artist = artist;
        this.recordLabel = recordLabel;
    }

    public CD(int id, String title, ProductCategory productCategory, int value, int price, int quantity, String imageUrl, String artist, String recordLabel) {
        super(id, title, productCategory, value, price, quantity, imageUrl);
        this.artist = artist;
        this.recordLabel = recordLabel;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
}
