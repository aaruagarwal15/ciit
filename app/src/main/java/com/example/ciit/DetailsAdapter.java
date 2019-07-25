package com.example.ciit;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Patients_details>
{
    private final Context context;
    private final ArrayList<Patients_details> values;

    public DetailsAdapter(Context context, ArrayList<Patients_details> list) {
        super(context, R.layout.row_layout,list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent){

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.row_layout,parent,false);

        TextView name=(TextView)  rowView.findViewById(R.id.name_value);
        TextView title=(TextView) rowView.findViewById(R.id.title_value);
        TextView hospital=(TextView)  rowView.findViewById(R.id.hospital_value);
        TextView diagnosis=(TextView) rowView.findViewById(R.id.diagnosis_value);
        TextView date=(TextView)  rowView.findViewById(R.id.date_value);
        TextView photo=(TextView) rowView.findViewById(R.id.photo_value);


        Button view=(Button) rowView.findViewById(R.id.Vbut);
        Button add=(Button) rowView.findViewById(R.id.Abut);
        Button edit=(Button) rowView.findViewById(R.id.Ebut);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info=new Intent(context,viewinfo.class);
                context.startActivity(info);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addinfo=new Intent(context,Add_info.class);
                context.startActivity(addinfo);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editinfo=new Intent(context,Editinfo.class);
                context.startActivity(editinfo);
            }
        });

        name.setText(values.get(position).getName());
        title.setText(values.get(position).getTitle());
        hospital.setText(values.get(position).getHospital());
        diagnosis.setText(values.get(position).getDiagnosis());
        date.setText(values.get(position).getDate());
        photo.setText(values.get(position).getPhotos());
         return rowView;
         }
}

