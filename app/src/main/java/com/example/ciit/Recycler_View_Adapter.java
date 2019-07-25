package com.example.ciit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

class Recycler_View_Adapter extends RecyclerView.Adapter<Recycler_View_Adapter.MyViewHolder> {

    List<Recycle_view_data> list ;
    Context context;
    Activity a;

    public Recycler_View_Adapter(List<Recycle_view_data> list, Context context,Activity activity) {
        this.list = list;
        this.context = context;
        this.a = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View card =(View) LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycle_view, parent, false);
        MyViewHolder holder = new MyViewHolder(card , context);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, final int position) {
        viewHolder.txt.setText(list.get(position).title);
        viewHolder.img.setImageResource(list.get(position).imageId);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;
        Context context;
        RelativeLayout rv;
        private ClickListener clicklistener;

        public MyViewHolder(@NonNull final View itemView, Context context) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView);
            txt = itemView.findViewById(R.id.title);
            rv = (RelativeLayout)itemView.findViewById(R.id.rv);
            context = this.context;

            rv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   /* Toast.makeText(itemView.getContext(), "Position:" + Integer.toString(getPosition()), Toast.LENGTH_SHORT).show();
                    if(clicklistener !=null){
                        clicklistener.itemClicked(v,getAdapterPosition());
                    }*/
                    int pos = getAdapterPosition();
                    if (pos == 0) {
                        Intent i = new Intent(a, Patients_home.class);
                        a.startActivity(i);
                    }
                    if (pos == 1) {
                        Intent i = new Intent(a, evaluator.class);
                        a.startActivity(i);
                    }
                    if(pos == 2){
                        Intent i = new Intent(a, Hospital.class);
                        a.startActivity(i);
                    }
                    if(pos == 3){
                        Intent i = new Intent(a, My_Account.class);
                        a.startActivity(i);
                    }
                    if(pos == 4){
                        Intent i = new Intent(a, Reports_Page.class);
                        a.startActivity(i);
                    }
                    if(pos == 5){
                        Intent o= new Intent(a, Near_by_clinic.class);
                        a.startActivity(o);
                    }
                    if(pos == 6){
                        Intent y= new Intent(a, Rotary.class);
                        a.startActivity(y);
                    }
                    if(pos == 7){
                        Intent z= new Intent(a, Refer.class);
                        a.startActivity(z);
                    }
                    if(pos == 8){
                        Intent e= new Intent(a, Events.class);
                        a.startActivity(e);
                    }
                    if(pos == 9){
                        Intent s= new Intent(a, Parents.class);
                        a.startActivity(s);
                    }

                }
            });

        }
        public void setClickListener(ClickListener clickListener){
            this.clicklistener = clickListener;
        }


    }
}



