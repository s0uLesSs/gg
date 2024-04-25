package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);


    }

    public void Home(View view) {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    public void Next(View view) {
        EditText address = findViewById(R.id.address);
        EditText town = findViewById(R.id.town);
        EditText phoneinfo = findViewById(R.id.phoneinfo);

        EditText addresspoint1 = findViewById(R.id.addresspoint1);
        EditText townpoint1 = findViewById(R.id.townpoint1);
        EditText phoneinfopoint1 = findViewById(R.id.phoneinfopoint1);

        EditText items = findViewById(R.id.items);
        EditText weightit = findViewById(R.id.weightpack);
        EditText worthit = findViewById(R.id.worthpack);

        Intent intent = new Intent(this, prog.class);
        String placetext = address.getText().toString() + " " + town.getText().toString();
        String placetracktext = addresspoint1.getText().toString() + " " + townpoint1.getText().toString();
        intent.putExtra("place", placetext);
        intent.putExtra("phon", phoneinfo.getText().toString());
        intent.putExtra("placetrakc", placetracktext);
        intent.putExtra("phonetrack", phoneinfopoint1.getText().toString());
        intent.putExtra("item", items.getText().toString());
        intent.putExtra("weight", weightit.getText().toString());
        intent.putExtra("worth", worthit.getText().toString());

        startActivity(intent);
    }

}