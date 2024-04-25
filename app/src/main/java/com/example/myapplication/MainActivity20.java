package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }

    public void Back (View v){
        Intent intent = new Intent(this, MainActivity19.class);
        startActivity(intent);
    }

    public void Go_tophon (View v){
        Intent intent = new Intent(this, MainActivity21.class);
        startActivity(intent);
    }
}