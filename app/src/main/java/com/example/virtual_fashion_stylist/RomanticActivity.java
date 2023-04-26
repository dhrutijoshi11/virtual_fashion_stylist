package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RomanticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView=findViewById(R.id.romantic1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.r1));
        mlist.add(new photos(R.drawable.r2));
        mlist.add(new photos(R.drawable.r3));
        //mlist.add(new photos(R.drawable.r4));
        mlist.add(new photos(R.drawable.r5));
        mlist.add(new photos(R.drawable.r6));
        mlist.add(new photos(R.drawable.r7));
        mlist.add(new photos(R.drawable.r8));
        mlist.add(new photos(R.drawable.r9));
        mlist.add(new photos(R.drawable.r10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}