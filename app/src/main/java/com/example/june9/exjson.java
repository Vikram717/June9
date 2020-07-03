package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class exjson extends AppCompatActivity {
    TextView jt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exjson);
        jt=findViewById(R.id.jt);
        String jstr="{\"Student\":[{\"id\":\"1\",\"name\":\"Aman_Saini\"},{\"id\":\"2\",\"name\":\"Vikram\"}]}";
        String jdata="";
        try {
            JSONObject jsonObject=new JSONObject(jstr);
            JSONArray jsonArray=jsonObject.optJSONArray("Student");
            for (int i=0;i<jsonArray.length();i++)
            {
                JSONObject jsonObject1=jsonArray.getJSONObject(i);
                int id=Integer.parseInt(jsonObject1.optString("id").toString());
                String name=jsonObject1.optString("name").toString();
                jdata+="record "+i+"\nId= "+id+"\nName= "+name+"\n";
                jt.setText(jdata);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}