package com.example.ciit;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Add extends AppCompatActivity {
    EditText calendar2,calendar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        calendar2=(EditText)findViewById(R.id.calendar2);
        calendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog date=new DatePickerDialog(Add.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                + "/" + String.valueOf(year);
                        calendar2.setText(date);
                    }
                },yy,mm,dd);
                date.show();
            }
        });
        calendar1=(EditText)findViewById(R.id.calendar1);
        calendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog date=new DatePickerDialog(Add.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                + "/" + String.valueOf(year);
                        calendar1.setText(date);
                    }
                },yy,mm,dd);
                date.show();
            }
        });
    }
}
