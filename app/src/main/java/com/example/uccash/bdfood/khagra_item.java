package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class khagra_item extends AppCompatActivity {

    private WebView w;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khagra_item);
        w = findViewById(R.id.khag);
        w.loadUrl("file:///android_asset/khagra_item.html");
    }
}