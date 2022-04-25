package com.buzz.vpn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.github.barteksc.pdfviewer.PDFView;

public class learning_content_1 extends Activity {

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

        Pdfview.fromAsset("Lesson_1.pdf").load();

        RelativeLayout scrollable = findViewById(R.id.scrollable);


        scrollable.setBackgroundColor(getResources().getColor(R.color.colorLightBackground));


    }
}