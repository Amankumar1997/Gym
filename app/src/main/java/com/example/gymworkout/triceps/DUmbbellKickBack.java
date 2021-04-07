package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DUmbbellKickBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_umbbell_kick_back);
        VideoView videoView=findViewById(R.id.kickback);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Dumbbell%20Kickback%20Exercise_360p.mp4?alt=media&token=38bd1ceb-467b-4364-8434-5f619f176d4a");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}