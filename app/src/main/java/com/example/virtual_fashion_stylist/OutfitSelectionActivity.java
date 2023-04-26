package com.example.virtual_fashion_stylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class OutfitSelectionActivity extends AppCompatActivity {


    RadioGroup eventRadioGroup;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit_selection);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        eventRadioGroup = findViewById(R.id.eventRadioGroup);
        nextButton = findViewById(R.id.nextButton);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedRadioButtonId = eventRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                String eventCategory = selectedRadioButton.getText().toString();

                Intent intent = new Intent(OutfitSelectionActivity.this, OutfitSuggestionsActivity.class);
                intent.putExtra("eventCategory", eventCategory);
                startActivity(intent);
            }
        });
    }
}