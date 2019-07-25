package com.example.ciit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class evaluator extends AppCompatActivity {

    EditText Evaluator;
    Button View_ev;
    Button Add_ev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluator);

        Evaluator = (EditText) findViewById(R.id.Evaluator);
        View_ev = (Button) findViewById(R.id.View_ev);
        Add_ev = (Button) findViewById(R.id.Add_ev);


        View_ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(evaluator.this, evaluator_page.class);
                startActivity(i);
            }
        });

        Add_ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(evaluator.this,Add_Evaluator.class);
                startActivity(intent);
            }
        });

    }
}
