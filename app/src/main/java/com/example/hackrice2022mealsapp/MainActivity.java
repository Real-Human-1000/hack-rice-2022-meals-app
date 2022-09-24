package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Build the list of meals. This is where a file could be read
        List<Meal> items = new ArrayList<Meal>();
        items.add(new Meal("Sandwich", "Meat and bread", "Ham\nCheese\nBread", "Put together", 4, R.drawable.bricks));
        items.add(new Meal("Dog Food",  "For when the situation is really dire", "Dog Food Can", "Open dog food can\nconsume", 1, R.drawable.bricks));
        items.add(new Meal("Cake",  "Not a lie", "Three Buckets of Milk\nThree Wheat\nOne Egg\nTwo Piles of Sugar", "Combine", 5, R.drawable.bricks));
        items.add(new Meal("Pizza",  "It's pizza", "Pizza", "Pizza",4, R.drawable.bricks));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MealAdapter(this, items));  // getApplicationContext() replaced with 'this'
    }
}