package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity18 extends AppCompatActivity {

    public void Chats (View v){
        Intent intent = new Intent(this, MainActivity19.class);
        startActivity(intent);
    }
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        imgButton4 = (ImageButton) findViewById(R.id.ImageButton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity18.this, MainActivity17.class);
                startActivities(new Intent[]{intent});

            }
        });

        imgButton5 = (ImageButton) findViewById(R.id.track);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity18.this, MainActivity16.class);
                startActivities(new Intent[]{intent});

            }
        });
        imgButton6 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity18.this, MainActivity11.class);
                startActivities(new Intent[]{intent});

            }
        });


    }
}