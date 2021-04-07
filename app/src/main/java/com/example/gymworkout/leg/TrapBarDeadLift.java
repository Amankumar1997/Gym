package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class TrapBarDeadLift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trap_bar_dead_lift);
        VideoView videoView=findViewById(R.id.trap);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20Trap%20Bar%20Deadlift_360p.mp4?alt=media&token=aba175fb-948d-4f34-a0b5-4f12d0a6d54c");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}