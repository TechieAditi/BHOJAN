package com.elab.bhojan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
Button menu;
Button vibe;
Button bill;
Button rate;
private FirebaseAuth mauth;
private DatabaseReference rootref;
private FirebaseUser currentuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu=(Button)findViewById(R.id.menu);
        vibe=(Button)findViewById(R.id.gallery);
        bill=(Button)findViewById(R.id.bill);
        rate=(Button)findViewById(R.id.rate);
        mauth=FirebaseAuth.getInstance();
        currentuser=mauth.getCurrentUser();
        rootref= FirebaseDatabase.getInstance().getReference();
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
    @Override
    protected void onStart() {
        super.onStart();
        if(currentuser==null)
        {
            sendUsertologinactivity();
            finish();
        }
        else
        {

        }

    }

    private void sendUsertologinactivity() {
        Intent loginintent=new Intent(MainActivity.this,Loginactivity.class);
        loginintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginintent);
        finish();
    }

}
