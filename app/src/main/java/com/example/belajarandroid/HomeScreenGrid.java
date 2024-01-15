package com.example.belajarandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeScreenGrid extends AppCompatActivity {

    CardView button_hello;
    CardView button_count;
    CardView button_tab;
    CardView button_fibonacci;
    CardView button_sinaida;
    CardView button_twoactivity;
    CardView button_alarm;
    CardView button_maps;
    Uri geoLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_grid);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        button_hello = (CardView) findViewById(R.id.to_hello);
        button_hello.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Intent intent_hello = new Intent(HomeScreenGrid.this, HelloActivity.class);
                startActivity(intent_hello);
             }
         });

        button_count = (CardView) findViewById(R.id.to_count);
        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_count = new Intent(HomeScreenGrid.this, CountActivity.class);
                startActivity(intent_count);
            }
        });

        button_twoactivity = (CardView) findViewById(R.id.to_twoactivity);
        button_twoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_twoactivity = new Intent(HomeScreenGrid.this, TwoActivity.class);
                startActivity(intent_twoactivity);
            }
        });

        button_sinaida = (CardView) findViewById(R.id.to_sianida);
        button_sinaida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_sinaida = new Intent(HomeScreenGrid.this, SinaidaActivity.class);
                startActivity(intent_sinaida);
            }
        });

        button_fibonacci = (CardView) findViewById(R.id.to_fibonacci);
        button_fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_fibonacci = new Intent(HomeScreenGrid.this, MainActivity.class);
                startActivity(intent_fibonacci);
            }
        });


        button_alarm = (CardView) findViewById(R.id.to_alarm);
        button_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_alarm = new Intent(HomeScreenGrid.this, AlarmActivity.class);
                startActivity(intent_alarm);
            }
        });


        button_tab = (CardView) findViewById(R.id.to_tab);
        button_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_tab = new Intent(HomeScreenGrid.this, TabsActivity.class);
                startActivity(intent_tab);
            }
        });

        button_maps = (CardView) findViewById(R.id.to_map);
        button_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double latitude = 106.992416;
                double longitude = -6.241586;
                String label = "Bekasi, Indonesia";
                String location = "geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(" + label + ")";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(location));
//                startActivity(intent);
//                Intent intent = new Intent(Intent.ACTION_M);
//                intent.setData(geoLocation);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

}