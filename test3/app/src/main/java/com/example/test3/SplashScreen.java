package com.example.test3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        GifImageView gif=findViewById(R.id.gif);
        gif.setAlpha(0f);
        gif.animate().setDuration(5000).alpha(1f).withEndAction(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,IntroScreen.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();

            }
        });
    }
}