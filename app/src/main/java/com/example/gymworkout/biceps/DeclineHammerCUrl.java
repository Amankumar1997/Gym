package com.example.gymworkout.biceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class DeclineHammerCUrl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decline_hammer_c_url);
        VideoView videoView=findViewById(R.id.dec);

        MediaController mediacontrollar=new MediaController(this);


        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/biceps%2Fy2mate.com%20-%20Decline%20Hammer%20Curl%20Exercise_360p.mp4?alt=media&token=9d5de93f-6edd-4e46-8b72-39ea9cb3f047");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}