package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class MainActivity9 extends AppCompatActivity {


    private AppCompatButton log;
    private String confText;
    private String passText;

    private EditText conf;
    private EditText pass;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        log = findViewById(R.id.lognew);
        passText = "";
        confText = "";

        conf = findViewById(R.id.confnew);
        pass = findViewById(R.id.passnew);

        conf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                confText = conf.getText().toString();
                passText = pass.getText().toString();
                Validation(confText, passText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                confText = conf.getText().toString();
                passText = pass.getText().toString();
                Validation(confText, passText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void Validation(String conf, String pass){
        if (conf.length()!=0 & pass.length() != 0 & pass.equals(conf)){
            log.setEnabled(true);
            log.setBackgroundColor(getColor(R.color.blur));
        } else{
            log.setEnabled(false);
            log.setBackgroundColor(getColor(R.color.gray));
        }
    }
}