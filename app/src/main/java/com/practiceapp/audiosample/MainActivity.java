package com.practiceapp.audiosample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    public void playit(View view){
        player.start();
    }
    public void stopit(View view){
        player.stop();
    }
    public void pauseit(View view){
        player.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player=MediaPlayer.create(this,R.raw.naruto);
    }
}