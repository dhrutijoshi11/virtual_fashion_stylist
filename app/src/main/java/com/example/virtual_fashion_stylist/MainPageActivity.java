package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainPageActivity extends AppCompatActivity {

    Button button3;
    private ImageSlider imageSlider;
    Button btnInspirationLook, btnQandA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageSlider=findViewById(R.id.imageSlide);
        btnInspirationLook=findViewById(R.id.btnInspirationLook);
        btnQandA=findViewById(R.id.btnQandA);



        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel ( R.drawable.img1, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img2, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img3, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img4, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        Toolbar toolbar= findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        btnInspirationLook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, InspirationLook.class));
            }
        });

        btnQandA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, QandActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.user){
            Intent intent = new Intent(MainPageActivity.this,Profile.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}