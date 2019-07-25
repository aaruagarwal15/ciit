package com.example.ciit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Hospital extends AppCompatActivity {
    ListView details;
    ArrayList<Details> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        details = (ListView)findViewById(R.id.lv);
        list = new ArrayList<Details>();

        Details d1 = new Details("ABC", "Delhi");
        Details d2 = new Details("GangaRam ", "Shankar Road");


        list.add(d1);
        list.add(d2);

        showDetails showd = new showDetails(this, list);
        details.setAdapter(showd);
    }



}
