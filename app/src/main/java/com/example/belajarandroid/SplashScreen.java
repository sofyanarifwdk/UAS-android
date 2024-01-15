package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        View viewLayout = getWindow().getDecorView();

        viewLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,HomeScreenGrid.class);
                startActivity(intent);
                finish();
            }
        },10000);
    }
}