package com.buzz.vpn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class learning_content_2 extends Activity{

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_content);

        TextView textView2 = findViewById(R.id.textView2);
        TextView textView6 = findViewById(R.id.textView6);

        Typeface RobotoRegular = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        Typeface RobotoMedium = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");

        textView2.setTypeface(RobotoMedium);
        textView6.setTypeface(RobotoMedium);

        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView8 = findViewById(R.id.imageView8);


        RelativeLayout relativelayout = findViewById(R.id.relativelayout);
        LinearLayout linearlayout = findViewById(R.id.Linearlayout);


        relativelayout.setBackgroundColor(getResources().getColor(R.color.colorLightBackground));
        linearlayout.setBackgroundColor(getResources().getColor(R.color.colorLightBackground));
        textView2.setTextColor(getResources().getColor(R.color.colorLightText));
        textView6.setTextColor(getResources().getColor(R.color.colorLightText));
        imageView4.setImageResource(R.drawable.unsplash_jjjsppzzpku3);
        imageView8.setImageResource(R.drawable.unsplash_89xup_xmyrac);

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