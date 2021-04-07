package com.example.gymworkout.forearm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class ReverseEzBarCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_ez_bar_curl);
        VideoView videoView=findViewById(R.id.ez);
        MediaController mediacontrollar=new MediaController(this);
        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/forearm%2Fy2mate.com%20-%20Reverse%20EZ%20Bar%20Curl%20Exercise_360p.mp4?alt=media&token=4e4bb137-23af-4d15-9a8d-75d13e10afec");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}