package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Build the list of meals. This is where a file could be read
        List<Meal> items = new ArrayList<Meal>();

        File file = new File(
                "Food_List.txt");
        items.add(new Meal("Sandwich", 4, "Meat and bread", R.drawable.bricks));
        items.add(new Meal("Dog Food", 1, "When the situation is really dire", R.drawable.bricks));
        items.add(new Meal("Cake", 5, "Not a lie", R.drawable.bricks));
        items.add(new Meal("Pizza", 4, "It's pizza", R.drawable.bricks));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MealAdapter(this, items));  // getApplicationContext() replaced with 'this'
    }
}