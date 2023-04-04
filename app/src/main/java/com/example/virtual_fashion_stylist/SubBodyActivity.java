package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class SubBodyActivity extends AppCompatActivity {


    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_body);
        imageSlider=findViewById(R.id.imageSlide);

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel ( R.drawable.img1, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img2, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img3, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img4, ScaleTypes.FIT));
        slideModels.add(new SlideModel ( R.drawable.img5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}