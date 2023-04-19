package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InspirationLook extends AppCompatActivity {

    Button button1,button2,button3,button4, button5, button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration_look);



        button1 = findViewById(R.id.button4);
        button2 = findViewById(R.id.button5);
        button3 = findViewById(R.id.button6);
        button4 = findViewById(R.id.button12);
        button5 = findViewById(R.id.button14);
        button6 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button15);
        button1.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, CasualActivity.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, ClassicActivity.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, ElegantActivity.class);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, RomanticActivity.class);
            startActivity(intent);
        });
        button5.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, SexyActivity.class);
            startActivity(intent);
        });
        button6.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, CreativeActivity.class);
            startActivity(intent);
        });
        button7.setOnClickListener(view -> {
            Intent intent= new Intent(InspirationLook.this, TrendyActivity.class);
            startActivity(intent);
        });
    }
}
