package com.example.hackrice2022mealsapp;

import java.io.Serializable;

public class Meal implements Serializable {

    private String title, description, ingredients, recipe;
    private int rating;
    private int icon;  // An int representing which icon image. Maybe this should be a string...

    public Meal(String title, String description, String ingredients, String recipe, int rating, int icon) {
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.icon = icon;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
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
