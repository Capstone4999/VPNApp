package com.buzz.vpn;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class learning_content extends Activity {

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }

    PDFView Pdfview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_content);



        Pdfview = (PDFView) findViewById(R.id.pdfview);

        Pdfview.fromAsset("Lesson.pdf").load();

        RelativeLayout scrollable = findViewById(R.id.scrollable);


        scrollable.setBackgroundColor(getResources().getColor(R.color.colorLightBackground));


    }
}
