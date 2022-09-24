package com.example.hackrice2022mealsapp;

import java.io.Serializable;

public class Meal implements Serializable {

    private String title;
    private int rating;
    private String description;
    private int icon;

    public Meal(String title, int rating, String description, int icon) {
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.icon = icon;  // An int representing which icon image. Maybe this should be a string...
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public int getIcon() {
        return icon;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
