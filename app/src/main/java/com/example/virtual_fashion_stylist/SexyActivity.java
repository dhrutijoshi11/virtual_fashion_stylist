package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SexyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexy);

        RecyclerView recyclerView=findViewById(R.id.sexy1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.s1));
        mlist.add(new photos(R.drawable.s2));
        mlist.add(new photos(R.drawable.s3));
        mlist.add(new photos(R.drawable.s4));
        mlist.add(new photos(R.drawable.s5));
        mlist.add(new photos(R.drawable.s6));
        mlist.add(new photos(R.drawable.s7));
        mlist.add(new photos(R.drawable.s8));
        mlist.add(new photos(R.drawable.s9));
        mlist.add(new photos(R.drawable.c10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}