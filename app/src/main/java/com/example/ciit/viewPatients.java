package com.example.ciit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class viewPatients extends AppCompatActivity {
    ListView details;
    Button add;
    ArrayList<Patients_details>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patients);

        add=(Button)findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add=new Intent(viewPatients.this,Add.class);
                startActivity(add);
            }
        });

        details=(ListView)findViewById(R.id.details);
        list=new ArrayList<Patients_details>();

        Patients_details person1=new Patients_details("Ishita","Patient","SGL Hospital","Disease","12 June,2019","5");
        Patients_details person2=new Patients_details("Ishita","Patient","SGL Hospital","Disease","12 June,2019","5");

        list.add(person1);
        list.add(person2);

        DetailsAdapter adapter=new DetailsAdapter(this,list);
        details.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addpatient=new Intent(viewPatients.this,Add.class);
                startActivity(addpatient);
            }
        });
    }
}
