package com.example.hackrice2022mealsapp;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NewMeals extends AppCompatActivity {
    private static final String FILE_NAME = "Food_List.txt";

    private EditText nameText;
    private EditText descriptionText;
    private EditText ingredientText;
    private EditText instructionsText;
    private Button saveButton;


    private void writeToFile(String message)
    {
        try {
            Log.d("FILE","Writing to file");
            FileOutputStream fileout = openFileOutput("testfile",MODE_PRIVATE);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileout);
            outputStreamWriter.append(message);
            outputStreamWriter.close();
            Log.d("FILE","Done Writing to File");

        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Log.d("FILE", "Reading file");
            InputStream is = new FileInputStream(new File("testfile"));
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String text = new String(buffer);
            Log.d("FILE", text);

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_meals);

        nameText = (EditText)findViewById(R.id.nameText);
        descriptionText = findViewById(R.id.descriptionText);
        ingredientText = findViewById(R.id.ingredientsText);
        instructionsText = findViewById(R.id.instructionsText);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = nameText.getText().toString(); //+ "~" + descriptionText.getText().toString() + "~" + ingredientText.getText().toString() + "~" +instructionsText.getText().toString();
                writeToFile(message);
            }
        });
    }
}
