package com.example.hackrice2022mealsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleTextView;
    Button listButton, newMealButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.appTitleTextView);
        listButton = (Button)findViewById(R.id.listButton);
        listButton.setOnClickListener((v) -> onClickListButton());
        newMealButton = (Button)findViewById(R.id.newMealButton);
        newMealButton.setOnClickListener((v) -> onClickNewMealButton());

    }

    public void onClickListButton() {
        Intent i = new Intent(this, ListActivity.class);
        this.startActivity(i);
    }

    public void onClickNewMealButton() {
        Intent i = new Intent(this, NewMeals.class);
        this.startActivity(i);
    }
}