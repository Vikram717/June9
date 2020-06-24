package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Timepicker extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText tt;
    private int hr,min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        btn=findViewById(R.id.btntt);
        tt=findViewById(R.id.tt);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Calendar c=Calendar.getInstance();
        hr=c.get(Calendar.HOUR_OF_DAY);
        min=c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog=new TimePickerDialog(Timepicker.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tt.setText(hr+":"+min);
            }
        },hr,min,false);
        timePickerDialog.show();
    }
}