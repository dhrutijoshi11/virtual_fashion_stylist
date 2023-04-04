package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class InspirationLook extends AppCompatActivity {

    //private ViewPager2 viewPager2;-->

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration_look);

        Button button1 = findViewById(R.id.button4);
        Button button2 = findViewById(R.id.button5);
        Button button3 = findViewById(R.id.button6);
        Button button4 = findViewById(R.id.button12);
        Button button5 = findViewById(R.id.button14);
        Button button6 = findViewById(R.id.button8);
        Button button7 = findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, CasualActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, ClassicActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, ElegantActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, RomanticActivity.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, SexyActivity.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, CreativeActivity.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(InspirationLook.this, TrendyActivity.class);
                startActivity(intent);
            }
        });
        /*viewPager2 = findViewById(R.id.viewPagerImageslider);
        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.img1));
        sliderItems.add(new SliderItem(R.drawable.img2));
        sliderItems.add(new SliderItem(R.drawable.img3));
        sliderItems.add(new SliderItem(R.drawable.img4)) ;
        sliderItems.add(new SliderItem(R.drawable.img5)) ;
        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));*/
    }
}