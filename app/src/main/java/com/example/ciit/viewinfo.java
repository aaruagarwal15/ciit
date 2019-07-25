package com.example.ciit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewinfo extends AppCompatActivity {
    Button addvisit,editpatient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewinfo);

        editpatient=(Button)findViewById(R.id.editpatient);

        editpatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editpatient=new Intent(viewinfo.this,Editinfo.class);
                startActivity(editpatient);
            }
        });

        addvisit=(Button)findViewById(R.id.addvisit);

        addvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addvisit=new Intent(viewinfo.this,Add_info.class);
                startActivity(addvisit);
            }
        });
    }
}
