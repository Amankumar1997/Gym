package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class BacSquatExcerSize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac_squat_excer_size);
        VideoView videoView=findViewById(R.id.job);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Back%20Squat%20Exercise_360p.mp4?alt=media&token=13635537-2aff-4ae5-9f74-04556a3f07a3");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}