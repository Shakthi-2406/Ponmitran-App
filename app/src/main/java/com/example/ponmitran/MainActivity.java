package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);

        login.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,menu1.class);
            startActivity(i);

        });
    }
}