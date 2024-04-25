package com.example.myapplication;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    private AppCompatButton login;
    private CheckBox terms;
    private String fioText;
    private String phoneText;
    private String emailText;
    private String passText;
    private String confText;
    private EditText email;
    private EditText fio;
    private EditText phone;
    private EditText pass;
    private EditText conf;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        login = findViewById(R.id.buttonLogin);
        fioText = "";
        phoneText = "";
        emailText = "";
        passText = "";
        confText = "";

        email = findViewById(R.id.EmailAddress);
        fio = findViewById(R.id.Fio);
        phone = findViewById(R.id.Phone);
        pass = findViewById(R.id.pass);
        conf = findViewById(R.id.conf);
        terms = findViewById(R.id.checkBoxLogin);



        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                Validation(emailText, terms);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        terms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                emailText = email.getText().toString();
                Validation(emailText, terms);
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                fioText = fio.getText().toString();
                phoneText = phone.getText().toString();
                passText = pass.getText().toString();
                confText = conf.getText().toString();





                if(fioText.length() != 0 & Patterns.PHONE.matcher(phoneText).matches() & passText.length() != 0 & confText.length() != 0 & passText.equals(confText)){
                    Intent intent = new Intent(MainActivity5.this, MainActivity5.class);
                    startActivity(intent);
                }
                if(fioText.length() == 0) {
                    fio.setBackground(getDrawable(R.drawable.radius_sqvare_red));
                } else {
                    fio.setBackground(getDrawable(R.drawable.radius_sqvare));
                }
                if(Patterns.PHONE.matcher(phoneText).matches()) {
                    phone.setBackground(getDrawable(R.drawable.radius_sqvare));
                } else {
                    phone.setBackground(getDrawable(R.drawable.radius_sqvare_red));
                }
                if(passText.length() == 0 || !passText.equals(confText)) {
                    pass.setBackground(getDrawable(R.drawable.radius_sqvare_red));
                } else {
                    pass.setBackground(getDrawable(R.drawable.radius_sqvare));
                }
                if(confText.length() == 0 || !passText.equals(confText)) {
                    conf.setBackground(getDrawable(R.drawable.radius_sqvare_red));
                } else {
                    conf.setBackground(getDrawable(R.drawable.radius_sqvare));
                }
            }
        });




    }
    public void Validation(String email, CheckBox view){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches() & view.isChecked()){
            login.setEnabled(true);
            login.setBackgroundColor(getColor(R.color.blur));
        } else{
            login.setEnabled(false);
            login.setBackgroundColor(getColor(R.color.gray));
        }
    }
    public void LogIn(View v){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void signUp(View view) {
         Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
}