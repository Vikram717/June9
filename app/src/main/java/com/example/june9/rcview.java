package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class rcview extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcview);
        rv=findViewById(R.id.rv);
        lidata[] lidata=new lidata[]
                {
                  new lidata("Call ",android.R.drawable.ic_menu_call),
                        new lidata("Menu ",android.R.drawable.ic_menu_sort_by_size),
                        new lidata("Alarm ",android.R.drawable.ic_lock_idle_alarm),
                };
        rvad rvad=new rvad(lidata);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(rvad);
    }
}