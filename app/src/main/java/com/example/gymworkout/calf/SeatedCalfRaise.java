package com.example.gymworkout.calf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class SeatedCalfRaise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seated_calf_raise);
        VideoView videoView=findViewById(R.id.seated);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/calf%2Fy2mate.com%20-%20Seated%20Calf%20Raise%20Exercise_360p.mp4?alt=media&token=4ae7d758-68d0-4125-9de5-c94565296acd");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}