package com.example.gymworkout.calf;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class AnkleCircle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankle_circle);
        VideoView videoView=findViewById(R.id.ankle);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/calf%2Fy2mate.com%20-%20Ankle%20Circles%20Exercise_360p.mp4?alt=media&token=5d9e641c-2b73-4ea5-b6b9-ac1e0835e286");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}