package com.example.aims.entity.productmangement;

public class LP {
    String artist;
    String recordLabel;

    public LP(String artist, String recordLabel) {
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
