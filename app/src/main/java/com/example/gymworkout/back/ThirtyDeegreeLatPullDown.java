package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ThirtyDeegreeLatPullDown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_deegree_lat_pull_down);
        VideoView videoView=findViewById(R.id.thirty);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%2030%20Degree%20Lat%20Pulldown%20Exercise_360p.mp4?alt=media&token=de913c4a-336f-4e8f-aad5-bab33bd622f1");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}