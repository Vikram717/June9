package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class dtpick<dte> extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText edt;
    private int yr,mn,dte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtpick);
        btn=findViewById(R.id.btndt);
        edt=findViewById(R.id.dt);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Calendar c=Calendar.getInstance();
        yr=c.get(Calendar.YEAR);
        mn=c.get(Calendar.MONTH);
        dte=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                edt.setText(yr+"/"+mn+"/"+dte);
            }
        },yr,mn,dte);
        datePickerDialog.show();
    }
}