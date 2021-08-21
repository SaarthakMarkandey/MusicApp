package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntroScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        Button button1=findViewById(R.id.online_Btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(IntroScreen.this,OnlinePlayer.class);
                startActivity(intent1);
            }
        })
        ;
        Button button2=findViewById(R.id.offline_Btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(IntroScreen.this,MainActivity.class);
                startActivity(intent2);
            }
        })
        ;
    }
}