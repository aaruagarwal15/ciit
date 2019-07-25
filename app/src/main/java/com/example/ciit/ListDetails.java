package com.example.ciit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListDetails extends ArrayAdapter<Items> {
    private final Context context;
    private final ArrayList<Items> show;

    public ListDetails(Context context, ArrayList<Items> show) {
        super(context, R.layout.custom_lv,show);
        this.context = context;
        this.show = show;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inf.inflate(R.layout.custom_lv,parent,false);

        TextView Name=(TextView)rowView.findViewById(R.id.tv_nameValue);
        TextView Title=(TextView)rowView.findViewById(R.id.tv_doc);
        TextView Status=(TextView)rowView.findViewById(R.id.tv_statusValue);


        Name.setText(show.get(position).getName());
        Title.setText(show.get(position).getTitle());
        Status.setText(show.get(position).getStatus());



        return rowView;
    }
}

