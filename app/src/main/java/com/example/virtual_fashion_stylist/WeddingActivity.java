package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WeddingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView=findViewById(R.id.wedding);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.w1));
        mlist.add(new photos(R.drawable.w2));
        mlist.add(new photos(R.drawable.w3));
        mlist.add(new photos(R.drawable.w4));
        mlist.add(new photos(R.drawable.w5));
        mlist.add(new photos(R.drawable.w6));
        mlist.add(new photos(R.drawable.w7));
        mlist.add(new photos(R.drawable.w8));
        mlist.add(new photos(R.drawable.w9));
        mlist.add(new photos(R.drawable.w10));
        mlist.add(new photos(R.drawable.w11));
        mlist.add(new photos(R.drawable.w12));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}