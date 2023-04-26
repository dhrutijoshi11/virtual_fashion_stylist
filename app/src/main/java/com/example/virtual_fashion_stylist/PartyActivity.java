package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView=findViewById(R.id.party);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.pa1));
        mlist.add(new photos(R.drawable.pa2));
        mlist.add(new photos(R.drawable.pa3));
        mlist.add(new photos(R.drawable.pa4));
        mlist.add(new photos(R.drawable.pa5));
        mlist.add(new photos(R.drawable.pa6));
        mlist.add(new photos(R.drawable.pa7));
        mlist.add(new photos(R.drawable.pa8));
        mlist.add(new photos(R.drawable.pa9));
        mlist.add(new photos(R.drawable.pa10));
        mlist.add(new photos(R.drawable.pa11));
        mlist.add(new photos(R.drawable.pa12));
        mlist.add(new photos(R.drawable.pa13));
        mlist.add(new photos(R.drawable.pa14));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}