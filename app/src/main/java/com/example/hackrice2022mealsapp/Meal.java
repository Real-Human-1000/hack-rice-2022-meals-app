package com.example.hackrice2022mealsapp;

import java.io.Serializable;

public class Meal implements Serializable {

    private String title, description, ingredients, recipe, type;
    private int rating;

    public Meal(String title, String description, String ingredients, String recipe, String type, int rating) {
        this.title = title;
        this.rating = rating;
        this.description = description;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.type = type;
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

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
