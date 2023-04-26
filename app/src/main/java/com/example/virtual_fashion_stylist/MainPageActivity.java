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

    Button btnInspirationLook, btnQandA, btnOutfit ;

    // This method is called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setting the content view to activity_main_page layout file
        setContentView(R.layout.activity_main_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageSlider=findViewById(R.id.imageSlide);
        btnInspirationLook=findViewById(R.id.btnInspirationLook);
        btnQandA=findViewById(R.id.btnQandA);
        btnOutfit = findViewById(R.id.btnOutfit);

        // Creating a list of slide models and adding images to it
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel ( R.drawable.im1, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im2, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im3, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im4, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im5, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im6, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.im7, ScaleTypes.FIT));
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

        btnOutfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPageActivity.this, OutfitSelectionActivity.class));
            }
        });

    }

    // This method is used to create the menu options for the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }

}