package com.example.hackrice2022mealsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MealViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView titleView, descriptionView;
    Meal meal;
    Context context;

    public MealViewHolder(@NonNull View itemView, Context ctx) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        titleView = itemView.findViewById(R.id.title);
        descriptionView = itemView.findViewById(R.id.description);
        context = ctx;
        itemView.setOnClickListener((v) -> onClick());  // surprised this works
    }

    public void onClick() {
        Intent i = new Intent(context, MealActivity.class);
        i.putExtra("MEAL", meal);
        context.startActivity(i);
    }
}
