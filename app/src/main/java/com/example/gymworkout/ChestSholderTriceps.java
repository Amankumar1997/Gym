package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ChestSholderTriceps extends AppCompatActivity {
VideoView chestshouldertricps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_sholder_triceps);
        MediaController mediacontrollar=new MediaController(this);
        chestshouldertricps=findViewById(R.id.chestshouldertricps);

        chestshouldertricps.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(chestshouldertricps);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/y2mate.com%20-%20Chest%20Shoulders%20%20Triceps_360p.mp4?alt=media&token=f9b218fb-79a0-4746-af5f-56b0ffe351ce");
        chestshouldertricps.setVideoURI(uri);
        chestshouldertricps.start();
    }
}