package com.example.uccash.bdfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class button extends AppCompatActivity {

    protected Button mybutton;
    String myString="This is a Button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mybutton=(Button)findViewById(R.id.btn);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
            }
        });
    }
}
