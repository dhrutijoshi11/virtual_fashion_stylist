package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class BodyTypeActivity extends AppCompatActivity {

    Button btnSubmit;
    RadioButton btnHourGlass, btnRectangle, btnPear, btnInvTriangle, btnApple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qnd);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnHourGlass = findViewById(R.id.hourGlass);
        btnRectangle = findViewById(R.id.rectangle);
        btnInvTriangle = findViewById(R.id.invertedTriangle);
        btnPear = findViewById(R.id.pear);
        btnApple = findViewById(R.id.apple);


        btnSubmit.setOnClickListener(new View.OnClickListener() {

            // Check which radio button is checked and start appropriate activity
            @Override
            public void onClick(View view) {
                if (btnHourGlass.isChecked()) {
                    Intent intent = new Intent(BodyTypeActivity.this, HourglassActivity.class);
                    startActivity(intent);
                } else if (btnRectangle.isChecked()) {
                    Intent intent = new Intent(BodyTypeActivity.this, RectangleActivity.class);
                    startActivity(intent);
                } else if (btnInvTriangle.isChecked()) {
                    Intent intent = new Intent(BodyTypeActivity.this, InvTriangleActivity.class);
                    startActivity(intent);
                } else if (btnPear.isChecked()) {
                    Intent intent = new Intent(BodyTypeActivity.this, PearActivity.class);
                    startActivity(intent);
                } else if (btnApple.isChecked()) {
                    Intent intent = new Intent(BodyTypeActivity.this, AppleActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(BodyTypeActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}