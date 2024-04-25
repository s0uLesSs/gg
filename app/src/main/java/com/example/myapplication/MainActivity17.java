package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity17 extends AppCompatActivity {


    ImageButton imgButton10;
    ImageButton imgButton12;
    ImageButton imgButton14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        imgButton10 = (ImageButton) findViewById(R.id.home);

        imgButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity17.this, MainActivity18.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton12 = (ImageButton) findViewById(R.id.track);

        imgButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity17.this, MainActivity16.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton14 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity17.this,MainActivity11.class);
                startActivities(new Intent[]{intent});

            }
        });







    }
}