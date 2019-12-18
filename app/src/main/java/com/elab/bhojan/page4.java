package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page4 extends AppCompatActivity {
Button cash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page4);
        cash=(Button)findViewById(R.id.cash);
        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Please pay at out counter",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
        public void openbrowser(View v1)
        {
            String url="www.paytm.com";
            Uri u=Uri.parse("http://"+url);
            Intent i =new Intent(Intent.ACTION_VIEW,u);
            startActivity(i);

        }
    public void openphonepe(View v1)
    {
        String url="www.phonepe.com";
        Uri u=Uri.parse("http://"+url);
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);

    }
}
