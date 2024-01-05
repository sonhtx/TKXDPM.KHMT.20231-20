package com.example.aims.entity.productmangement;

public class DVD {
    String director;
    String studio;

    public DVD(String director, String studio) {
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
