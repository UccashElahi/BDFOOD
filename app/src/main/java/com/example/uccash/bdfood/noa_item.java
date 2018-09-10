package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class noa_item extends AppCompatActivity {
    private WebView w;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noa_item);
        w = findViewById(R.id.noa);
        w.loadUrl("file:///android_asset/noa_item.html");
    }
}