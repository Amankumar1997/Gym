package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class CableBicepsCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cable_biceps_curl);
        VideoView videoView=findViewById(R.id.cable);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Cable%20Biceps%20Curl%20Exercise_360p.mp4?alt=media&token=e47c4dc6-8f41-4052-9af3-a465ee96b16c");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}