package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Build the list of meals. This is where a file could be read
        List<Meal> items = new ArrayList<Meal>();

        try{
            InputStream is = getAssets().open("Food_List");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String text = new String(buffer);
            String[] parts = text.split("~");
            for (int part_idx = 0; part_idx < parts.length; part_idx++) {
                parts[part_idx] = parts[part_idx].trim();
            }
            int i = 0;
            while (i < parts.length) {
                items.add(new Meal(parts[i], parts[i+1], parts[i+2], parts[i+3], 5, R.drawable.bricks));
                i = i + 4;
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }



//        items.add(new Meal("Dog Food", 1, "When the situation is really dire", R.drawable.bricks));
//        items.add(new Meal("Cake", 5, "Not a lie", R.drawable.bricks));
//        items.add(new Meal("Pizza", 4, "It's pizza", R.drawable.bricks));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MealAdapter(this, items));  // getApplicationContext() replaced with 'this'
    }
}