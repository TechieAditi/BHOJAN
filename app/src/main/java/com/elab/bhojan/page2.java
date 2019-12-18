package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
Button str;
Button mc;
Button bvg;
Button des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        str=(Button)findViewById(R.id.str);
        mc=(Button)findViewById(R.id.mc);
        bvg=(Button)findViewById(R.id.bvg);
        des=(Button)findViewById(R.id.des);
        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),starter.class);
                startActivity(i);
            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),maincourse.class);
                startActivity(i);
            }
        });
        bvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),bevrage.class);
                startActivity(i);

            }
        });
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),dessert.class);
                startActivity(i);
            }
        });
    }
}
