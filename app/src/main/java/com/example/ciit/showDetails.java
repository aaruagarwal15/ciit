package com.example.ciit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class showDetails extends ArrayAdapter<Details>
{

    private final Context context;
    private final ArrayList<Details> show;

    public showDetails(Context context,  ArrayList<Details> list) {
        super(context, R.layout.list_layout , list);
        this.context = context;
        this.show = list;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inf.inflate(R.layout.list_layout, parent, false);

        TextView h_name = (TextView) rowView.findViewById(R.id.hospital_name);
        TextView reg = (TextView) rowView.findViewById(R.id.region);

        h_name.setText(show.get(position).getHospital_name());
        reg.setText(show.get(position).getRegion());

        return rowView;
    }
}
