package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkout extends AppCompatActivity {
    private Button arrow;
    private Button continu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        arrow= findViewById(R.id.backb);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        continu= findViewById(R.id.comprar);
        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();
            }
        });
    }
    public void openNext(){
        Intent intent =  new Intent(this, Confirmation.class);
        startActivity(intent);
    }
}
