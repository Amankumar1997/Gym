package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ChinUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chin_up);
        VideoView videoView=findViewById(R.id.chin);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Chinup%20Exercise_360p.mp4?alt=media&token=fcf40122-0ce5-4e12-b1cd-46cc332cb6ac");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}