package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class muns_item extends AppCompatActivity {

    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muns_item);
        w = findViewById(R.id.mun);
        w.loadUrl("file:///android_asset/muns_item.html");
    }
}
