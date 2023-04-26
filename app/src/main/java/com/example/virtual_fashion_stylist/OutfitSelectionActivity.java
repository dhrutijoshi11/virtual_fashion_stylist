package com.example.virtual_fashion_stylist;// Import necessary classes and packages
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.virtual_fashion_stylist.OutfitSuggestionsActivity;
import com.example.virtual_fashion_stylist.R;

// Define a class called OutfitSelectionActivity that extends AppCompatActivity
public class OutfitSelectionActivity extends AppCompatActivity {

    // Declare variables to reference UI elements
    RadioGroup eventRadioGroup;
    Button nextButton;

    // This method is called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for this activity
        setContentView(R.layout.activity_outfit_selection);

        // Set the support toolbar for this activity
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find references to the radio group and next button
        eventRadioGroup = findViewById(R.id.eventRadioGroup);
        nextButton = findViewById(R.id.nextButton);

        // Set an onClickListener for the next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the ID of the selected radio button
                int selectedRadioButtonId = eventRadioGroup.getCheckedRadioButtonId();
                // Find the selected radio button by its ID
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                // Get the text of the selected radio button
                String eventCategory = selectedRadioButton.getText().toString();

                // Create an intent to start the OutfitSuggestionsActivity
                Intent intent = new Intent(OutfitSelectionActivity.this, OutfitSuggestionsActivity.class);
                // Add the selected event category as an extra to the intent
                intent.putExtra("eventCategory", eventCategory);
                // Start the OutfitSuggestionsActivity
                startActivity(intent);
            }
        });
    }
}
