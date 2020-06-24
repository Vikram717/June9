package com.example.june9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rvad extends RecyclerView.Adapter<rvad.ViewHolder> {

    private lidata[] lidata1;

    public rvad(com.example.june9.lidata[] lidata) {
        this.lidata1 = lidata;
    }

    @NonNull
    @Override
    public rvad.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View lit=layoutInflater.inflate(R.layout.del,parent,false);
        ViewHolder ViewHolder=new ViewHolder(lit);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull rvad.ViewHolder holder, int position) {
        final lidata lidata= lidata1[position];
        holder.tv.setText(lidata1[position].getName());
        holder.iv.setImageResource(lidata1[position].getImgid());
        holder.dv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), ""+lidata.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return lidata1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView iv;
        public TextView tv;
        public LinearLayout dv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv=itemView.findViewById(R.id.iv);
            this.tv=itemView.findViewById(R.id.tv);
            this.dv=itemView.findViewById(R.id.dv);
        }
    }
}
