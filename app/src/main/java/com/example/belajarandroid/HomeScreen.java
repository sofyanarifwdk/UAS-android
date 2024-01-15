package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    Button button_hello;
    Button button_count;
    Button button_fibonacci;
    Button button_sinaida;
    Button button_twoactivity;
    Button button_alarm;
    Button button_maps;
    Uri geoLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        button_hello = (Button) findViewById(R.id.to_hello);
        button_hello.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Intent intent_hello = new Intent(HomeScreen.this, HelloActivity.class);
                startActivity(intent_hello);
             }
         });

        button_count = (Button) findViewById(R.id.to_count);
        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_count = new Intent(HomeScreen.this, CountActivity.class);
                startActivity(intent_count);
            }
        });

        button_twoactivity = (Button) findViewById(R.id.to_twoactivity);
        button_twoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_twoactivity = new Intent(HomeScreen.this, TwoActivity.class);
                startActivity(intent_twoactivity);
            }
        });

        button_sinaida = (Button) findViewById(R.id.to_sianida);
        button_sinaida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_sinaida = new Intent(HomeScreen.this, SinaidaActivity.class);
                startActivity(intent_sinaida);
            }
        });

        button_fibonacci = (Button) findViewById(R.id.to_fibonacci);
        button_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_fibonacci = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent_fibonacci);
            }
        });

        button_alarm = (Button) findViewById(R.id.to_alarm);
        button_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_alarm = new Intent(HomeScreen.this, AlarmActivity.class);
                startActivity(intent_alarm);
            }
        });

        button_maps = (Button) findViewById(R.id.to_map);
        button_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

}