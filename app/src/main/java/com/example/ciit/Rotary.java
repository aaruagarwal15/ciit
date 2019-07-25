package com.example.ciit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Rotary extends AppCompatActivity {
    private ListView rotary_details;
    ArrayList<list_rotary> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotary);

        rotary_details = (ListView) findViewById(R.id.rotary_list_view);
        arr = new ArrayList<list_rotary>();

        list_rotary a=new list_rotary("ABC", "9869244943", "A-38 ASHOK NAGAR");
        list_rotary b=new list_rotary("SDC", "9869844943", "A-28 NEHRU NAGAR");
        list_rotary c=new list_rotary("ADCC", "9864244943", "A-48 ASHOK VIHAR");

        arr.add(a);
        arr.add(b);
        arr.add(c);

        Rotary_adapter adap= new Rotary_adapter(this,arr);
        rotary_details.setAdapter(adap);

    }
}
