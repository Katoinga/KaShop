package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstScreen extends AppCompatActivity {
    private Button button;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        button= findViewById(R.id.blogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity2();
            }
        });
    }
    public void openNextActivity(){
        Intent intent =  new Intent(this, Login.class);
        startActivity(intent);
    }
    public void openNextActivity2(){
        Intent intent =  new Intent(this, Signup.class);
        startActivity(intent);
    }
}
