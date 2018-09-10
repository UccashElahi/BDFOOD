package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class cox_item extends AppCompatActivity {

    private WebView w;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cox_item);
        w = findViewById(R.id.cox);
        w.loadUrl("file:///android_asset/cox_item.html");
    }
}