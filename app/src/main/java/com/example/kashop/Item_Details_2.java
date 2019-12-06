package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item_Details_2 extends AppCompatActivity {
    private Button arrow;
    private Button continu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__details_2);
        arrow= findViewById(R.id.btn_atras);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        continu= findViewById(R.id.tocart);
        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();
            }
        });
    }
    public void openNext(){
        Intent intent =  new Intent(this, cart.class);
        startActivity(intent);
    }
}
