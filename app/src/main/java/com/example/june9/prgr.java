package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prgr extends AppCompatActivity {
    Button pb;
    private int jt=0;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prgr);
        pb=findViewById(R.id.pb);
    }

    public void clk(View view) {
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Work in Progress");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(true);
        progressDialog.setProgress(0);
        progressDialog.show();
        progressDialog.setMax(100);
        Thread t=new Thread() {
            @Override
            public void run() {

                do {
                    try {
                        sleep(200);
                        jt+=10;
                        progressDialog.setProgress(jt);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while (jt<100);
            }
        };
        t.start();
    }
}