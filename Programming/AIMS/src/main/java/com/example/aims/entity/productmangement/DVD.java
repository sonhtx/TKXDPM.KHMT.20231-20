package com.example.aims.entity.productmangement;

public class DVD {
    DiskType diskType;
    String director;
    String studio;

    public DVD(DiskType diskType, String director, String studio) {
        this.diskType = diskType;
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

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }
}
