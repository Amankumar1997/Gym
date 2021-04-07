package com.example.gymworkout.triceps;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.gymworkout.R;

public class SingleArmDumbbellOverHead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_arm_dumbbell_over_head);
        VideoView videoView=findViewById(R.id.arm);
        MediaController mediacontrollar=new MediaController(this);

        videoView.setMediaController(mediacontrollar);
        mediacontrollar.setAnchorView(videoView);
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/firbaseauthentication-aea98.appspot.com/o/triceps%2Fy2mate.com%20-%20Single%20Arm%20Dumbbell%20Overhead%20Triceps%20Extension%20Exercise_360p.mp4?alt=media&token=8e9fc521-9e02-4e6b-a3fe-832f8ff63408");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}