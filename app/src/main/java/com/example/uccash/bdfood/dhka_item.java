package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class dhka_item extends AppCompatActivity {

    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lists");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhka_item);
        w = findViewById(R.id.web);
        w.loadUrl("file:///android_asset/dhk_item.html");
    }
}
