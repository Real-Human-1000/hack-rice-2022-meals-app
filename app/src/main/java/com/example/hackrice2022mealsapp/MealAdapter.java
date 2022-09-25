package com.example.hackrice2022mealsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealViewHolder> {

    Context context;
    List<Meal> meals;

    public MealAdapter(Context context, List<Meal> meals) {
        this.context = context;
        this.meals = meals;
    }

    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MealViewHolder(LayoutInflater.from(context).inflate(R.layout.meal_view, parent, false), context);
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        if (meals.get(position).getTitle().length() >= 20) {
            String truncated = meals.get(position).getTitle().substring(0,20) + "...";
            holder.titleView.setText(truncated);
        } else {
            holder.titleView.setText(meals.get(position).getTitle());
        }
        if (meals.get(position).getDescription().length() >= 70) {
            String truncated = meals.get(position).getDescription().substring(0,70) + "...";
            holder.descriptionView.setText(truncated);
        } else {
            holder.descriptionView.setText(meals.get(position).getDescription());
        }

        Meal meal = meals.get(position);
        holder.meal = meal;

        switch (meal.getType()) {
            case ("PASTA"):
                holder.imageView.setImageResource(R.drawable.pasta);
                break;
            case ("SALAD"):
                holder.imageView.setImageResource(R.drawable.carrot);
                break;
            case ("DESSERT"):
                holder.imageView.setImageResource(R.drawable.icecream);
                break;
            case ("MEAT"):
                holder.imageView.setImageResource(R.drawable.meat);
                break;
            case ("SOUP"):
                holder.imageView.setImageResource(R.drawable.soup);
                break;
            default:
                holder.imageView.setImageResource(R.drawable.misc);
        }

    }

    @Override
    public int getItemCount() {
        return meals.size();
    }

}
