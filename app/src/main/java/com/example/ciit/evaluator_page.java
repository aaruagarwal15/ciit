package com.example.ciit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class evaluator_page extends AppCompatActivity {
    private ListView lvItems;
    ArrayList<Items> show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluator_page);

        lvItems=(ListView)findViewById(R.id.lvItems);
        show=new ArrayList<Items>();
        Items i1=new Items("Arpit Agarwal","Doctor","0");
        Items i2=new Items("Jatin Agarwal","Doctor","0");
        Items i3=new Items("Dinesh Agarwal","Doctor","0");

        show.add(i1);
        show.add(i2);
        show.add(i3);

        ListDetails ld= new ListDetails(this,show);
        lvItems.setAdapter(ld);


    }
}
