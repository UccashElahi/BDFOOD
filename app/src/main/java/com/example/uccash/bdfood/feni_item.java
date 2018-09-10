package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class feni_item extends AppCompatActivity {
    private WebView w;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feni_item);
        w = findViewById(R.id.feni);
        w.loadUrl("file:///android_asset/feni_item.html");
    }
}