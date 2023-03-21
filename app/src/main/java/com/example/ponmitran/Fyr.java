package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import android.os.Bundle;

public class Fyr extends AppCompatActivity {

    String[] age = { "select the age", "below 2 years", "2 - 3 years", "3 - 5 years", "5 - 7 years", "above 7 years"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyr);

        Spinner spin = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,age);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }
}



