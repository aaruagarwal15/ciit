package com.example.ciit;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Visit_Report extends AppCompatActivity  {

    private Button Expand;
    private Button Collapse;
    private CardView Card1;
    private Button Calendar1;
    private Button Calendar2;
    private Button Calendar3;
    private Button Calendar4;
    private TextView SelectedDate1;
    // private TextView SelectedDate2;
    private TextView SelectedDate_next1;
    private TextView SelectedDate_next2;
    private TextView dob1;
    private TextView dob2;
    private RadioGroup r1;
    //private RadioGroup r2;
    private RadioGroup r3;
    private RadioGroup r4;
    private CardView cv_1;
    private CardView cv_2;
    private CardView cv_3;
    private CardView cv_4;
    private ListView hosp_tv3;
    ArrayList<Items_Hospital> Show4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit__report);

        hosp_tv3 = (ListView) findViewById(R.id.hospital_tv3);
        Show4 = new ArrayList<Items_Hospital>();

        Items_Hospital a=new Items_Hospital("Maharashtra, Aundh Civil Hospital, Pune");
        Items_Hospital b=new Items_Hospital("Maharashtra, Bharati Vidyapeeth Hospital, Pune");
        Items_Hospital c=new Items_Hospital("Maharashtra, Indira Gandhi Memorial Hospital, Bhiwandi");

        Show4.add(a);
        Show4.add(b);
        Show4.add(c);

        Hospital_ListDetails H_ld=new Hospital_ListDetails(this,Show4);
        hosp_tv3.setAdapter(H_ld);

        Card1=(CardView)findViewById(R.id.cv_card1);
        Expand=(Button)findViewById(R.id.btn_expand);
        Collapse=(Button)findViewById(R.id.btn_collapse);
        SelectedDate1=(TextView)findViewById(R.id.tv_SelectedDate1);
        //SelectedDate2=(TextView)findViewById(R.id.tv_SelectedDate2);
        dob1=(TextView)findViewById(R.id.dob1);
        dob2=(TextView)findViewById(R.id.dob2);

        SelectedDate_next1=(TextView)findViewById(R.id.tv_SelectedDate_next1);
        //SelectedDate_next2=(TextView)findViewById(R.id.tv_SelectedDate_next2);
        Calendar1=(Button)findViewById(R.id.btn_calendar1);
        Calendar2=(Button)findViewById(R.id.btn_calendar2);
        Calendar3=(Button)findViewById(R.id.btn_calendar3);
        Calendar4=(Button)findViewById(R.id.btn_calendar4);
        r1=(RadioGroup)findViewById(R.id.r1);
        //r2=(RadioGroup)findViewById(R.id.r2);
        r3=(RadioGroup)findViewById(R.id.r3);
        //r4=(RadioGroup)findViewById(R.id.r4);
        cv_1=(CardView)findViewById(R.id.cv_1);
        cv_2=(CardView)findViewById(R.id.cv_2);
        cv_3=(CardView)findViewById(R.id.cv_3);
        cv_4=(CardView)findViewById(R.id.cv_4);


        Calendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog1= new DatePickerDialog(Visit_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date7= String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                SelectedDate1.setText(date7);
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
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(Visit_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date8= String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob1.setText(date8);
                            }
                        },dd,mm,yy);
                datePickerDialog2.show();
            }
        });

        Calendar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog3 = new DatePickerDialog(Visit_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date9= String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                SelectedDate_next1.setText(date9);
                            }
                        },dd,mm,yy);
                datePickerDialog3.show();
            }
        });

        Calendar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog3 = new DatePickerDialog(Visit_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date10= String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob2.setText(date10);
                            }
                        },dd,mm,yy);
                datePickerDialog3.show();
            }
        });



        Expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card1.setVisibility(View.VISIBLE);
            }
        });

        Collapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card1.setVisibility(View.GONE);
            }
        });

        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.btn_between1){
                    cv_2.setVisibility(View.VISIBLE);

                }else if (checkedId==R.id.btn_after1){
                    cv_2.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_before1){
                    cv_2.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_on1){
                    cv_2.setVisibility(View.GONE);
                }
            }
        });

        r3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.btn_between3){
                    cv_4.setVisibility(View.VISIBLE);

                }else if (checkedId==R.id.btn_after3){
                    cv_4.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_before3){
                    cv_4.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_on3){
                    cv_4.setVisibility(View.GONE);
                }
            }
        });

    }


}
