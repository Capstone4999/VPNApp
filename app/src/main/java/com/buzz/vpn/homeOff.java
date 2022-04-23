package com.buzz.vpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class homeOff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_off);

        //code for turn on and off button
        //initialize image button
        ImageButton imageButton;
        //set the image button
        imageButton = (ImageButton)findViewById(R.id.vpn_image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewPage = new Intent(homeOff.this, home.class);
                startActivity(intentLoadNewPage);
            }
        });

        //this is the java code for bottom navigation bar
        //initialize and assigning the variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        //set page selected
        bottomNavigationView.setSelectedItemId( R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:
                        return true;
                    case R.id.nav_learn:
                        startActivity(new Intent(getApplicationContext(),
                                learning.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_quiz:
                        startActivity(new Intent(getApplicationContext(),
                                quiz.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });




    }
}