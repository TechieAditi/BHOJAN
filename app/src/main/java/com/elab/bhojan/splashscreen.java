package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.widget.ImageView;

import com.elab.bhojan.R;

public class splashscreen extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        img=(ImageView)findViewById(R.id.img);
        final Handler loadingHandler =new Handler();
        new Handler().postDelayed(new Runnable() {



            int loadingImgIndex = 0;

            @Override
            public void run() {


                Intent i = new Intent(splashscreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 1500);
    }
}








