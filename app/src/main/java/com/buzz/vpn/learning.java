package com.buzz.vpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class learning extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        ImageButton imageView3;
        ImageButton imageView5;
        ImageButton imageView6;
        imageView3 = (ImageButton)findViewById(R.id.imageView3);
        imageView5 = (ImageButton)findViewById(R.id.imageView5);
        imageView6 = (ImageButton)findViewById(R.id.imageView6);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewPage = new Intent(learning.this, learning_content.class);
                startActivity(intentLoadNewPage);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewPage = new Intent(learning.this, learning_content_1.class);
                startActivity(intentLoadNewPage);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewPage = new Intent(learning.this, learning_content_2.class);
                startActivity(intentLoadNewPage);
            }
        });

        //initialize and assigning the variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);

        //set page selected
        bottomNavigationView.setSelectedItemId( R.id.learning);

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