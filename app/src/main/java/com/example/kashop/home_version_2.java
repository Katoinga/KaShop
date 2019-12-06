package com.example.kashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_version_2 extends AppCompatActivity {
    private Button barras;
    private Button product;
    private Button featured;
    private Button wish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_version_2);
        barras= (Button) findViewById(R.id.barr3);
        barras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });
        product= (Button) findViewById(R.id.product1);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetails();
            }
        });
        featured= (Button) findViewById(R.id.featured);
        featured.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeatured();
            }
        });
        wish= (Button) findViewById(R.id.wish);
        wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWish();
            }
        });
    }

    public void openMenu(){
        Intent intent =  new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void openDetails(){
        Intent intent =  new Intent(this, Item_Details_2.class);
        startActivity(intent);
    }
    public void openFeatured(){
        Intent intent =  new Intent(this, Featured.class);
        startActivity(intent);
    }
    public void openWish(){
        Intent intent =  new Intent(this, Wishlist.class);
        startActivity(intent);
    }
}
