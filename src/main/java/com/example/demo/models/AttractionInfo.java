package com.example.demo.models;

public class AttractionInfo {
    long id;
    String name;
    String imagePath;
    String address;

    public AttractionInfo(long id, String name, String imagePath, String address) {
        this.id = id;
        this.name = name;
        this.imagePath = imagePath;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getAddress() {
        return address;
    }
}
