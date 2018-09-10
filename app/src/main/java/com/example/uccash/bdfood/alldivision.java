package com.example.uccash.bdfood;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import static android.R.layout.simple_list_item_1;
import static android.R.layout.simple_spinner_item;

public class alldivision extends AppCompatActivity {

    String [] dhkitem = {"Select Desire District","DHAKA","NARAYANGANJ","MANIKGANJ","TANGAIL","MUNSHIGANJ","FARIDPUR"};
    String [] ctgitem = {"Select Desire District","CHATTAGRAM","FENI","NOAKHALI","RANGAMATI","COX'S BAZAR","KHAGRACHARI"};
    String [] sylitem = {"Select Desire District","SYLHET","HABIGANJ","SUNAMGANJ"};
    String [] rajitem = {"Select Desire District","RAJSHAHI","BOGRA","JOYPURHAT","NAOGAON","PABNA"};
    String [] khlitem = {"Select Desire District","KHULNA","JESSORE","SATKHIRA"};
    String [] rngitem = {"Select Desire District","RANGPUR","DINAJPUR","NILPHAMARI"};
    String [] baritem = {"Select Desire District","BARISAL"};
    String [] mymenitem ={"Select Desire District","MYMENSINGH","SHERPUR","NETROKONA"};

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;

    private Button dhaka, ctg, sylet, raj, ku, ran, bar, my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Division List");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldivision);

        spinner1  = findViewById(R.id.spinner1);
        spinner2  = findViewById(R.id.spinner2);
        spinner3  = findViewById(R.id.spinner3);
        spinner4  = findViewById(R.id.spinner4);
        spinner5  = findViewById(R.id.spinner5);
        spinner6  = findViewById(R.id.spinner6);
        spinner7  = findViewById(R.id.spinner7);
        spinner8  = findViewById(R.id.spinner8);
    }


    public void dhakaAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_list_item_1, dhkitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
        spinner1.setVisibility(View.VISIBLE);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent;
                switch (position){
                    case 1:
                        intent = new Intent(alldivision.this, dhka_item.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(alldivision.this, nar_item.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(alldivision.this, manik_item.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(alldivision.this, tanga_item.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(alldivision.this, muns_item.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(alldivision.this, fard_item.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void ctgAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item,ctgitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
        spinner2.setVisibility(View.VISIBLE);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(alldivision.this, ctg_item.class);
                        startActivity(intent);

                        break;
                    case 2:
                        intent = new Intent(alldivision.this, feni_item.class);
                        startActivity(intent);

                        break;
                    case 3:
                        intent = new Intent(alldivision.this, noa_item.class);
                        startActivity(intent);

                        break;
                    case 4:
                        intent = new Intent(alldivision.this, ranga_item.class);
                        startActivity(intent);

                        break;
                    case 5:
                        intent = new Intent(alldivision.this, cox_item.class);
                        startActivity(intent);

                        break;
                    case 6:
                        intent = new Intent(alldivision.this, khagra_item.class);
                        startActivity(intent);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    public void syletAction (View view){

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, sylitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(dataAdapter);
        spinner3.setVisibility(View.VISIBLE);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

       public void rajAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, rajitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(dataAdapter);
        spinner4.setVisibility(View.VISIBLE);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
     public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(alldivision.this, raj_item.class);
                        startActivity(intent);

                        break;

                    case 2:
                        intent = new Intent(alldivision.this, bog_item.class);
                        startActivity(intent);

                        break;

                    case 3:
                        intent = new Intent(alldivision.this, joy_item.class);
                        startActivity(intent);

                        break;

                    case 4:
                        intent = new Intent(alldivision.this, nao_item.class);
                        startActivity(intent);

                        break;

                    case 5:
                        intent = new Intent(alldivision.this, pab_item.class);
                        startActivity(intent);

                        break;
                }
           }

   @Override
     public void onNothingSelected(AdapterView<?> parent) {

        }
         });
        }
    public void kuAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, khlitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(dataAdapter);
        spinner5.setVisibility(View.VISIBLE);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(alldivision.this, khl_item.class);
                        startActivity(intent);

                        break;

                    case 2:
                        intent = new Intent(alldivision.this, jes_item.class);
                        startActivity(intent);

                        break;

                    case 3:
                        intent = new Intent(alldivision.this, sat_item.class);
                        startActivity(intent);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void ranAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, rngitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(dataAdapter);
        spinner6.setVisibility(View.VISIBLE);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void barAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, baritem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(dataAdapter);
        spinner7.setVisibility(View.VISIBLE);
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(alldivision.this, bari_item.class);
                        startActivity(intent);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void myAction(View view){
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, simple_spinner_item, mymenitem);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(dataAdapter);
        spinner8.setVisibility(View.VISIBLE);
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;
                switch (position) {
                    case 1:
                        intent = new Intent(alldivision.this, mymen_item.class);
                        startActivity(intent);

                        break;

                    case 2:
                        intent = new Intent(alldivision.this, sher_item.class);
                        startActivity(intent);

                        break;

                    case 3:
                        intent = new Intent(alldivision.this, netro_item.class);
                        startActivity(intent);

                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }}




