package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QandActivity extends AppCompatActivity {

    Button btnBodyType, btnSkinType, btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qand);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnBodyType=findViewById(R.id.btnBodyType);
        btnSkinType=findViewById(R.id.btnSkinType);
        btnQuiz = findViewById(R.id.btnQuiz);


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

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QandActivity.this, QuizActivity.class));
            }
        });
    }
}