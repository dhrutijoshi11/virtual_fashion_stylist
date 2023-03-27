package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class InspirationLook extends AppCompatActivity {

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration_look);
        viewPager2 = findViewById(R.id.viewPagerImageslider);
        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.img1));
        sliderItems.add(new SliderItem(R.drawable.img2));
        sliderItems.add(new SliderItem(R.drawable.img3));
        sliderItems.add(new SliderItem(R.drawable.img4)) ;
        sliderItems.add(new SliderItem(R.drawable.img5)) ;
        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));
    }
}