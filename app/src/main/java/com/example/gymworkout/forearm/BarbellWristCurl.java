package com.example.gymworkout.forearm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbellWristCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_wrist_curl);
        VideoView videoView=findViewById(R.id.barb);
        MediaController mediacontrollar=new MediaController(this);
        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/forearm%2Fy2mate.com%20-%20Barbell%20Wrist%20Curl%20Exercise_360p.mp4?alt=media&token=6207acfd-f96e-426d-b0df-8072c972c3fa");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}