package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CasualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Get the RecyclerView from the layout
        RecyclerView recyclerView=findViewById(R.id.casual1);
        recyclerView.setHasFixedSize(true);


        // Create a list of photos
        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.c1));
        mlist.add(new photos(R.drawable.c2));
        mlist.add(new photos(R.drawable.c3));
        mlist.add(new photos(R.drawable.c4));
        mlist.add(new photos(R.drawable.c5));
        mlist.add(new photos(R.drawable.c6));
        mlist.add(new photos(R.drawable.c7));
        mlist.add(new photos(R.drawable.c8));
        mlist.add(new photos(R.drawable.c9));
        mlist.add(new photos(R.drawable.c10));


        // Set the layout manager and adapter for the RecyclerView
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);


    }
}