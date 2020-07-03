package com.example.june9;


import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SwipeRefresh extends AppCompatActivity {
    ListView listView;
    TextView textView;
    SimpleDateFormat simpleDateFormat;
    String time;
    Calendar calander;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh);
        textView = findViewById(R.id.date);
    //    listView = findViewById(R.id.list);
        swipeRefreshLayout = findViewById(R.id.refreshlayout);
//        String[] values = new String[]{"Football",
//                "Cricket",
//                "volleyball",
//                "Hand Ball",
//                "Hockey",
//                "qwerty"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
//
//                int itemPosition = position;
//                String itemValue = (String) listView.getItemAtPosition(position);
//                Toast.makeText(getApplicationContext(), "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG).show();
//            }
//             });
      swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
               swipeRefreshLayout.setRefreshing(false);
//                        boolean connection=isNetworkAvailable();
//                        if(connection){
//                            Toast.makeText(SwipeRefresh.this, "Internet Connected", Toast.LENGTH_SHORT).show();
//                        }
//                        else{
//                            Toast.makeText(SwipeRefresh.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
//                        }
                calander = Calendar.getInstance();
                simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");

                time = simpleDateFormat.format(calander.getTime());
                textView.setText(time);


            }
        });

    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager=(ConnectivityManager) this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        return networkInfo !=null;
    }
}