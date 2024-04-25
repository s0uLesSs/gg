package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
    }
    public void Right(View v){
        Intent intent = new Intent(this, MainActivity18.class);
        startActivity(intent);
    }
    public void OpenChat (View v){
        Intent intent = new Intent(this, MainActivity20.class);
        startActivity(intent);
    }
}

