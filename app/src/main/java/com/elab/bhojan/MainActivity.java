package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button menu;
Button vibe;
Button bill;
Button rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu=(Button)findViewById(R.id.menu);
        vibe=(Button)findViewById(R.id.gallery);
        bill=(Button)findViewById(R.id.bill);
        rate=(Button)findViewById(R.id.rate);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),page2.class);
                startActivity(i);
            }
        });
        vibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),page3.class);
                startActivity(i);
            }
        });
        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),page4.class);
                startActivity(i);
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),page5.class);
                startActivity(i);
            }
        });



    }
}
