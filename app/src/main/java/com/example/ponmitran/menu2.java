package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        ImageButton cow = findViewById(R.id.cowbutton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.moo);
        cow.setOnClickListener(view -> {
            mp.start();
        });
    }
}