package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mp = MediaPlayer.create(this, R.raw.janji_manis);
    }


    public void playSong(View v) {
        mp.start();
    }
    public void pauseSong(View v) {
        mp.pause();
    }

    public void stopSong(View v) {
        mp.stop();
        mp=MediaPlayer.create(this, R.raw.janji_manis);
    }

}