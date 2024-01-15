package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CountActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonToast;
    private Button buttonHitung;
    private Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        mShowCount = (TextView) findViewById(R.id.textViewNumber);
        buttonToast = (Button) findViewById(R.id.button_toast);
        buttonHitung = (Button) findViewById(R.id.button_hitung);
        buttonReset = (Button) findViewById(R.id.button_reset);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CountActivity.this, "Selamat datang di AdamApps", Toast.LENGTH_SHORT).show();
            }
        });

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                mShowCount.setTextColor(randomColor());
                if( mShowCount != null){
                    mShowCount.setText(Integer.toString(mCount));
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));
            }
        });
    }

    public int randomColor(){
        Random random = new Random();
        return Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }


}