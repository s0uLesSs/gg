package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity12 extends AppCompatActivity {

    private RadioButton check1, check2, check3, check4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        check1 = findViewById(R.id.radioButton);
        check2 = findViewById(R.id.radioButton2);
        check3 = findViewById(R.id.radioButton3);
        check4 = findViewById(R.id.radioButton4);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    check2.setChecked(false);
                    check3.setChecked(false);
                    check4.setChecked(false);
                }
            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // No need for action here, as it's handled by check3 and check4
                }
            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    check2.setChecked(true);
                    check1.setChecked(false);
                    check4.setChecked(false);
                }
            }
        });

        check4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    check2.setChecked(true);
                    check3.setChecked(false);
                    check1.setChecked(false);
                }
            }
        });
    }

    public void strelka(View v) {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
}
