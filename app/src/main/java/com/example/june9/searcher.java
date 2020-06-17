package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class searcher extends AppCompatActivity {
    ListView slv;
    ArrayList<String> mylist;
    ArrayAdapter<String > ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searcher);
        slv=findViewById(R.id.slv);
        mylist=new ArrayList<>();
        mylist.add("Apple");
        mylist.add("Avacado");
        mylist.add("Apricot");
        mylist.add("Banana");
        mylist.add("Beetroot");
        mylist.add("Mango");
        ad=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mylist);

    }
    private boolean onCreateOptionMenu()
    {
        return false;
    }
}