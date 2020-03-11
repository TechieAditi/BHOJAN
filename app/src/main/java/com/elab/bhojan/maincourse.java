package com.elab.bhojan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.listitem;

public class maincourse extends AppCompatActivity {

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
        listitem item1=new listitem("Manchow veg","Rs.130","0");
        listitems.add(item1);
        listitem item13=new listitem("Veg kofta","Rs.120","0");
        listitems.add(item13);
        listitem item14=new listitem("Potato in Hot Garlic ","Rs.120","0");
        listitems.add(item14);
        listitem item2=new listitem("Dal fry","Rs.130","0");
        listitems.add(item2);
        listitem item3=new listitem("Dal Makhani","Rs.150","0");
        listitems.add(item3);
        listitem item4=new listitem("Kadhai Mushroom","Rs.100","0");
        listitems.add(item4);
        listitem item5=new listitem("Kadhai Paneer","Rs.140","0");
        listitems.add(item5);
        listitem item6=new listitem("Manchurain with gravy","Rs.120","0");
        listitems.add(item6);
        listitem item7=new listitem("Palak Paneer","Rs.130","0");
        listitems.add(item7);
        listitem item8=new listitem("Shahe Tukra","Rs.110","0");
        listitems.add(item8);
        listitem item9=new listitem("Tandoori Roti","Rs.30","0");
        listitems.add(item9);
        listitem item10=new listitem("Naan","Rs.40","0");
        listitems.add(item10);
        listitem item11=new listitem("Garlic Naan","Rs.50","0");
        listitems.add(item11);
        listitem item12=new listitem("Laccha paratha","Rs.30","0");
        listitems.add(item12);
        listitems.add(item5);
        listitem item15=new listitem("Jeera Rice","Rs.120","0");
        listitems.add(item15);
        listitem item16=new listitem("Pullow","Rs.130","0");
        listitems.add(item16);
        listitem item17=new listitem("Biryani","Rs.110","0");
        listitems.add(item17);
        listitem item18=new listitem("Plain Rice","Rs.90","0");
        listitems.add(item18);
        listitem item19=new listitem("Veg Thali","Rs.190","0");
        listitems.add(item19);
        listitem item20=new listitem("Rajasthani Thali","Rs.200","0");
        listitems.add(item20);
        listitem item21=new listitem("Rajasthani Special Thali","Rs.230","0");
        listitems.add(item21);

        adapter=new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);
    }
}

