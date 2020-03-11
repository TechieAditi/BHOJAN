package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.listitem;

public class bevrage extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<listitem> listitems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        recyclerView=(RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listitems=new ArrayList<>();
        listitem item1=new listitem("Blue Lagoon","Rs.120","0");
        listitems.add(item1);
        listitem item13=new listitem("Marghreetta","Rs.120","0");
        listitems.add(item13);
        listitem item14=new listitem("CoolBerg:Mint","Rs.120","0");
        listitems.add(item14);
        listitem item2=new listitem("CoolBerg:Malt","Rs.130","0");
        listitems.add(item2);
        listitem item3=new listitem("Rum","Rs.250","0");
        listitems.add(item3);
        listitem item4=new listitem("Scotch","Rs.300","0");
        listitems.add(item4);
        listitem item5=new listitem("Ginger Tea","Rs.40","0");
        listitems.add(item5);
        listitem item6=new listitem("Green Tea","Rs.40","0");
        listitems.add(item6);
        listitem item7=new listitem("Elaichi Tea","Rs.30","0");
        listitems.add(item7);
        listitem item8=new listitem("Black tea","Rs.30","0");
        listitems.add(item8);
        listitem item9=new listitem("Coffee","Rs.40","0");
        listitems.add(item9);
        listitem item10=new listitem("Black Coffee","Rs.40","0");
        listitems.add(item10);
        listitem item11=new listitem("Cold Coffee","Rs.50","0");
        listitems.add(item11);
        listitem item12=new listitem("Capaccuino","Rs.150","0");
        listitems.add(item12);

        adapter=new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);
    }
}
