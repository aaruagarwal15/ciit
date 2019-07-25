package com.example.ciit;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class Hospital_Report extends AppCompatActivity {

    private Button Expand01;
    private Button Collapse01;
    private CardView cv01;
    private Button Expand02;
    private Button Collapse02;
    private Button Calendar01;
    private Button Calendar02;
    private TextView dob01;
    private TextView dob02;
    private CardView cv02;
    private CardView cv_03;
    private RadioGroup r01;

    /*private Button Expand03;
    private Button Collapse03;
    private TextView tv_description;*/

    private ListView hosp_tv;
    ArrayList<Items_Hospital> Show1;

    private ListView custom_description;
    ArrayList<Description_Items> display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__report);

        Expand01=(Button)findViewById(R.id.expand01);
        Collapse01=(Button) findViewById(R.id.collapse01);
        cv01=(CardView) findViewById(R.id.cv_01);
        Expand02=(Button) findViewById(R.id.expand02);
        Collapse02=(Button) findViewById(R.id.collapse02);
        Calendar01=(Button) findViewById(R.id.btn_calendar01);
        Calendar02=(Button) findViewById(R.id.btn_calendar02);
        dob01=(TextView) findViewById(R.id.tv_dob01);
        dob02=(TextView) findViewById(R.id.tv_dob02);
        cv02=(CardView) findViewById(R.id.cv_02);
        cv_03=(CardView) findViewById(R.id.cv_03);
        r01=(RadioGroup) findViewById(R.id.r01);

        /*View test1View = findViewById(R.id.test1);
        Expand03=(Button)test1View.findViewById(R.id.expand03);
        Collapse03=(Button) test1View.findViewById(R.id.collapse03);
        tv_description=(TextView)test1View.findViewById(R.id.tv_description);*/

        hosp_tv = (ListView) findViewById(R.id.hospital_tv);
        Show1 = new ArrayList<Items_Hospital>();

        Items_Hospital a=new Items_Hospital("Maharashtra, Aundh Civil Hospital, Pune");
        Items_Hospital b=new Items_Hospital("Maharashtra, Bharati Vidyapeeth Hospital, Pune");
        Items_Hospital c=new Items_Hospital("Maharashtra, Indira Gandhi Memorial Hospital, Bhiwandi");

        Show1.add(a);
        Show1.add(b);
        Show1.add(c);

        Hospital_ListDetails H_ld=new Hospital_ListDetails(this,Show1);
        hosp_tv.setAdapter(H_ld);

        custom_description = (ListView) findViewById(R.id.custom_description);
        display = new ArrayList<Description_Items>();

        Description_Items a1=new Description_Items("Display the total number of patients?","If the default 'All Patients Served/Seen' option is selected, displays the number of patients enrolled or having a visit during the report period. If the 'New Patients Enrolled' option is selected, displays the number of new patients enrolled during the report period.");
        Description_Items b1=new Description_Items("Display region?","Region or Country of the hospital (world indicates that no region label has been assigned to the hospital.)");
        Description_Items c1=new Description_Items("Display patient gender breakdown?","The number of male and female patients. If the default option 'All Patients Served/Seen' is selected, includes all patients either newly enrolled or who had a visit during the report period. If 'New Patients Enrolled' is selected, includes only patients enrolled for the first time during the report period.");

        display.add(a1);
        display.add(b1);
        display.add(c1);

        Description_ListDetails D_ld=new Description_ListDetails(this,display);
        custom_description.setAdapter(D_ld);


        Expand01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv01.setVisibility(View.VISIBLE);
            }
        });

        Collapse01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv01.setVisibility(View.GONE);
            }
        });

        Calendar01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog01 = new DatePickerDialog(Hospital_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date1 = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob01.setText(date1);
                            }
                        },dd,mm,yy);
                datePickerDialog01.show();
            }
        });

        Calendar02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int yy = calendar.get(Calendar.YEAR);
                int mm = calendar.get(Calendar.MONTH);
                int dd = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog2 = new DatePickerDialog(Hospital_Report.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date2 = String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1)
                                        + "/" + String.valueOf(year);
                                dob02.setText(date2);
                            }
                        },dd,mm,yy);
                datePickerDialog2.show();
            }
        });

        r01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.btn_between01){
                    cv02.setVisibility(View.VISIBLE);

                }else if (checkedId==R.id.btn_after01){
                    cv02.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_before01){
                    cv02.setVisibility(View.GONE);

                }else if (checkedId==R.id.btn_on01){
                    cv02.setVisibility(View.GONE);
                }
            }
        });

        Expand02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv_03.setVisibility(View.VISIBLE);
            }
        });

        Collapse02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv_03.setVisibility(View.GONE);
            }
        });

        /*Expand03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_description.setVisibility(View.VISIBLE);
            }
        });

        Collapse03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_description.setVisibility(View.GONE);
            }
        });*/


    }
}
