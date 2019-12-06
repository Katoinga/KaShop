package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button cerrar;
    private Button home;
    private Button profile;
    private Button cart;
    private Button wish;
    private Button reports;
    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cerrar= (Button) findViewById(R.id.cerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        home= (Button) findViewById(R.id.menuhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        cart= (Button) findViewById(R.id.menucart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCart();
            }
        });
        wish= (Button) findViewById(R.id.menuwish);
        wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWish();
            }
        });
        reports= (Button) findViewById(R.id.menuchart);
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChart();
            }
        });
        settings= (Button) findViewById(R.id.menusett);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSett();
            }
        });
    }
    public void openCart(){
        Intent intent =  new Intent(this, cart.class);
        startActivity(intent);
    }
    public void openWish(){
        Intent intent =  new Intent(this, Wishlist.class);
        startActivity(intent);
    }
    public void openChart(){
        Intent intent =  new Intent(this, Reports.class);
        startActivity(intent);
    }
    public void openSett(){
        Intent intent =  new Intent(this, Settings.class);
        startActivity(intent);
    }

}
