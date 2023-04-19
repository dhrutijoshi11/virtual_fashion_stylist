package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvTriangleActivity extends AppCompatActivity {

    Button btnTop, btnBottom, btnDress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourglass);
        btnTop = findViewById(R.id.btnTop);
        btnBottom = findViewById(R.id.btnBottom);
        btnDress = findViewById(R.id.btnDress);


        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvTriangleActivity.this, TopActivity.class));
            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvTriangleActivity.this, BottomActivity.class));
            }
        });

        btnDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvTriangleActivity.this, DressActivity.class));
            }
        });
    }
}