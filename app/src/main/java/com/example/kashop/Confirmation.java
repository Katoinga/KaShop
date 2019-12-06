package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirmation extends AppCompatActivity {
    private Button continu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        continu= findViewById(R.id.bconf);
        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();
            }
        });

    }
    public void openNext(){
        Intent intent =  new Intent(this, home_version_2.class);
        startActivity(intent);
    }
}
