package com.example.belajarandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     private int mCountFibo = 0;
    private int maxFibbo = 0;
    private int mCount = 0;
    private int sisaHitung = 0;
    private EditText mJumlah;
    private TextView showJumlah;
    private TextView mShowCountFibo;
    private Button buttonSimpan;
    private Button buttonHitung;
    private Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_activity);
        showJumlah = (TextView) findViewById(R.id.textViewJumlah);
        mJumlah = (EditText) findViewById(R.id.jumlah);
        mShowCountFibo = (TextView) findViewById(R.id.textViewNumberFibo);
        buttonSimpan = (Button) findViewById(R.id.button_simpan);
        buttonHitung = (Button) findViewById(R.id.button_hitung);
        buttonReset = (Button) findViewById(R.id.button_reset);

        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMaxFibbo(view);
            }
        });

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungSetFibbonacci(view);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetFibonacci(view);
            }
        });
    }


    public void setMaxFibbo(View view){
        maxFibbo = Integer.parseInt(mJumlah.getText().toString());
        sisaHitung = maxFibbo;
        showJumlah.setText(Integer.toString(maxFibbo));
    }

    public void hitungSetFibbonacci(View view){
        mCount++;
        sisaHitung--;

        StringBuilder sb = new StringBuilder();
        sb.append("Maximal hitung fibbonacci hanya : ");
        sb.append(maxFibbo);
        String textToast = sb.toString();

        if(mCount > maxFibbo){
            Toast.makeText(this, textToast, Toast.LENGTH_SHORT).show();
        }else{
            showJumlah.setText(Integer.toString(sisaHitung));
            mShowCountFibo.setTextColor(randomColor());
            int fibo = hitungFibonacci(mCount);
            mCountFibo = fibo;
            if( mShowCountFibo != null){
                mShowCountFibo.setText(Integer.toString(mCountFibo));
            }
        }

    }

    public int hitungFibonacci(int n){
        if(n <= 1){
            return n;
        }
        int prev = 0;
        int current = 1;
        for(int i = 2; i <= n; i++){
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public int randomColor(){
        Random random = new Random();
        return Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
    }

    public  void resetFibonacci(View view){
        mCount = 0;
        sisaHitung = maxFibbo;
        showJumlah.setText(Integer.toString(sisaHitung));
        mCountFibo = 0;
        mShowCountFibo.setText(Integer.toString(mCountFibo));
    }

}