package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class tanga_item extends AppCompatActivity {

    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanga_item);
        w = findViewById(R.id.tanga);
        w.loadUrl("file:///android_asset/tang_item.html");
    }
}
