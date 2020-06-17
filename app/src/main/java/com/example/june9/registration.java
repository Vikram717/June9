package com.example.june9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    EditText edt_name,edt_pass,edt_eml,edt_ctc,edt_other;
    ImageButton back,next;
    RadioGroup rg;
    RadioButton male,female;
    String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edt_name=findViewById(R.id.edtname);
        edt_pass=findViewById(R.id.edtpassword);
        edt_eml=findViewById(R.id.edteml);
        edt_ctc=findViewById(R.id.edtno);
        edt_other=findViewById(R.id.other);
        back=findViewById(R.id.imgback);
        next=findViewById(R.id.imgnext);
        rg=findViewById(R.id.rgp);
        male=findViewById(R.id.rbmale);
        female=findViewById(R.id.rbfemale);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registration.this.finish();
                System.exit(0);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=edt_name.getText().toString();
                password=edt_pass.getText().toString();
                Intent intent=new Intent(registration.this,Login.class);
                intent.putExtra("Key1",name);
                intent.putExtra("Key2",password);
                startActivity(intent);
                finish();
                Toast.makeText(registration.this, "Registration Succesful ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        switch (id)
        {
            case R.id.i1:
                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.i2:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }

}