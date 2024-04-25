package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
public class MainActivity8 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        final int[] time = {30};
        TextView timer = findViewById(R.id.timer);

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("seconds remaining: " + time[0]);
                time[0]--;
                // logic to set the EditText could go here
            }

            public void onFinish() {
                timer.setText("done!");
            }

        }.start();
    }
}