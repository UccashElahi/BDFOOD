package com.example.uccash.bdfood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button share, rate, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.div);
        Button share = findViewById(R.id.btn_share);
        Button rate = findViewById(R.id.btn_rate);
        Button exit = findViewById(R.id.btn_exit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alldivision = new Intent(MainActivity.this, alldivision.class);
                startActivity(alldivision);

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store"));
                startActivity(i);

            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,"Hey check out my app ");
                i.setType("text/plain");
                startActivity(i);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
