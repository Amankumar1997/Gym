package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ScapularRetraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scapular_retraction);
        VideoView scapular=findViewById(R.id.scapular);
        MediaController mediacontrollar=new MediaController(this);

        scapular.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(scapular);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Scapular%20Retraction%20Exercise_360p.mp4?alt=media&token=c19e3bba-feea-41ae-be12-5d12d37b75b0");
        scapular.setVideoURI(uri);
        scapular.start();
    }
}