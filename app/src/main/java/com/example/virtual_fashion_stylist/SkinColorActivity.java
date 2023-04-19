package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class SkinColorActivity extends AppCompatActivity {


    Button btnSubmit;
    RadioButton btnLight, btnNormal, btnTan, btnBrown, btnDark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_color);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnLight = findViewById(R.id.btnLight);
        btnNormal = findViewById(R.id.btnNormal);
        btnTan = findViewById(R.id.btnTan);
        btnBrown = findViewById(R.id.btnBrown);
        btnDark = findViewById(R.id.btnDark);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnLight.isChecked()) {
                    Intent intent = new Intent(SkinColorActivity.this, LightActivity.class);
                    startActivity(intent);
                } else if (btnNormal.isChecked()) {
                    Intent intent = new Intent(SkinColorActivity.this, NormalActivity.class);
                    startActivity(intent);
                } else if (btnTan.isChecked()) {
                    Intent intent = new Intent(SkinColorActivity.this, TanActivity.class);
                    startActivity(intent);
                } else if (btnBrown.isChecked()) {
                    Intent intent = new Intent(SkinColorActivity.this, BrownActivity.class);
                    startActivity(intent);
                } else if (btnDark.isChecked()) {
                    Intent intent = new Intent(SkinColorActivity.this, DarkActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SkinColorActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}