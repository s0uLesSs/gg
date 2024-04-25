package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.transition.Hold;

public class MainActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity(intent);
               finish();
            }
        }, 2000);
    }
        public void onClick(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    }