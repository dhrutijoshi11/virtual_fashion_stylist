package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CreativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView=findViewById(R.id.creative1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.cr1));
        mlist.add(new photos(R.drawable.cr2));
        mlist.add(new photos(R.drawable.cr3));
        mlist.add(new photos(R.drawable.cr4));
        mlist.add(new photos(R.drawable.cr5));
        mlist.add(new photos(R.drawable.cr6));
        mlist.add(new photos(R.drawable.cr7));
        mlist.add(new photos(R.drawable.cr8));
        mlist.add(new photos(R.drawable.cr9));
        mlist.add(new photos(R.drawable.cr10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}