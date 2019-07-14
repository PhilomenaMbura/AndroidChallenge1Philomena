package com.example.android.androidchallenge1philomena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the about ALC
        Button aboutAlc = (Button) findViewById(R.id.aboutAlc);

        // Set a click listener on that View
        aboutAlc.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent alcIntent = new Intent(MainActivity.this, AlcActivity.class);
                startActivity(alcIntent);
            }
        });

       // Find the View that shows the Profile
        Button profile= (Button) findViewById(R.id.profile);
        
        // Set a click listener on that View
        profile.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(myProfile);
            }
        });
    }
}
