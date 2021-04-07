package com.example.gymworkout.back;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class NuetralGripPullUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuetral_grip_pull_up);
        VideoView nuetral=findViewById(R.id.nuetral);
        MediaController mediacontrollar=new MediaController(this);

        nuetral.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(nuetral);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/back%2Fy2mate.com%20-%20Neutral%20Grip%20Pullup%20Exercise_360p.mp4?alt=media&token=f17d3975-57f5-4566-b6dd-ae24463f3361");
       nuetral.setVideoURI(uri);
        nuetral.start();
    }
}