package com.example.gymworkout.leg;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class HowToHavePerfactLeg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_have_perfact_leg);
        VideoView videoView=findViewById(R.id.perfact);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/leg%2Fy2mate.com%20-%20How%20To%20Have%20Perfect%20Legs%20Wall%20Sit_360p.mp4?alt=media&token=4bf170a4-86d0-4017-b3d5-2134773d0e85");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}