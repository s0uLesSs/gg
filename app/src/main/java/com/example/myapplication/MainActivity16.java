package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity16 extends AppCompatActivity {
    public void button5 (View v) {
        Intent intent = new Intent(this, prog.class);
        startActivity(intent);
    }
    ImageButton imgButton20;
    ImageButton imgButton21;
    ImageButton imgButton22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        imgButton20 = (ImageButton) findViewById(R.id.home);

        imgButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity16.this, MainActivity18.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton21 = (ImageButton) findViewById(R.id.walet);

        imgButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity16.this, MainActivity17.class);
                startActivities(new Intent[]{intent});

            }
        });


        imgButton22 = (ImageButton) findViewById(R.id.imageButton16);

        imgButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity16.this, MainActivity11.class);
                startActivities(new Intent[]{intent});

            }
        });



    }
}