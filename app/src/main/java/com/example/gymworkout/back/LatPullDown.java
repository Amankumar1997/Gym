package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class LatPullDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat_pull_down);
        VideoView lat=findViewById(R.id.lat);
        MediaController mediacontrollar=new MediaController(this);

        lat.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(lat);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Lat%20Pulldown%20Exercise_360p.mp4?alt=media&token=1a7aac58-3b07-4a0e-846c-b2d3cdea1340");
        lat.setVideoURI(uri);
        lat.start();
    }
}