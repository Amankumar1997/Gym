package com.example.gymworkout.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class KneelingobliqueCablecrunch extends AppCompatActivity {
VideoView kneelingobliqecrunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kneelingoblique_cablecrunch);

        kneelingobliqecrunch=findViewById(R.id.kneelingobliqecrunch);
        MediaController mediacontrollar=new MediaController(this);

        kneelingobliqecrunch.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(kneelingobliqecrunch);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/abs%2Fy2mate.com%20-%20Kneeling%20Oblique%20Cable%20Crunch%20Exercise_360p.mp4?alt=media&token=fba2b9a0-3b11-40c3-8bd3-2a5b684cdb6c");
        kneelingobliqecrunch.setVideoURI(uri);
        kneelingobliqecrunch.start();


    }
}