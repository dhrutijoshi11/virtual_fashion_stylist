package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QandActivity extends AppCompatActivity {

    Button btnBodyType, btnSkinType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qand);
        btnBodyType=findViewById(R.id.btnBodyType);
        btnSkinType=findViewById(R.id.btnSkinType);


        btnBodyType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QandActivity.this, BodyTypeActivity.class));
            }
        });

        btnSkinType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QandActivity.this, SkinColorActivity.class));
            }
        });
    }
}