package com.example.fourseasonsanimationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable lightsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivFrame=findViewById(R.id.ivSeasons);
        ivFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation=(AnimationDrawable)ivFrame.getBackground();
        Button button1 = findViewById(R.id.btChange);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.start();
            }
        });
    }
}