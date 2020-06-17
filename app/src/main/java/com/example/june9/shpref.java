package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class shpref extends AppCompatActivity {
    EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shpref);
        name = findViewById(R.id.ev1);
        age = findViewById(R.id.ev2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences s = getSharedPreferences("Shared Pref", 0);
        String s1 = s.getString("Name", "");
        String a = s.getString("age", "0");
        name.setText(s1);
        age.setText(String.valueOf(a));
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences s = getSharedPreferences("Shared Pref", 0);
        SharedPreferences.Editor me=s.edit();
        me.putString("Name",name.getText().toString());
        me.putString("age",age.getText().toString());
        me.commit();
    }
}