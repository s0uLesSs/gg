package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class prog extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
        TextView place = findViewById(R.id.place);
        TextView phon = findViewById(R.id.phon);
        TextView placetrakc = findViewById(R.id.placetrakc);
        TextView phonetrack = findViewById(R.id.phonetrack);
        TextView weight = findViewById(R.id.weight);
        TextView worth = findViewById(R.id.worth);
        TextView item = findViewById(R.id.item);

        Bundle arg = getIntent().getExtras();

        place.setText(arg.getString("place"));
        phon.setText(arg.getString("phon"));
        placetrakc.setText(arg.getString("placetrakc"));
        phonetrack.setText(arg.getString("phonetrack"));
        weight.setText(arg.getString("weight"));
        worth.setText(arg.getString("worth"));
        item.setText(arg.getString("item"));
    }

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
    public void Back(View v){
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);
    }

    public void Make(View v){
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);
    }
}