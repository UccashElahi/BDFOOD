package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class manik_item extends AppCompatActivity {

    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manik_item);
        w = findViewById(R.id.man);
        w.loadUrl("file:///android_asset/manik_item.html");
    }
}
