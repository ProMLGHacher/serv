package com.example.demo.models;

import java.util.ArrayList;

public class OnCityInfo {
    ArrayList<HotelInfo> hotels;
    ArrayList<AttractionInfo> attractions;
    ArrayList<EatInfo> eat;

    public OnCityInfo(ArrayList<HotelInfo> hotels, ArrayList<AttractionInfo> attractions, ArrayList<EatInfo> eat) {
        this.hotels = hotels;
        this.attractions = attractions;
        this.eat = eat;
    }

    public ArrayList<HotelInfo> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<HotelInfo> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<AttractionInfo> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<AttractionInfo> attractions) {
        this.attractions = attractions;
    }
}
