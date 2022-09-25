package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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
//
//        try{
//            InputStream is = getAssets().open("Food_List");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            int a = 0;
//            while (buffer[a] != ' '){
//                a++;
//            }
//            byte[] title = new byte[a+1];
//            int b = 0;
//            while (b <= a){
//                title[b] = buffer[b];
//                b++;
//            }
//            String title1 = new String(title);
//
//
//
//            int c = b + 1;
//            while(buffer[c] != ' '){
//                c++;
//                Log.d("TAG", "d");
//            }
//            byte[] description = new byte[c-b+2];
//            int d = b+1;
//            while ( d <= c){
//                title[d] = buffer[d];
//                d++;
//            }
//            String description1 = new String(description);
//
//
//            items.add(new Meal(title1.toString(), title1.toString(), title1.toString(), title1.toString(),5, R.drawable.bricks));
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }



        items.add(new Meal("Dog Food","When the situation is really dire", "Dog food can", "Get human to open can", 1, R.drawable.chicken));
        items.add(new Meal("Cake","Not a lie", "Three buckets of milk, three wheat, one egg, two sugar", "Combine ingredients in 3x3 crafting grid", 5, R.drawable.icecream));
        items.add(new Meal("Pizza","It's pizza", "Pizza cheese, pizza dough, pizza red sauce, pizza toppings", "Mush all ingredients together and throw it into the ocean", 4, R.drawable.pizza));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MealAdapter(this, items));  // getApplicationContext() replaced with 'this'
    }
}