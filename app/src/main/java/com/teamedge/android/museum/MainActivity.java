package com.teamedge.android.museum;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer ring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ring = MediaPlayer.create(MainActivity.this,R.raw.ring);
//        ring.start();
    }
    public void openTraditionsActivity(View view){
//        ring.stop();
        Intent i = new Intent(this, traditions.class);
        startActivity(i);
    } public void openSingersActivity(View view){
        Intent i = new Intent(this, singers.class);
        startActivity(i);
    }
    public void openLandmarksActivity(View view){
        Intent i = new Intent(this, landmark.class);
        startActivity(i);
    }

}
