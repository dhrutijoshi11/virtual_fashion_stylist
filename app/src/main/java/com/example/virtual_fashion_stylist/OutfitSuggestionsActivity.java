package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class OutfitSuggestionsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit_suggestions);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String eventCategory = getIntent().getStringExtra("eventCategory");

        switch (eventCategory) {
            case "Casual":
                Intent intent = new Intent(OutfitSuggestionsActivity.this, CasualActivity2.class);
                startActivity(intent);
                break;
            case "Formal":
                Intent intent1 = new Intent(OutfitSuggestionsActivity.this, FormalActivity.class);
                startActivity(intent1);
                break;
            case "Party":
                Intent intent2 = new Intent(OutfitSuggestionsActivity.this, PartyActivity.class);
                startActivity(intent2);
                break;
            case "Wedding":
                Intent intent3 = new Intent(OutfitSuggestionsActivity.this, WeddingActivity.class);
                startActivity(intent3);
                break;
        }
    }

}