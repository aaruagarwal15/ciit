package com.example.ciit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Description_ListDetails extends ArrayAdapter<Description_Items> {
    private final Context context2;
    private final ArrayList<Description_Items> display;

    public Description_ListDetails(Context context2, ArrayList<Description_Items> display) {
        super(context2, R.layout.description_customlv,display);
        this.context2 = context2;
        this.display = display;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater1 = (LayoutInflater) context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView3=inflater1.inflate(R.layout.description_customlv,parent,false);

        EditText Questions=(EditText) rowView3.findViewById(R.id.tv_question);
        TextView Description=(TextView)rowView3.findViewById(R.id.tv_description);


        Questions.setText(display.get(position).getQuestions());
        Description.setText(display.get(position).getDescription());



        return rowView3;
    }
}

