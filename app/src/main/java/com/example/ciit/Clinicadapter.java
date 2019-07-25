package com.example.ciit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Clinicadapter extends ArrayAdapter<Clinicdetails> {
    private final Context context;
    private final ArrayList<Clinicdetails> values;

    public Clinicadapter(Context context, ArrayList<Clinicdetails> list) {
        super(context,R.layout.cliniclayout,list);
        this.context = context;
        this.values = list;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.cliniclayout,parent,false);

        TextView clinicname=rowView.findViewById(R.id.cn);
        rowView.findViewById(R.id.cardview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Add.class);
                context.startActivity(intent);

            }
        });

        clinicname.setText(values.get(position).getClinicname());
        return rowView;
    }
}