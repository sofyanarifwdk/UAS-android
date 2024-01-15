package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SinaidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_sinaida);
    }
}