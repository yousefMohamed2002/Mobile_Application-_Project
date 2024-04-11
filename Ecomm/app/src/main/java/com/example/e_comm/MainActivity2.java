package com.example.e_comm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


            // Retrieve data from intent
            int Image = getIntent().getIntExtra("photo", 0); // Provide default value for getIntExtra
            String Name = getIntent().getStringExtra("Name");
            String Description = getIntent().getStringExtra("Description");
            String Price = getIntent().getStringExtra("Price");

            // Set data to views
            ImageView imageView = findViewById(R.id.Main2Image);
            TextView name = findViewById(R.id.NameMain2);
            TextView descriptions = findViewById(R.id.Dec);
            TextView prices = findViewById(R.id.PriceMain);

            // Set retrieved data to views
            imageView.setImageResource(Image);
            name.setText(Name);
            descriptions.setText(Description);
            prices.setText(Price);
        }

    }
