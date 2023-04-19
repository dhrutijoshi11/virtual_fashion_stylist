package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ElegantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegant);

        RecyclerView recyclerView=findViewById(R.id.elegant1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.e1));
        mlist.add(new photos(R.drawable.e2));
        mlist.add(new photos(R.drawable.e3));
        mlist.add(new photos(R.drawable.e4));
        mlist.add(new photos(R.drawable.e5));
        mlist.add(new photos(R.drawable.e6));
        mlist.add(new photos(R.drawable.e7));
        mlist.add(new photos(R.drawable.e8));
        mlist.add(new photos(R.drawable.e9));
        mlist.add(new photos(R.drawable.e10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}