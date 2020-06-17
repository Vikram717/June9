package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edt_name,edt_password;
    ImageButton back,next;
    String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_name=findViewById(R.id.edtlname);
        edt_password=findViewById(R.id.edtlpassword);
        back=findViewById(R.id.imglback);
        next=findViewById(R.id.imglnext);
        edt_name.setText(getIntent().getStringExtra("Key1"));
        edt_password.setText(getIntent().getStringExtra("Key2"));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Welcome "+edt_name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}