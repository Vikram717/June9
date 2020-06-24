package com.example.june9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class webView extends AppCompatActivity {
    WebView wv;
    EditText search;
    Button btn;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wv=findViewById(R.id.wview);
        btn=findViewById(R.id.btnsrch);
        search=findViewById(R.id.src);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url=search.getText().toString();
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("https://www.google.com/search?q="+url+"&oq=hdga&aqs=chrome..69i57j0l3j46j0l3.566j0j7&sourceid=chrome&ie=UTF-8");
            }
        });
    }
}