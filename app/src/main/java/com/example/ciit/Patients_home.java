package com.example.ciit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patients_home extends AppCompatActivity {

    Button add,patients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients_home);

        add=(Button) findViewById(R.id.add);
        patients=(Button)findViewById(R.id.view);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add=new Intent(Patients_home.this,Clinic.class);
                startActivity(add);
            }
        });

        patients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patients=new Intent(Patients_home.this,viewPatients.class);
                startActivity(patients);
            }
        });

    }
}
