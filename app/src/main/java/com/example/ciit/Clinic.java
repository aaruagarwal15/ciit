package com.example.ciit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Clinic extends AppCompatActivity {
    ListView clinics;
    ArrayList<Clinicdetails> list;
    TextView cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic);

        clinics= findViewById(R.id.clinic);
        list= new ArrayList<Clinicdetails>();

        Clinicdetails one=new Clinicdetails("Clinic1");
        Clinicdetails two=new Clinicdetails("Clinic2");


        list.add(one);
        list.add(two);

        Clinicadapter adapter=new Clinicadapter(this,list);

        clinics.setAdapter(adapter);
    }
}
