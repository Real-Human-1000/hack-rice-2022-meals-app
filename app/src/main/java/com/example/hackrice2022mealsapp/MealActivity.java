package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MealActivity extends AppCompatActivity {

    TextView textViewTitle;
    TextView textViewDescription;
    TextView textViewIngredients;
    TextView textViewRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewIngredients = findViewById(R.id.textViewIngredients);
        textViewRecipe = findViewById(R.id.textViewRecipe);

        Intent i = getIntent();
        Meal meal = (Meal) i.getSerializableExtra("MEAL");
        textViewTitle.setText(meal.getTitle());
        textViewDescription.setText(meal.getDescription());
        textViewIngredients.setText(meal.getIngredients());
        textViewRecipe.setText(meal.getRecipe());

    }
}