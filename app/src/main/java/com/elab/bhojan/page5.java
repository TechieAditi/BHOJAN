package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class page5 extends AppCompatActivity {
public SeekBar seek1;
public SeekBar seek2;
public Button btn;
public TextView seek;
public TextView seektext;
public RadioGroup rg11;
    public RadioGroup rg2;
    public RadioGroup rg3;
    public RadioGroup rg4;
    public RadioGroup rg55;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        seek1=(SeekBar)findViewById(R.id.seek1);
        seek2=(SeekBar)findViewById(R.id.seek2);
        seek=(TextView)findViewById(R.id.seek);
        seektext=(TextView)findViewById(R.id.seektext);
        rg11=(RadioGroup)findViewById(R.id.rg1);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        rg3=(RadioGroup)findViewById(R.id.rg3);
        rg4=(RadioGroup)findViewById(R.id.rg4);
        rg55=(RadioGroup)findViewById(R.id.rg5);
        btn=(Button)findViewById(R.id.submit);
        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seektext.setText(String.valueOf(seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            seek.setText(String.valueOf(seekBar.getProgress()));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            rg11.clearCheck();
            rg2.clearCheck();
            rg3.clearCheck();
            rg4.clearCheck();
            rg55.clearCheck();
            seektext.setText("");
            seek.setText("");
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Thank you for your time",Toast.LENGTH_LONG).show();
        }
    });

    }
}
