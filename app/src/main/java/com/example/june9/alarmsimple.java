package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class alarmsimple extends AppCompatActivity {
    Button btn;
    EditText st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmsimple);
        btn=findViewById(R.id.btnst);
        st=findViewById(R.id.st);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarm();
            }
        });
    }

    public void alarm() {
        int t= Integer.parseInt(st.getText().toString());
        Intent intent=new Intent(alarmsimple.this,brdcst.class);
        PendingIntent pendingIntent=PendingIntent.getBroadcast(this,234,intent,0);
        AlarmManager alarmManager= (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(t*1000),pendingIntent);
        Toast.makeText(this, "Alarm set for "+t+" sec", Toast.LENGTH_SHORT).show();
    }

}