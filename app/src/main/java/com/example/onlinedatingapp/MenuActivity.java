package com.example.onlinedatingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView image1 = (ImageView) findViewById(R.id.profile1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfileActivity("Running");
            }
        });

        ImageView image2 = (ImageView) findViewById(R.id.profile2);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfileActivity("Angry");
            }
        });

        ImageView image3 = (ImageView) findViewById(R.id.profile3);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfileActivity("Silent");
            }
        });

        ImageView image4 = (ImageView) findViewById(R.id.profile4);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfileActivity("Happy");
            }
        });
    }

    public void openUserProfileActivity(String name) {
        Intent intent = new Intent(this, DateActivity.class);
        intent.putExtra("profile", name);
        startActivity(intent);
    }
}
