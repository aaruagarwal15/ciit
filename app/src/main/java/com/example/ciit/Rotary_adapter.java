package com.example.ciit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Rotary_adapter extends ArrayAdapter<list_rotary> {
    private final Context context;
    private final ArrayList<list_rotary> show;

    public Rotary_adapter(Context context, ArrayList<list_rotary> show) {
        super(context, R.layout.rotary_layout,show);
        this.context = context;
        this.show = show;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater r_inf= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=r_inf.inflate(R.layout.rotary_layout,parent,false);

        TextView Name=(TextView)rowView.findViewById(R.id.name_r);
        TextView Contact_Number=(TextView)rowView.findViewById(R.id.cn_r);
        TextView Address=(TextView)rowView.findViewById(R.id.add_r);


        Name.setText(show.get(position).getName());
        Contact_Number.setText(show.get(position).getContact_Number());
        Address.setText(show.get(position).getAddress());



        return rowView;
    }
}

