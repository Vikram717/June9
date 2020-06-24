package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class colors extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] colors={"Red","Blue","Black","Green"};
    Spinner spnr;
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        spnr=findViewById(R.id.spin);
        rl=findViewById(R.id.rel);
        spnr.setOnItemSelectedListener(colors.this);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,colors);
        aa.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spnr.setAdapter(aa);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        { rl.setBackgroundColor(Color.RED); }
        if(position==1)
        { rl.setBackgroundColor(Color.BLUE); }
        if(position==2)
        { rl.setBackgroundColor(Color.BLACK); }
        if(position==3)
        {rl.setBackgroundColor(Color.GREEN); }
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}