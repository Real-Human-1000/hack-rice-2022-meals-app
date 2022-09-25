package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecommendedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Build the list of meals. This is where a file could be read
        List<Meal> items = new ArrayList<Meal>();



        recyclerView.setLayoutManager(new LinearLayoutManager((Context)this));
        recyclerView.setAdapter(new MealAdapter((Context)this, items));  // getApplicationContext() replaced with 'this'
    }
}