package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.window.SplashScreen;

public class splashscreen extends AppCompatActivity {
    private static final long SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIMEOUT);
    }
}