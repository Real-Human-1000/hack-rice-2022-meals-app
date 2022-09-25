package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
        //myActionOrActionSupportBar.setDisplayHomeAsUpEnabled(true);

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewDescription = findViewById(R.id.textViewDescription);
        textViewIngredients = findViewById(R.id.textViewIngredients);
        textViewRecipe = findViewById(R.id.textViewRecipe);

        Intent i = getIntent();
        Meal meal = (Meal) i.getSerializableExtra("MEAL");
        textViewTitle.setText(meal.getTitle());
        textViewDescription.setText(meal.getDescription());
        String[] separated_ingredients = meal.getIngredients().split(",");
        textViewIngredients.setText(String.join("\n", separated_ingredients));
        String[] separated_instuctions = meal.getRecipe().split(",");
        textViewRecipe.setText(String.join("\n", separated_instuctions));

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//                finish();
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//        return true;
//    }
}