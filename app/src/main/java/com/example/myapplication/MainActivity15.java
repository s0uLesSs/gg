package com.example.myapplication;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity15 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        ImageView anim = findViewById(R.id.anim);

        anim.setBackgroundResource(R.drawable.anim);

        AnimationDrawable frameAnimation = (AnimationDrawable) anim.getBackground();

        new CountDownTimer(1250, 1000) {

            public void onTick(long millisUntilFinished) {
                frameAnimation.start();
            }

            public void onFinish() {
                frameAnimation.stop();
                anim.setBackground(getDrawable(R.drawable.sucsesfultwo));
                TextView suc = findViewById(R.id.confirm);
                suc.setText("Transaction Successful");
            }

        }.start();

    }

    public void Track(View v){
        Intent intent = new Intent(this, MainActivity16.class);
        startActivity(intent);
    }

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
}