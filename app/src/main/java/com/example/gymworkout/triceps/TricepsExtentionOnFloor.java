package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class TricepsExtentionOnFloor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_extention_on_floor);
        VideoView videoView=findViewById(R.id.extention);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Triceps%20Extension%20on%20Floor%20Exercise_360p.mp4?alt=media&token=3d546d1b-30cf-4e68-b79e-13c2cd7dc14b");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}