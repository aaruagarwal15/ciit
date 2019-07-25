package com.example.ciit;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reports_Page extends AppCompatActivity {
    private Button Hospital;
    private Button Patient;
    private Button Visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports__page);

        Hospital=(Button)findViewById(R.id.btn_hospital);
        Patient=(Button)findViewById(R.id.btn_patient);
        Visit=(Button)findViewById(R.id.btn_visit);


        Hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Reports_Page.this,Hospital_Report.class);
                startActivity(i);
            }
        });

        Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Reports_Page.this,Patient_Report.class);
                startActivity(i);
            }
        });

        Visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Reports_Page.this,Visit_Report.class);
                startActivity(i);
            }
        });


    }
}

