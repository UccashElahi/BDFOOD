package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class khl_item extends AppCompatActivity {

    private WebView w;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khl_item);
        w = findViewById(R.id.khl);
        w.loadUrl("file:///android_asset/khl_item.html");
    }
}
