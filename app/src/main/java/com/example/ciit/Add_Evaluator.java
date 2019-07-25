package com.example.ciit;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Add_Evaluator extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__evaluator);


        Spinner Select_title=(Spinner)findViewById(R.id.Select_title);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.Title,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Select_title.setAdapter(adapter);
        Select_title.setOnItemSelectedListener(this);

        Save=(Button)findViewById(R.id.btn_save);
        //SAVE BUTTON INTENT TO REPORTS PAGE

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {AlertDialog.Builder builder = new AlertDialog.Builder(Add_Evaluator.this);
                builder.setTitle("Data Saved Succesfully");
                builder.setMessage("  ");
                    builder.setIcon(R.drawable.ic_check);
                    builder.show();}


            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
