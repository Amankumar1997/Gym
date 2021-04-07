package com.example.gymworkout.forearm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BarbellReverseWristCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_reverse_wrist_curl);
        VideoView  videoView=findViewById(R.id.bar);
        MediaController mediacontrollar=new MediaController(this);
        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/forearm%2Fy2mate.com%20-%20Barbell%20Reverse%20Wrist%20Curl%20Exercise_360p.mp4?alt=media&token=acea3979-85c6-4e63-be93-640b724b4462");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}