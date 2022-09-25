package com.example.hackrice2022mealsapp;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NewMeals extends AppCompatActivity {

    private EditText nameText;
    private EditText descriptionText;
    private EditText ingredientText;
    private EditText instructionsText;
    private Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_meals);

        nameText = findViewById(R.id.nameText);
        descriptionText = findViewById(R.id.descriptionText);
        ingredientText = findViewById(R.id.ingredientsText);
        instructionsText = findViewById(R.id.instructionsText);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nameText.getText().toString().equals(""))
                {
                    String message = nameText.getText().toString() + descriptionText.getText().toString() + ingredientText.getText().toString() + instructionsText.getText().toString();
                    writeToFile(message);
                }

            }
        });
        /*
        try {
            if(readFromFile() != null)
            {
                nameText.setText(readFromFile());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
    }

    private void writeToFile(String message)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("todolist.txt",
                    Context.MODE_PRIVATE));
            outputStreamWriter.write(message);
            outputStreamWriter.close();

        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
