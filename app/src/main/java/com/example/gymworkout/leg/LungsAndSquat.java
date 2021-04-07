package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class LungsAndSquat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lungs_and_squat);
        VideoView videoView=findViewById(R.id.ravan);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Lunges%20and%20squats%20Exercises%20for%20legs%20%20butt_360p.mp4?alt=media&token=f21f7738-ccd7-442d-acce-b46b0e09cc8a");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}