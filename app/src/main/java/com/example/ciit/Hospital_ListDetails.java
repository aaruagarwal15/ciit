package com.example.ciit;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Hospital_ListDetails extends ArrayAdapter<Items_Hospital> {

    private final Context context1;
    private final ArrayList<Items_Hospital> Show1;


    public Hospital_ListDetails(Context context, ArrayList<Items_Hospital> Show1) {
        super(context, R.layout.lv_hospital,Show1);
        this.context1 = context;
        this.Show1 = Show1;
    }


    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView1=inflater.inflate(R.layout.lv_hospital,parent,false);

        TextView name_hosp=(TextView) rowView1.findViewById(R.id.tv_hospital);

        name_hosp.setText(Show1.get(position).getHospital_Name());


        return rowView1;
    }
}
