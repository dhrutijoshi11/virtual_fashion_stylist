package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic);

        RecyclerView recyclerView=findViewById(R.id.classic1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.cl1));
        mlist.add(new photos(R.drawable.cl2));
        mlist.add(new photos(R.drawable.cl3));
        mlist.add(new photos(R.drawable.cl4));
        mlist.add(new photos(R.drawable.cl5));
        mlist.add(new photos(R.drawable.cl6));
        mlist.add(new photos(R.drawable.cl7));
        mlist.add(new photos(R.drawable.cl8));
        mlist.add(new photos(R.drawable.cl9));
        mlist.add(new photos(R.drawable.cl10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}