package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TrendyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trendy);
        RecyclerView recyclerView=findViewById(R.id.trendy1);
        recyclerView.setHasFixedSize(true);

        List<photos> mlist = new ArrayList<>();
        mlist.add(new photos(R.drawable.t1));
        mlist.add(new photos(R.drawable.t2));
        mlist.add(new photos(R.drawable.t3));
        mlist.add(new photos(R.drawable.t4));
        mlist.add(new photos(R.drawable.t5));
        mlist.add(new photos(R.drawable.t6));
        mlist.add(new photos(R.drawable.t7));
        mlist.add(new photos(R.drawable.t8));
        mlist.add(new photos(R.drawable.t9));
        mlist.add(new photos(R.drawable.t10));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        photosAdapter adapter= new photosAdapter(mlist);

        recyclerView.setAdapter(adapter);
    }
}