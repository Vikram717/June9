package com.example.june9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cnt extends AppCompatActivity {
    ListView lv;
    String cont[]={"Rajesh","Manoj","Suresh","Ramesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnt);
        lv=findViewById(R.id.clv);
        final ArrayAdapter<String> ad=new ArrayAdapter<String>(cnt.this,android.R.layout.simple_list_item_1,cont);
        lv.setAdapter(ad);
        registerForContextMenu(lv);
    }


    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.cntmenu,menu);
        menu.setHeaderIcon(R.drawable.ic_baseline_call_24);
        menu.setHeaderTitle("Contact Via: ");
    }



    public boolean onContextItemSelected(MenuItem item)
    {
        if(item.getItemId()==R.id.call)
        {
            Toast.makeText(this, "Call", Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.sms)
        {
            Toast.makeText(this, "Message", Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }


}