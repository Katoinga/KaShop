package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button buttonLogin;
    private Button buttonForgot;
    private Button buttonSignup;
    private Button arrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonLogin= findViewById(R.id.buttonlogin);
        buttonSignup= findViewById(R.id.buttonsignup);
        buttonForgot= findViewById(R.id.buttonrecover);
        buttonForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgot();
            }
        });
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignup();
            }
        });
        arrow= findViewById(R.id.backblog);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void openForgot(){
        Intent intent =  new Intent(this, Forgot.class);
        startActivity(intent);
    }
    public void openSignup(){
        Intent intent =  new Intent(this, Signup.class);
        startActivity(intent);
    }
}
