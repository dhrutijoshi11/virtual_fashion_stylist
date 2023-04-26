package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formal);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView=findViewById(R.id.formal);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.f1));
        mlist.add(new photos(R.drawable.f2));
        mlist.add(new photos(R.drawable.f3));
        mlist.add(new photos(R.drawable.f4));
        mlist.add(new photos(R.drawable.f5));
        mlist.add(new photos(R.drawable.f6));
        mlist.add(new photos(R.drawable.f7));
        mlist.add(new photos(R.drawable.f8));
        mlist.add(new photos(R.drawable.f9));
        mlist.add(new photos(R.drawable.f10));
        mlist.add(new photos(R.drawable.f11));
        mlist.add(new photos(R.drawable.f12));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}