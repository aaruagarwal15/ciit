package com.example.ciit;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class Patient_Report extends AppCompatActivity {

    private Button Calendar1;
    private Button Calendar2;
    private Button Calendar3;
    private Button Calendar4;
    private TextView dob1;
    private TextView dob2;
    private TextView dob3;
    private TextView dob4;

    private Button Expand1;
    private Button Collapse1;
    private CardView Card3;

    private RadioButton between1;
    private RadioButton between2;
    private CardView card1;
    private CardView card2;
    private RadioGroup rg1;
    private RadioGroup rg2;
    private ListView hosp_tv1;
    ArrayList<Items_Hospital> Show2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__report);

        Calendar1=(Button)findViewById(R.id.btn_calendar1);
        Calendar2=(Button)findViewById(R.id.btn_calendar2);
        Calendar3=(Button)findViewById(R.id.btn_calendar3);
        Calendar4=(Button)findViewById(R.id.btn_calendar4);
        dob1=(TextView)findViewById(R.id.tv_dob1);
        dob2=(TextView)findViewById(R.id.tv_dob2);
        dob3=(TextView)findViewById(R.id.tv_dob3);
        dob4=(TextView)findViewById(R.id.tv_dob4);

        Card3=(CardView)findViewById(R.id.card3);
        Expand1=(Button)findViewById(R.id.expand1);
        Collapse1=(Button)findViewById(R.id.collapse1);

        between1=(RadioButton)findViewById(R.id.btn_between1);
        between2=(RadioButton)findViewById(R.id.btn_between2);
        card1=(CardView) findViewById(R.id.card1);;
        card2=(CardView) findViewById(R.id.card2);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);

        hosp_tv1 = (ListView) findViewById(R.id.hospital_tv1);
        Show2 = new ArrayList<Items_Hospital>();

        Items_Hospital a=new Items_Hospital("Maharashtra, Aundh Civil Hospital, Pune");
        Items_Hospital b=new Items_Hospital("Maharashtra, Bharati Vidyapeeth Hospital, Pune");
        Items_Hospital c=new Items_Hospital("Maharashtra, Indira Gandhi Memorial Hospital, Bhiwandi");

        Show2.add(a);
        Show2.add(b);
        Show2.add(c);

        Hospital_ListDetails H_ld=new Hospital_ListDetails(this,Show2);
        hosp_tv1.setAdapter(H_ld);


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.btn_between1){
                    card1.setVisibility(View.VISIBLE);

                }else if (checkedId==R.id.btn_after1){
                    card1.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_before1){
                    card1.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_on1){
                    card1.setVisibility(View.GONE);
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.btn_between2){
                    card2.setVisibility(View.VISIBLE);

                }else if (checkedId==R.id.btn_after2){
                    card2.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_before2){
                    card2.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_on2){
                    card2.setVisibility(View.GONE);
                }
            }
        });

        Calendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog1 = new DatePickerDialog(Patient_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date3= String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob1.setText(date3);
                            }
                        },dd,mm,yy);
                datePickerDialog1.show();
            }
        });

        Calendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog1 = new DatePickerDialog(Patient_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date4 = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob2.setText(date4);
                            }
                        },dd,mm,yy);
                datePickerDialog1.show();
            }
        });

        Calendar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog1 = new DatePickerDialog(Patient_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date5 = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob3.setText(date5);
                            }
                        },dd,mm,yy);
                datePickerDialog1.show();
            }
        });

        Calendar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(Patient_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date6 = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob4.setText(date6);
                            }
                        },dd,mm,yy);
                datePickerDialog2.show();
            }
        });

        Expand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card3.setVisibility(View.VISIBLE);
            }
        });

        Collapse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card3.setVisibility(View.GONE);
            }
        });


    }
}
