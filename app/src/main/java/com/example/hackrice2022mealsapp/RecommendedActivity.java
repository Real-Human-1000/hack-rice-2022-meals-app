package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RecommendedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Build the list of meals. This is where a file could be read
        List<Meal> items = new ArrayList<Meal>();

        try{
            InputStream is = getAssets().open("final_list.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String text = new String(buffer);
            String[] parts = text.split("~");
            for (int part_idx = 0; part_idx < parts.length; part_idx++) {
                parts[part_idx] = parts[part_idx].trim();
            }

            for (int randMeal = 0; randMeal < 5; randMeal++) {
                int i = (int)((int)(parts.length/5) * Math.random())*5;
                Log.d("Random index:",""+i);
                items.add(new Meal(parts[i], parts[i + 1], parts[i + 2], parts[i + 3], parts[i + 4], 5));
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }

        recyclerView.setLayoutManager(new LinearLayoutManager((Context)this));
        recyclerView.setAdapter(new MealAdapter((Context)this, items));  // getApplicationContext() replaced with 'this'
    }
}