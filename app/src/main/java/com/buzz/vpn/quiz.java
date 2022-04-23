package com.buzz.vpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        //initialize and assigning the variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);

        //set page selected
        bottomNavigationView.setSelectedItemId( R.id.quiz);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),
                                home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_learn:
                        startActivity(new Intent(getApplicationContext(),
                                learning.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_quiz:
                        return true;

                }
                return false;
            }
        });


    }
}