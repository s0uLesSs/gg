package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class MainActivity6 extends AppCompatActivity {

    private AppCompatButton log;
    private String emailText;
    private String passText;

    private EditText email;
    private EditText pass;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        log = findViewById(R.id.log);
        passText = "";
        emailText = "";

        email = findViewById(R.id.editTextTextEmailAddresslog1);
        pass = findViewById(R.id.passlog);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                Validation(emailText, passText);
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
                emailText = email.getText().toString();
                passText = pass.getText().toString();
                Validation(emailText, passText);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void SingUp(View v){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void Login(View v){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    public void Forgot(View v){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void Validation(String email, String pass){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches() & pass.length() != 0){
            log.setEnabled(true);
            log.setBackgroundColor(getColor(R.color.blur));
        } else{
            log.setEnabled(false);
            log.setBackgroundColor(getColor(R.color.gray));
        }
    }
}