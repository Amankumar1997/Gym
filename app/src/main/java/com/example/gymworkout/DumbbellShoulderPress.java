package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class DumbbellShoulderPress extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell_shoulder_press);
        videoView=findViewById(R.id.dumbbellshoulderpress);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/Dumbbell%20Shoulder%20Press%20Staggered%20Stance.mp4?alt=media&token=fedf2e3f-c5ab-4c78-9a02-9f358bc7b595");
       videoView.setVideoURI(uri);
       videoView.start();
    }
}