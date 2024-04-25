package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
    public void Notification(View v){
        Intent intent = new Intent(this, MainActivity13.class);
         startActivity(intent);
    }
    public void Card(View v){
        Intent intent = new Intent(this, MainActivity12.class);
         startActivity(intent);
    }
    public void Send(View v){
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);
    }

    public void Logout(View v){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void Home(View v) {
        Intent intent = new Intent(this, MainActivity18.class);
        startActivity(intent);
    }

    public void Walet(View v) {
        Intent intent = new Intent(this, MainActivity17.class);
        startActivity(intent);
    }

    public void Track(View v) {
        Intent intent = new Intent(this, MainActivity16.class);
        startActivity(intent);
    }
}